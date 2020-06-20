import javax.management.AttributeChangeNotification;
import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;

public class Info extends NotificationBroadcasterSupport implements InfoMBean {
    int totalPoints;
	int missPoints;
    int sequenceNumber;

    public Info() {
        totalPoints = 0;
		missPoints = 0;
        sequenceNumber = 1;
    }

    public int getTotalPointsCount() {
        return totalPoints;
    }

    public int getMissPointsCount() {
        return missPoints;
    }

    public void addResult(boolean result) {
        totalPoints += 1;
		if (!result){
			++missPoints;
		}
		if (totalPoints % 10 == 0){
			Notification n = new AttributeChangeNotification(
				this,                       // source
                sequenceNumber++,           // ord number
                System.currentTimeMillis(), // timestamp
                "You checked 10 points",	// message
                "totalPoints",        		// var name
                "int",                      // var type
                totalPoints,                // oldValue - An object representing value of the attribute before the change.
                totalPoints                 // newValue - An object representing value of the attribute after the change.
			);
			sendNotification(n);
			
		}
    }
}
