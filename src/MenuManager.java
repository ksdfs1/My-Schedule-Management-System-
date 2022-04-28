//���α׷��� ����Ǹ� �޴��� ����ϰ� ����ڷκ��� �޴� ������ �޴� MenuManager Ŭ����
import java.util.Scanner;    

public class MenuManager {  
	                         
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  //Scanner Ÿ�� ��ü input�� �����ϰ� �޸� �Ҵ�
		ScheduleManager scheduleManager = new ScheduleManager(input);  //input�� �����Ͽ� �״�� ScheduleManager Ŭ���������� �� �� �ְ� ��.
		
		for(;;) {                   
			System.out.println();  //�ٹٲ޿�
			System.out.println("[My Schedules Management System Menu]");  //�޴� ���
			System.out.println("1. Add Schedule");     
			System.out.println("2. Delete Schedule");  
			System.out.println("3. Edit Schedule");    
			System.out.println("4. View Schedules");          
			System.out.println("5. Exit");             
			System.out.print("Input one of the numbers: "); 
			int num = input.nextInt(); 
			System.out.println();
			
			switch(num) {                
			case 1:
				scheduleManager.addSchedule();  //scheduleManager Ŭ������ �ִ� addSchedules()�� �ҷ� ���� �߰�
				break;                   
			case 2:                     
				scheduleManager.deleteSchedule();  //scheduleManager Ŭ������ �ִ� deleteSchedules()�� �ҷ� ���� ����
				break;                   
			case 3:                     
				scheduleManager.editSchedule();  //scheduleManager Ŭ������ �ִ� editSchedules()�� �ҷ� ���� ����    
				break;                   
			case 4:                      
				scheduleManager.viewSchedules();  //scheduleManager Ŭ������ �ִ� viewSchedules()�� �ҷ� ���� ����
				break;                                     
			case 5:                      
				System.out.println("[Exit]");   //���α׷� ����
				return;                 
			default:                     
				System.out.println("You input the wrong number.");   //��õ� ����
				System.out.println("Try again.");                   
				break;                                              
			} 
		}
	}
}