import java.util.ArrayList;
import java.util.Scanner;

import Schedule.Assignment;
import Schedule.Exam;
import Schedule.Promise;
import Schedule.Schedule;

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
	
	public void searchScheduleList(String content) {  //리스트에 있는 schedule 객체의 주소 중 원하는 주소를 찾는 함수
		for(int i = 0; i < scheduleList.size(); i++) {  //for문으로 리스트 전체를 한 번씩 검사
			if(scheduleList.get(i).getContent().equals(content)) {  //만약 리스트 인덱스의 주소값의 name이 사용자가 입력한 name이랑 같으면 
				this.schedule = scheduleList.get(i);     //여기 필드의 schedule의 값에 그 인덱스의 주소값을 할당
				break;
			}else {  //일치하는 게 없으면 null을 할당
				this.schedule = null;
			}
		}
	}
	
	public void addSchedule() {  //일정 추가 함수
		int Category = 0;
		while(Category ==0) {
			System.out.println("1. for Course");
			System.out.println("2. for Assignment");
			System.out.println("3. for Exam");
			System.out.println("4. for Promise");
			System.out.print("Select num for Schedule Category (1~4): ");
			Category = input.nextInt();
			if(Category == 1) {
				this.schedule = new Schedule();
				schedule.getUserInput(input);
				addScheduleList(schedule); //addScheduleList() 함수로 리스트 현재 schedule 객체의 주소 추가
				break;
			}else if(Category == 2) {
				this.schedule = new Assignment();
				schedule.getUserInput(input);
				addScheduleList(schedule); //addScheduleList() 함수로 리스트 현재 schedule 객체의 주소 추가
				break;
			}else if(Category == 3) {
				this.schedule = new Exam();
				schedule.getUserInput(input);
				addScheduleList(schedule); //addScheduleList() 함수로 리스트 현재 schedule 객체의 주소 추가
				break;
			}else if(Category == 4) {
				this.schedule = new Promise();
				schedule.getUserInput(input);
				addScheduleList(schedule); //addScheduleList() 함수로 리스트 현재 schedule 객체의 주소 추가
				break;
			}else {
				System.out.println("You input the wrong num.");
				continue;
			}
		}        
	}
	public void deleteSchedule() {  //일정 삭제 함수
		System.out.print("Input the Schedule content you want to delete: ");  //삭제할 일정의 이름을 입력받음.
		input.nextLine();  //아래의 nextLine이 생략되는 현상 방지용
		String content = input.nextLine();
		searchScheduleList(content);  //searchScheduleList() 함수에서 현재 사용자가 입력한 name을 받아서 원하는 주소 찾아옴.
		if(schedule == null) { //schedule이 null이면 리턴하여 다시 하도록 함.
			System.out.println("The schedule doesn't exist.");
			return;
		}
		if(schedule.getContent().equals(content)) {  //schedule 객체의 content값이 입력받은 content 값과 같으면 실행
			deleteScheduleList(schedule);  //deleteScheduleList()로 리스트에 저장되어 있는 해당 주소 삭제
			schedule = null;              //현재 schedule도 null로 만듦
			System.out.println("The schedule" + content + "is deleted."); 
		}
	}
    public void editSchedule() {  //일정 편집 함수
		System.out.print("Input the Schedule content you want to edit: ");
		input.nextLine();
		String content = input.nextLine();
		searchScheduleList(content);  //searchScheduleList() 함수에서 현재 사용자가 입력한 name을 받아서 원하는 주소 찾아옴.
		if(schedule == null) {  //schedule이 null이면 리턴하여 다시 하도록 함.
			System.out.println("The schedule doesn't exist.");
			return;
		}
		if(schedule.getContent().equals(content)) {  //schedule 객체의 name값이 입력받은 name 값과 같으면 실행(반복)
			int num = 0;
			while(num != 4) {
				System.out.println();
				System.out.println("The schedule to be edited is " + content);
				System.out.println("[Schedule Edit Menu]");
				System.out.println("1. Edit date");
				System.out.println("2. Edit time");
				System.out.println("3. Edit content");
				System.out.println("4. End editing");
				System.out.print("Input one of the numbers: ");
				num = input.nextInt();
				if(num == 1) {
					System.out.print("Input the new date: ");
					int newdate = input.nextInt();
					schedule.setDate(newdate);
					System.out.print("Edit Complete.");
				}else if(num == 2) {
					System.out.print("Input the new time: ");
					String newtime = input.next();
					schedule.setTime(newtime);
					System.out.print("Edit Complete.");
				}else if(num == 3) {
					System.out.print("Input the new content: ");
					input.nextLine();
					String newcontent = input.nextLine();
					schedule.setContent(newcontent);
					System.out.print("Edit Complete.");
				}else if(num == 4) {
					System.out.println("End editing.");
					break;
				}else {
					System.out.println("You input the wrong number.");
					System.out.println("Try again.");
				}
				System.out.println();
			}
		}
	}
    public void viewSchedules() {  //일정 보기 함수
    	if(scheduleList.isEmpty()) {  //schedule이 비어있으면 리턴
			System.out.println("The scheduleList is empty.");
			return;
		}
    	System.out.println("[ScheduleList]");
		for(int i = 0; i < scheduleList.size(); i++) {  //for 문으로 모든 스케줄 출력
			System.out.print(">> ");
			scheduleList.get(i).printInfo();
			System.out.println();
		}
	}
}
