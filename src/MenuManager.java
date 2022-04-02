import java.util.Scanner;    

public class MenuManager {  
	                         
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  //Scanner 타입 객체 input을 선언하고 메모리 할당
		ScheduleManager scheduleManager = new ScheduleManager(input);  //input을 전달하여 그대로 ScheduleManager 클래스에서도 쓸 수 있게 함.
		
		for(;;) {                   
			System.out.println();  //줄바꿈용
			System.out.println("[My Schedules Management System Menu]");  //메뉴 출력
			System.out.println("1. Add Schedules");     
			System.out.println("2. Delete Schedules");  
			System.out.println("3. Edit Schedules");    
			System.out.println("4. View Schedules");          
			System.out.println("5. Exit");             
			System.out.print("Input one of the numbers: "); 
			int num = input.nextInt();   
			
			switch(num) {                
			case 1:
				scheduleManager.addSchedules();  //scheduleManager 클래스에 있는 addSchedules()를 불러 일정 추가
				break;                   
			case 2:                     
				scheduleManager.deleteSchedules();  //scheduleManager 클래스에 있는 deleteSchedules()를 불러 일정 삭제
				break;                   
			case 3:                     
				scheduleManager.editSchedules();  //scheduleManager 클래스에 있는 editSchedules()를 불러 일정 편집    
				break;                   
			case 4:                      
				scheduleManager.viewSchedules();  //scheduleManager 클래스에 있는 viewSchedules()를 불러 일정 보기
				break;                                     
			case 5:                      
				System.out.println("[Exit]");   //프로그램 종료
				return;                 
			default:                     
				System.out.println("You input the wrong number.");   //재시도 지시
				System.out.println("Try again.");                   
				break;                                              
			} 
		}
	}
}