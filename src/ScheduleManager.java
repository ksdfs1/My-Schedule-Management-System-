import java.util.ArrayList;
import java.util.Scanner;

public class ScheduleManager {  //ScheduleManager 클래스
	Scanner input;      //필드의 변수들
	Schedule schedule;
	ArrayList<Schedule> scheduleList = new ArrayList<Schedule>();  //schedule 객체의 주소를 저장하는 리스트
	
	ScheduleManager(Scanner input){  //생성자를 통해 Manumanager에서 받은 input을 그대로 사용
		this.input = input;
	}
	
	public void addScheduleList(Schedule schedule) {  //리스트에 schedule 객체의 주소를 추가하는 함수
		scheduleList.add(schedule);
	}
	
	public void deleteScheduleList(Schedule schedule) {  //리스트에 schedule 객체의 주소를 삭제하는 함수
		scheduleList.remove(schedule);
	}
	
	public void searchScheduleList(String name) {  //리스트에 있는 schedule 객체의 주소 중 원하는 주소를 찾는 함수
		for(int i = 0; i < scheduleList.size(); i++) {  //for문으로 리스트 전체를 한 번씩 검사
			if(scheduleList.get(i).name.equals(name)) {  //만약 리스트 인덱스의 주소값의 name이 사용자가 입력한 name이랑 같으면 
				this.schedule = scheduleList.get(i);     //여기 필드의 schedule의 값에 그 인덱스의 주소값을 할당
				break;
			}else {  //일치하는 게 없으면 null을 할당
				this.schedule = null;
			}
		}
	}
	
	public void addSchedules() {  //일정 추가 함수
		this.schedule = new Schedule();  //새로운 Schedule 타입 schedule 객체 생성
		System.out.print("Input the date: ");  //아래는 사용자에게 필드값에 넣을 값을 받는 문장들임
		schedule.date = input.nextInt();
		
		System.out.print("Input the time: ");
		schedule.time = input.next();
		                  
		System.out.print("Schedule Name: ");
		input.nextLine();  //아래의 nextLine이 생략되는 현상 방지용
		schedule.name = input.nextLine();
		
		System.out.print("Schedule Content: ");
		schedule.content = input.nextLine(); 
		
		addScheduleList(schedule);  //addScheduleList() 함수로 리스트 현재 schedule 객체의 주소 추가
		System.out.println("The new schedule is added.");         
	}
	public void deleteSchedules() {  //일정 삭제 함수
		System.out.print("Input the Schedule Name you want to delete: ");  //삭제할 일정의 이름을 입력받음.
		input.nextLine();  //아래의 nextLine이 생략되는 현상 방지용
		String name = input.nextLine();
		searchScheduleList(name);  //searchScheduleList() 함수에서 현재 사용자가 입력한 name을 받아서 원하는 주소 찾아옴.
		if(schedule == null) { //schedule이 null이면 리턴하여 다시 하도록 함.
			System.out.println("The schedule doesn't exist.");
			return;
		}
		if(schedule.name.equals(name)) {  //schedule 객체의 name값이 입력받은 name 값과 같으면 실행
			deleteScheduleList(schedule);  //deleteScheduleList()로 리스트에 저장되어 있는 해당 주소 삭제
			schedule = null;              //현재 schedule도 null로 만듦
			System.out.println("The schedule is deleted."); 
		}
	}
    public void editSchedules() {  //일정 편집 함수
		System.out.print("Input the Schedule Name you want to edit: ");
		input.nextLine();
		String name = input.nextLine();
		searchScheduleList(name);  //searchScheduleList() 함수에서 현재 사용자가 입력한 name을 받아서 원하는 주소 찾아옴.
		if(schedule == null) {  //schedule이 null이면 리턴하여 다시 하도록 함.
			System.out.println("The schedule doesn't exist.");
			return;
		}
		if(schedule.name.equals(name)) {  //schedule 객체의 name값이 입력받은 name 값과 같으면 실행
			System.out.println();                                        //아래는 편집을 하는 코드임
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
    public void viewSchedules() {  //일정 보기 함수
    	System.out.print("Input the Schedule Name you want to view: ");  //보고 싶은 일정 이름 입력받음.
		input.nextLine();  //아래의 nextLine이 생략되는 현상 방지용
		String name = input.nextLine();
		searchScheduleList(name);  //searchScheduleList() 함수에서 현재 사용자가 입력한 name을 받아서 원하는 주소 찾아옴.
    	if(schedule == null) {  //schedule이 null이면 리턴하여 다시 하도록 함.
			System.out.println("The schedule doesn't exist.");
			return;
		}
		if(schedule.name.equals(name)) {  //schedule 객체의 name값이 입력받은 name 값과 같으면 실행
			 schedule.printInfo();        //현 schedule 객체의 필드값들을 printInfo() 함수를 통해 출력
		}
	}
}
