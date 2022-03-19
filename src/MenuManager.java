import java.util.Scanner;    //ScannerŸ���� input �޸� ������ ����ϱ� ���� �ۼ�

public class MenuManager {   //�⺻ default package�� MenuManager class�� �����Ͽ��� �̸� �ۼ���.
	                         //�Ʒ��� class�� �ۼ��� �ڵ���.
	public static void main(String[] args) {     //main �Լ�
		Scanner input = new Scanner(System.in);  //input�� ������� �Է��� ���� �� �ִ� �޸� ���� ����
		
		for(;;) {                  //for�� �̿��� ���� loop 
			System.out.println();  //�ֿܼ��� �������� ���̱� ���� �ٹٲ��� �ѹ� ��.
			System.out.println("[My Schedules Management System Menu]"); //�޴� �̸� ��� ����
			System.out.println("1. Add Schedules");     //������ �߰� ���� ���
			System.out.println("2. Delete Schedules");  //������ ���� ���� ���
			System.out.println("3. Edit Schedules");    //������ ���� ���� ���
			System.out.println("4. View Schedules");    //������ ���� ���� ���
			System.out.println("5. show a menu");       //�޴� ���� ���� ���
			System.out.println("6. Exit");              //���� ���� ���
			
			System.out.print("Input one of the numbers: ");  //���ϴ� �޴��� ��ȣ�� �Է��϶�� ���� ���
			int num = input.nextInt();   //�ֿܼ��� ����ڿ��� ������ �Է¹޾� int�� ���� num�� ����
			
			switch(num) {                //switch���� ����Ͽ� num�� ����� ������ ���� �ٸ� case�� ����ǰ� ��.
			case 1:                      //num�� 1�� �� ����
				AddSchedules();          //�Լ� AddSchedules()�� �̵�
				break;                   //break�� switch�� Ż��
			case 2:                      //num�� 2�� �� ����
				DeleteSchedules();       //�Լ� DeleteSchedules()�� �̵�
				break;                   //break�� switch�� Ż��
			case 3:                      //num�� 2�� �� ����
				EditSchedules();         //�Լ� EditSchedules()�� �̵�
				break;                   //break�� switch�� Ż��
			case 4:                      //num�� 2�� �� ����
				ViewSchedules();         //�Լ� ViewSchedules()�� �̵�
				break;                   //break�� switch�� Ż��
			case 5:                      //num�� 2�� �� ����
				break;                   //break�� switch�� Ż��
			case 6:                      //num�� 2�� �� ����
				System.out.println("[Exit]");
				return;                  //�޴� 6���� �����̹Ƿ� return���� ���α׷� ��ٷ� ����
			default:                     //num�� ���� � case���� �ش���� ���� �� ����
				System.out.println("You input the wrong number.");  //�߸� �Է��ߴٴ� ���� ���
				System.out.println("Try again.");                   //�ٽ� �õ��ϱ⸦ ��û�ϴ� ���� ���
				break;                                              //break���� switch Ż�� Ż�� �Ŀ��� for���� ���� �ٽ� �޴��� ��µ� ����.
			} //break�� ������ ����� ���´� �� �� for���� ���� �޴��� �ٽ� ��µȴ�.
		}
	}
	public static void AddSchedules() {          //AddSchedules() �Լ�
		Scanner input = new Scanner(System.in);  //input�� ������� �Է��� ���� �� �ִ� �޸� ���� ����(���ο� �Լ��� �ٽ� �����Ѵ�.)
		System.out.println("Input the date.");   //��¥ �Է� ���ù��� ���
		System.out.print("year: ");              //'�⵵' �Է� ���ù��� ���
		int year = input.nextInt();              //�������� �ַܼ� �Է¹޾� year�� ����
		System.out.print("month: ");             //'��' �Է� ���ù��� ���
		int month = input.nextInt();             //�������� �ַܼ� �Է¹޾� month�� ����
		System.out.print("day: ");               //'��' �Է� ���ù��� ���
		int day = input.nextInt();               //�������� �ַܼ� �Է¹޾� day�� ����
		
		System.out.println("Input the time.");   //�ð� �Է� ���ù��� ���
		System.out.print("hour: ");              //'��' �Է� ���ù��� ���
		String hour = input.next();              //���� �ϳ��� �ַܼ� �Է¹޾� hour�� ����
		System.out.print("minute: ");            //'��' �Է� ���ù��� ���
		String minute = input.next();            //���� �ϳ��� �ַܼ� �Է¹޾� minute�� ����
		//���⼭ �ð��� String���� �Է¹��� ������ ����� �� 01:00�� ���� ������ ǥ���ϱ� ���ؼ��̴�. �������� ���� 0�� �ϳ� �������.
		input.nextLine();                        //�Ʒ��� input.nextLine()�� �����Ǵ� ���� ���� ���� �ۼ���.
		System.out.print("Schedule Name: ");     //������ �̸� �Է� ���ù��� ���
		String ScheduleName= input.nextLine();   //������ �̸��� �������� �Է¹޾� ScheduleName�� ����
		
		System.out.println("Date: " + year + "." + month + "." + day);  //�Է��� ��¥�� ��� -> +�� �̿��Ͽ� �� �������� ǥ��
		System.out.println("Time: " + hour + ":" + minute);             //�Է��� �ð��� ��� -> +�� �̿��Ͽ� �� �������� ǥ��
		System.out.println("Schedule Name: " + ScheduleName);           //�Է��� ������ �̸��� ���
	}
	public static void DeleteSchedules() {  //DeleteSchedules() �Լ�
		//������ �����ϴ� �ڵ�
	}
    public static void EditSchedules() {    //EditSchedules() �Լ�
    	//������ �����ϴ� �ڵ�
	}
    public static void ViewSchedules() {    //ViewSchedules() �Լ�
    	//������ �����ִ� �ڵ�
    	//���ϸ� ���λ����� �����ִ� �ڵ�
	}
}