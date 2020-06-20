import java.util.Scanner;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.InputMismatchException;
public class Lab3 {	
    public static void main(String[] args) {
		Info infoBean = new Info();
		Square squareBean = new Square();
		try {
			MBeanServer server = ManagementFactory.getPlatformMBeanServer();
			ObjectName name = new ObjectName("lab_se_4.beans:type=Info");
			server.registerMBean(infoBean, name);
		} catch (Exception e) {
			System.exit(1);
		}
		try {
			MBeanServer server = ManagementFactory.getPlatformMBeanServer();
			ObjectName name = new ObjectName("lab_se_4.beans:type=Square");			
			server.registerMBean(squareBean, name);
		} catch (Exception e) {
			System.exit(1);
		}
		while (true){
			Scanner in = new Scanner(System.in);
			try {
				System.out.println("EnterX");
				double x = in.nextDouble();
				System.out.println("EnterY");
				double y = in.nextDouble();
				System.out.println("EnterR");
				double r = in.nextDouble();
			
				Point point = new Point(x, y, r);
				System.out.print("Square is:");
				squareBean.getAreaSquare(r);
				System.out.println("InArea");

				if (point.isInArea()) {
					System.out.println("InArea");
					infoBean.addResult(true);

				}
				else{
					System.out.println("NotInArea");
					infoBean.addResult(false);
				}
				System.out.println("---------------------------------------");
				
				
			}
		 catch (InputMismatchException e) {
				System.out.print("EnterDouble");
			}
    }
	}
}
