import java.util.ArrayList;
import java.util.Scanner;

public class ScheduleManager {
	Scanner input;
	Schedule schedule;
	ArrayList<Schedule> scheduleList = new ArrayList<Schedule>();
	
	ScheduleManager(Scanner input){
		this.input = input;
	}
	
	public void addScheduleList(Schedule schedule) {
		scheduleList.add(schedule);
	}
	
	public void deleteScheduleList(Schedule schedule) {
		scheduleList.remove(schedule);
	}
	
	public void searchScheduleList(Schedule schedule, String name) {
		for(int i = 0; i < scheduleList.size(); i++) {
			if(scheduleList.get(i).name.equals(name)) {
				this.schedule = scheduleList.get(i);
				break;
			}else {
				schedule = null;
			}
		}
	}
	
	public void addSchedules() {
		this.schedule = new Schedule();
		System.out.print("Input the date: ");
		schedule.date = input.nextInt();
		
		System.out.print("Input the time: ");
		schedule.time = input.next();
		                  
		System.out.print("Schedule Name: ");
		input.nextLine();
		schedule.name = input.nextLine();
		
		System.out.print("Schedule Content: ");
		schedule.content = input.nextLine(); 
		
		addScheduleList(schedule);
		System.out.println("The new schedule is added.");         
	}
	public void deleteSchedules() {  
		System.out.print("Input the Schedule Name you want to delete: ");
		input.nextLine();
		String name = input.nextLine();
		searchScheduleList(schedule, name);
		if(schedule == null) {
			System.out.println("The schedule doesn't exist.");
			return;
		}
		if(schedule.name.equals(name)) {
			deleteScheduleList(schedule);
			schedule = null;
			System.out.println("The schedule is deleted.");
		}
	}
    public void editSchedules() {    
		System.out.print("Input the Schedule Name you want to edit: ");
		input.nextLine();
		String name = input.nextLine();
		searchScheduleList(schedule, name);
		if(schedule == null) {
			System.out.println("The schedule doesn't exist.");
			return;
		}
		if(schedule.name.equals(name)) {
			System.out.println();
			System.out.println("The schedule to be edited is " + name);
			System.out.println("[Schedule Edit Menu]");
			System.out.println("1. date");
			System.out.println("2. time");
			System.out.println("3. name");
			System.out.println("4. content");
			System.out.print("Input one of the numbers: ");
			int num = input.nextInt();
			if(num == 1) {
				System.out.print("Input the new date: ");
				int newdate = input.nextInt();
				schedule.date = newdate;
				System.out.print("Edit Complete.");
			}else if(num == 2) {
				System.out.print("Input the new time: ");
				String newtime = input.next();
				schedule.time = newtime;
				System.out.print("Edit Complete.");
			}else if(num == 3) {
				System.out.print("Input the new name: ");
				String newname = input.nextLine();
				schedule.name = newname;
				System.out.print("Edit Complete.");
			}else if(num == 4) {
				System.out.print("Input the new content: ");
				String newcontent = input.nextLine();
				schedule.content = newcontent;
				System.out.print("Edit Complete.");
			}
		}
	}
    public void viewSchedules() {
    	System.out.print("Input the Schedule Name you want to view: ");
		input.nextLine();
		String name = input.nextLine();
		searchScheduleList(schedule, name);
    	if(schedule == null) {
			System.out.println("The schedule doesn't exist.");
			return;
		}
		if(schedule.name.equals(name)) {
			 schedule.printInfo();
		}
	}
}
