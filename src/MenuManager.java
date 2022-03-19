import java.util.Scanner;    //Scanner타입의 input 메모리 공간을 사용하기 위해 작성

public class MenuManager {   //기본 default package에 MenuManager class를 생성하였고 이를 작성함.
	                         //아래는 class에 작성한 코드임.
	public static void main(String[] args) {     //main 함수
		Scanner input = new Scanner(System.in);  //input에 사용자의 입력을 받을 수 있는 메모리 공간 생성
		
		for(;;) {                  //for을 이용한 무한 loop 
			System.out.println();  //콘솔에서 가독성을 높이기 위해 줄바꿈을 한번 함.
			System.out.println("[My Schedules Management System Menu]"); //메뉴 이름 출력 문장
			System.out.println("1. Add Schedules");     //스케줄 추가 문장 출력
			System.out.println("2. Delete Schedules");  //스케줄 삭제 문장 출력
			System.out.println("3. Edit Schedules");    //스케줄 편집 문장 출력
			System.out.println("4. View Schedules");    //스케줄 보기 문장 출력
			System.out.println("5. show a menu");       //메뉴 보기 문장 출력
			System.out.println("6. Exit");              //종료 문장 출력
			
			System.out.print("Input one of the numbers: ");  //원하는 메뉴의 번호를 입력하라는 문장 출력
			int num = input.nextInt();   //콘솔에서 사용자에게 정수를 입력받아 int형 변수 num에 저장
			
			switch(num) {                //switch문을 사용하여 num에 저장된 정수에 따라 다른 case가 실행되게 함.
			case 1:                      //num이 1일 때 실행
				AddSchedules();          //함수 AddSchedules()로 이동
				break;                   //break로 switch문 탈출
			case 2:                      //num이 2일 때 실행
				DeleteSchedules();       //함수 DeleteSchedules()로 이동
				break;                   //break로 switch문 탈출
			case 3:                      //num이 2일 때 실행
				EditSchedules();         //함수 EditSchedules()로 이동
				break;                   //break로 switch문 탈출
			case 4:                      //num이 2일 때 실행
				ViewSchedules();         //함수 ViewSchedules()로 이동
				break;                   //break로 switch문 탈출
			case 5:                      //num이 2일 때 실행
				break;                   //break로 switch문 탈출
			case 6:                      //num이 2일 때 실행
				System.out.println("[Exit]");
				return;                  //메뉴 6번은 종료이므로 return으로 프로그램 곧바로 종료
			default:                     //num의 값이 어떤 case에도 해당되지 않을 때 실행
				System.out.println("You input the wrong number.");  //잘못 입력했다는 문장 출력
				System.out.println("Try again.");                   //다시 시도하기를 요청하는 문장 출력
				break;                                              //break으로 switch 탈출 탈출 후에는 for문에 의해 다시 메뉴가 출력될 것임.
			} //break를 만나면 여기로 나온다 그 후 for문에 의해 메뉴가 다시 출력된다.
		}
	}
	public static void AddSchedules() {          //AddSchedules() 함수
		Scanner input = new Scanner(System.in);  //input에 사용자의 입력을 받을 수 있는 메모리 공간 생성(새로운 함수라서 다시 생성한다.)
		System.out.println("Input the date.");   //날짜 입력 지시문장 출력
		System.out.print("year: ");              //'년도' 입력 지시문장 출력
		int year = input.nextInt();              //정수값을 콘솔로 입력받아 year에 저장
		System.out.print("month: ");             //'월' 입력 지시문장 출력
		int month = input.nextInt();             //정수값을 콘솔로 입력받아 month에 저장
		System.out.print("day: ");               //'일' 입력 지시문장 출력
		int day = input.nextInt();               //정수값을 콘솔로 입력받아 day에 저장
		
		System.out.println("Input the time.");   //시간 입력 지시문장 출력
		System.out.print("hour: ");              //'시' 입력 지시문장 출력
		String hour = input.next();              //문자 하나를 콘솔로 입력받아 hour에 저장
		System.out.print("minute: ");            //'분' 입력 지시문장 출력
		String minute = input.next();            //문자 하나를 콘솔로 입력받아 minute에 저장
		//여기서 시간을 String으로 입력받은 이유는 출력할 때 01:00과 같이 정각을 표현하기 위해서이다. 정수형을 쓰면 0이 하나 사라진다.
		input.nextLine();                        //아래의 input.nextLine()이 생략되는 것을 막기 위해 작성함.
		System.out.print("Schedule Name: ");     //스케줄 이름 입력 지시문장 출력
		String ScheduleName= input.nextLine();   //스케줄 이름을 문장으로 입력받아 ScheduleName에 저장
		
		System.out.println("Date: " + year + "." + month + "." + day);  //입력한 날짜를 출력 -> +를 이용하여 한 문장으로 표현
		System.out.println("Time: " + hour + ":" + minute);             //입력한 시간를 출력 -> +를 이용하여 한 문장으로 표현
		System.out.println("Schedule Name: " + ScheduleName);           //입력한 스케줄 이름를 출력
	}
	public static void DeleteSchedules() {  //DeleteSchedules() 함수
		//일정을 삭제하는 코드
	}
    public static void EditSchedules() {    //EditSchedules() 함수
    	//일정을 수정하는 코드
	}
    public static void ViewSchedules() {    //ViewSchedules() 함수
    	//일정을 보여주는 코드
    	//원하면 세부사항을 보여주는 코드
	}
}