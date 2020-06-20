import javax.management.NotificationBroadcaster;

public interface InfoMBean extends NotificationBroadcaster {
    int getTotalPointsCount();
    int getMissPointsCount();
    void addResult(boolean result);
}