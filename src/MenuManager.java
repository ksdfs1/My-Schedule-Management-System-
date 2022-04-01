import java.util.Scanner;    

public class MenuManager {  
	                         
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ScheduleManager scheduleManager = new ScheduleManager(input);
		
		for(;;) {                   
			System.out.println();  
			System.out.println("[My Schedules Management System Menu]"); 
			System.out.println("1. Add Schedules");     
			System.out.println("2. Delete Schedules");  
			System.out.println("3. Edit Schedules");    
			System.out.println("4. View Schedules");          
			System.out.println("5. Exit");             
			System.out.print("Input one of the numbers: "); 
			int num = input.nextInt();   
			
			switch(num) {                
			case 1:
				scheduleManager.addSchedules();         
				break;                   
			case 2:                     
				scheduleManager.deleteSchedules();       
				break;                   
			case 3:                     
				scheduleManager.editSchedules();         
				break;                   
			case 4:                      
				scheduleManager.viewSchedules();         
				break;                                     
			case 5:                      
				System.out.println("[Exit]");
				return;                 
			default:                     
				System.out.println("You input the wrong number.");  
				System.out.println("Try again.");                   
				break;                                              
			} 
		}
	}
}