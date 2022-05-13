//프로그램이 실행되면 메뉴를 출력하고 사용자로부터 메뉴 선택을 받는 MenuManager 클래스 
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ScheduleManager scheduleManager = new ScheduleManager(input);
		selectMenu(scheduleManager, input);
	}
	
	public static void selectMenu(ScheduleManager scheduleManager, Scanner input) {
		for(;;) {
			try {
				showMenu();
				int num = input.nextInt(); 
				switch(num) {
				case 1:
					scheduleManager.addSchedule();
					break;
				case 2:
					scheduleManager.deleteSchedule();
					break;
				case 3:
					scheduleManager.editSchedule();    
					break;
				case 4:
					scheduleManager.viewSchedules();
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
}