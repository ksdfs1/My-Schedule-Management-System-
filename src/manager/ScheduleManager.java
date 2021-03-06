package manager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Schedule.Assignment;
import Schedule.Course;
import Schedule.Exam;
import Schedule.Promise;
import Schedule.ScheduleCategory;
import Schedule.ScheduleInput;

//일정을 관리하는 클래스
public class ScheduleManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1639553928036555615L;
	
	transient Scanner input;
	public ArrayList<ScheduleInput> scheduleList = new ArrayList<ScheduleInput>();

	ScheduleManager() {

	}

	ScheduleManager(Scanner input) {
		this.input = input;
	}
	
	public void addSchedule(ScheduleInput scheduleInput) {
		scheduleList.add(scheduleInput);
	}
	
	public void deleteSchedule(ScheduleInput scheduleInput) {
		scheduleList.remove(scheduleInput);
	}
	
	public void addSchedule() {
		int category = 0;
		ScheduleInput scheduleIn;
		while(category == 0 || category > 5) {
			try {
				showCategoryMenu();
				category = input.nextInt();
				switch(category) {
				case 1:
					scheduleIn = new Course(ScheduleCategory.Course);
					addToScheduleList(scheduleIn, input);
					break;
				case 2:
					scheduleIn = new Assignment(ScheduleCategory.Assignment);
					addToScheduleList(scheduleIn, input);
					break;
				case 3:
					scheduleIn = new Exam(ScheduleCategory.Exam);
					addToScheduleList(scheduleIn, input);
					break;
				case 4:
					scheduleIn = new Promise(ScheduleCategory.Promise);
					addToScheduleList(scheduleIn, input);
					break;
				case 5:
					System.out.println("Cancel adding.");
					return;
				default:
					System.out.println("You input the wrong num. Try again.");
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				category = 0;
			}
		}
		System.out.println("The schedule is added.");
	}
	
	public void deleteSchedule() {
		if(!scheduleList.isEmpty()) {
			viewSchedules();
			System.out.print("Input the Schedule number you want to delete: ");
			int scheduleNum = input.nextInt();
			if(scheduleNum > scheduleList.size()) {
				System.out.println("The schedule doesn't exist.");
			}else{
				scheduleList.remove(scheduleNum - 1);
				System.out.println("The schedule is deleted.");
			}
		}else {
			System.out.println("The scheduleList is empty.");
		}
	}

	public void editSchedule() {
		if(!scheduleList.isEmpty()) {
			viewSchedules();
			System.out.print("Input the Schedule number you want to edit: ");
			int scheduleNum = input.nextInt();
			if(scheduleNum > scheduleList.size()) {
				System.out.println("The schedule doesn't exist.");
			}else {
				System.out.println("The schedule number to be edited is " + scheduleNum);
				ScheduleInput scheduleIn = scheduleList.get(scheduleNum - 1);
				for(;;) {
					try {
						showEditMenu(scheduleNum);
						int num = input.nextInt();
						switch(num) {
						case 1:
							scheduleIn.setScheduleDate(input);
							break;
						case 2:
							scheduleIn.setScheduleTime(input);
							break;
						case 3:
							if(!scheduleIn.getCategory().toString().equals("Course") && 
							   !scheduleIn.getCategory().toString().equals("Assignment"))
								scheduleIn.setSchedulePlace(input);
							System.out.println("This Schedule doesn't have Place.");
							break;
						case 4:
							if(!scheduleIn.getCategory().toString().equals("Course") && 
							   !scheduleIn.getCategory().toString().equals("Assignment"))
								scheduleIn.setScheduleWho(input);
							System.out.println("This Schedule doesn't have Who.");
							break;
						case 5:
							scheduleIn.setScheduleContent(input);
							break;
						case 6:
							System.out.println("End editing.");
							return;
						default:
							System.out.println("You input the wrong number. Try again.");
							continue;
						}
						System.out.println("Edit complete.");
					}
					catch(InputMismatchException e) {
						System.out.println("Please put an integer between 1 and 6!");
						if(input.hasNext()) {
							input.next();
						}
					}
				}
			}
		}else {
			System.out.println("The scheduleList is empty.");
		}
	}

	public void viewSchedules() {
		if(!scheduleList.isEmpty()) {
			System.out.println("*** ScheduleList ***");
			for(int i = 0; i < scheduleList.size(); i++) {
				System.out.print((i + 1) + ". ");
				scheduleList.get(i).printInfo();
				System.out.println();
			}
		}else {
			System.out.println("The scheduleList is empty.");
		}
	}
	
	public int size() {
		return scheduleList.size();
	}
	
	public ScheduleInput get(int index) {
		return scheduleList.get(index);
	}
	
	//아래부터는 부속적인 메소드들
	public void addToScheduleList(ScheduleInput scheduleIn, Scanner input) {
		scheduleIn.getUserInput(input);
		scheduleList.add(scheduleIn);
	}

	public void showCategoryMenu() {
		System.out.println();
		System.out.println("1. for Course");
		System.out.println("2. for Assignment");
		System.out.println("3. for Exam");
		System.out.println("4. for Promise");
		System.out.println("5. Cancel adding");
		System.out.print("Select num for Schedule Category (1~5): ");
	}

	public void showEditMenu(int scheduleNum) {
		System.out.println();
		System.out.println("[Schedule Edit Menu]");
		System.out.println("1. Edit date");
		System.out.println("2. Edit time");
		System.out.println("3. Edit place");
		System.out.println("4. Edit who");
		System.out.println("5. Edit content");
		System.out.println("6. End editing");
		System.out.print("Input one of the numbers: ");
	}
}
