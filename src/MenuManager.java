import java.util.Scanner;    

public class MenuManager {  
	                         
	public static void main(String[] args) {     
		Scanner input = new Scanner(System.in);  
		
		for(;;) {                   
			System.out.println();  
			System.out.println("[My Schedules Management System Menu]"); 
			System.out.println("1. Add Schedules");     
			System.out.println("2. Delete Schedules");  
			System.out.println("3. Edit Schedules");    
			System.out.println("4. View Schedules");    
			System.out.println("5. show a menu");      
			System.out.println("6. Exit");             
			
			System.out.print("Input one of the numbers: "); 
			int num = input.nextInt();   
			
			switch(num) {                
			case 1:                      
				AddSchedules();         
				break;                   
			case 2:                     
				DeleteSchedules();       
				break;                   
			case 3:                     
				EditSchedules();         
				break;                   
			case 4:                      
				ViewSchedules();         
				break;                   
			case 5:                      
				break;                   
			case 6:                      
				System.out.println("[Exit]");
				return;                 
			default:                     
				System.out.println("You input the wrong number.");  
				System.out.println("Try again.");                   
				break;                                              
			} 
		}
	}
	public static void AddSchedules() {          
		Scanner input = new Scanner(System.in);  
		System.out.println("Input the date.");   
		System.out.print("year: ");              
		int year = input.nextInt();              
		System.out.print("month: ");             
		int month = input.nextInt();             
		System.out.print("day: ");               
		int day = input.nextInt();               
		
		System.out.println("Input the time.");   
		System.out.print("hour: ");              
		String hour = input.next();              
		System.out.print("minute: ");            
		String minute = input.next();            
		
		input.nextLine();                        
		System.out.print("Schedule Name: ");     
		String ScheduleName= input.nextLine();   
		
		System.out.println("Date: " + year + "." + month + "." + day);  
		System.out.println("Time: " + hour + ":" + minute);             
		System.out.println("Schedule Name: " + ScheduleName);           
	}
	public static void DeleteSchedules() {  
		Scanner input = new Scanner(System.in);        //Scanner ��ü ����
		System.out.print("Input the Schedule Name you want to delete: ");  //������ ������ �ۼ� �䱸���� ���
		String ScheduleName = input.nextLine();        //����ڷκ��� �Է¹޾Ƽ� ScheduleName�� ����
		//������ �����ϴ� �ڵ�
	}
    public static void EditSchedules() {    
    	Scanner input = new Scanner(System.in);        //Scanner ��ü ����
		System.out.print("Input the Schedule Name you want to edit: ");   //������ ������ �ۼ� �䱸���� ���
		String ScheduleName = input.nextLine();        //����ڷκ��� �Է¹޾Ƽ� ScheduleName�� ����
    	//������ �����ϴ� �ڵ�
	}
    public static void ViewSchedules() {    
    	//��� ������ �����ִ� �ڵ�
    	Scanner input = new Scanner(System.in);        //Scanner ��ü ����
		System.out.print("Input the Schedule Name you want to look at its details: ");  //���λ����� �� ������ �ۼ� �䱸���� ���
		String ScheduleName = input.nextLine();        //����ڷκ��� �Է¹޾Ƽ� ScheduleName�� ����
    	//���ϸ� ���λ����� �����ִ� �ڵ�
	}
}