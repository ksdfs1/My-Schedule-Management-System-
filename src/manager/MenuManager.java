package manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ScheduleManager scheduleManager = getObject("schedulemanager.ser");
		if(scheduleManager == null) {
			scheduleManager = new ScheduleManager(input);
		}else {
			scheduleManager.input = input;
		}
		
		WindowFrame frame = new WindowFrame(scheduleManager);  //frame »ý¼º
		selectMenu(scheduleManager, input); 
		putObject(scheduleManager, "schedulemanager.ser");
	}
	
	public static void selectMenu(ScheduleManager scheduleManager, Scanner input) {
		for(;;) {
			try {
				showMenu();
				int num = input.nextInt(); 
				switch(num) {
				case 1:
					scheduleManager.addSchedule();
					logger.log("add a schedule");
					break;
				case 2:
					scheduleManager.deleteSchedule();
					logger.log("delete a schedule");
					break;
				case 3:
					scheduleManager.editSchedule();   
					logger.log("edit a schedule");
					break;
				case 4:
					scheduleManager.viewSchedules();
					logger.log("view a list of schedule");
					break;
				case 5:
					System.out.println("[Exit]");
					return;
				default:
					System.out.println("You input the wrong number. Try again.");                
					break;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
			}
		}
	}
	
	public static void showMenu() {
		System.out.println();
		System.out.println("[My Schedules Management System Menu]");
		System.out.println("1. Add Schedule");
		System.out.println("2. Delete Schedule");
		System.out.println("3. Edit Schedule");
		System.out.println("4. View Schedules");
		System.out.println("5. Exit");
		System.out.print("Input one of the numbers: ");
	}
	
	public static ScheduleManager getObject(String fileName) {
		ScheduleManager scheduleManager = null;
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			scheduleManager = (ScheduleManager)in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return scheduleManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return scheduleManager;
	}
	
	public static void putObject(ScheduleManager scheduleManager, String fileName) {
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(scheduleManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}