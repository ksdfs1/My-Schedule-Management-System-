//Schedule 리스트를 관리하고 프로그램이 실행된 후 사용자로부터 메뉴를 입력받으면 그에 따라 이 클래스에 있는 메소드가 실행된다. 
//필드에는 사용자의 입력을 받는 input, 일정(객체)의 주소를 할당할 schedule, 모든 일정(객체)의 주소를 저장할 scheduleList(ArrayList) 변수가 있다.
//리스트에 일정(객체)의 주소를 추가, 삭제, 서치하는 메소드 addScheduleList, deleteScheduleList, searchScheduleList가 있다.
//MenuManager의 switch문에 따라 실행되는 메소드 addSchedule, deleteSchedule, editSchedule, viewSchedules가 있다.
import java.util.ArrayList;
import java.util.Scanner;

import Schedule.Assignment;
import Schedule.Exam;
import Schedule.Promise;
import Schedule.Schedule;
import Schedule.ScheduleCategory;

public class ScheduleManager {  //ScheduleManager 클래스
	private Scanner input;      //필드의 변수들
	private Schedule schedule;
	private ArrayList<Schedule> scheduleList = new ArrayList<Schedule>();  //schedule 객체의 주소를 저장하는 리스트
	
	ScheduleManager() {  //기본 생성자
		
	}
	
	ScheduleManager(Scanner input) {  //생성자를 통해 ManuManager에서 받은 input을 그대로 사용
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
			if(scheduleList.get(i).getContent().equals(content)) {  //만약 리스트 인덱스의 주소값의 content가 사용자가 입력한 content와 같으면 
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
			System.out.println("1. for Course");  //카테고리를 물음
			System.out.println("2. for Assignment");
			System.out.println("3. for Exam");
			System.out.println("4. for Promise");
			System.out.print("Select num for Schedule Category (1~4): ");
			Category = input.nextInt();  //카테고리를 입력받고 조건문에 따라 if 실행
			if(Category == 1) {
				this.schedule = new Schedule(ScheduleCategory.Course);
				schedule.getUserInput(input);
				addScheduleList(schedule); //addScheduleList() 함수로 리스트 현재 schedule 객체의 주소 추가
				break;
			}else if(Category == 2) {
				this.schedule = new Assignment(ScheduleCategory.Assignment);  //Assignment 객체 생성
				schedule.getUserInput(input);
				addScheduleList(schedule); //addScheduleList() 함수로 리스트 현재 schedule 객체의 주소 추가
				break;
			}else if(Category == 3) {
				this.schedule = new Exam(ScheduleCategory.Exam);  //Exam 객체 생성
				schedule.getUserInput(input); 
				addScheduleList(schedule); //addScheduleList() 함수로 리스트 현재 schedule 객체의 주소 추가
				break;
			}else if(Category == 4) {
				this.schedule = new Promise(ScheduleCategory.Promise);  //Promise 객체 생성
				schedule.getUserInput(input);
				addScheduleList(schedule); //addScheduleList() 함수로 리스트 현재 schedule 객체의 주소 추가
				break;
			}else {
				System.out.println("You input the wrong num.");
				continue;
			}
		}
		System.out.println("The new schedule is added."); //일정이 리스트에 추가되었음을 알림
	}
	public void deleteSchedule() {  //일정 삭제 함수
		System.out.print("Input the Schedule content you want to delete: ");  //삭제할 일정의 content를 입력받음.
		input.nextLine();
		String content = input.nextLine();
		searchScheduleList(content);  //searchScheduleList() 함수에서 현재 사용자가 입력한 content를 받아서 원하는 주소 찾아옴.
		if(schedule == null) { //schedule이 null이면 리턴하여 다시 하도록 함.
			System.out.println("The schedule doesn't exist.");
			return;
		}
		if(schedule.getContent().equals(content)) {  //schedule 객체의 content값이 입력받은 content 값과 같으면 실행
			deleteScheduleList(schedule);  //deleteScheduleList()로 리스트에 저장되어 있는 해당 주소 삭제
			schedule = null;               //현재 schedule도 null로 만듦
			System.out.println("The schedule" + content + "is deleted."); 
		}
	}
    public void editSchedule() {  //일정 편집 함수
		System.out.print("Input the Schedule content you want to edit: ");  //편집할 스케줄의 content를 입력받음.
		input.nextLine();
		String content = input.nextLine();
		searchScheduleList(content);  //searchScheduleList() 함수에서 현재 사용자가 입력한 content를 받아서 원하는 주소 찾아옴.
		if(schedule == null) {  //schedule이 null이면 리턴하여 다시 하도록 함.
			System.out.println("The schedule doesn't exist.");
			return;
		}
		if(schedule.getContent().equals(content)) {  //schedule(필드)의 content 값이 입력받은 content 값과 같으면 실행(반복)
			int num = 0;
			while(num != 4) {  //사용자가 편집을 종료하기 전까지는 계속 반복한다.
				System.out.println();  //아래는 어떤 것을 편집할 것인지 입력받는 코드이다
				System.out.println("The schedule to be edited is " + content);
				System.out.println("[Schedule Edit Menu]");
				System.out.println("1. Edit date");
				System.out.println("2. Edit time");
				System.out.println("3. Edit content");
				System.out.println("4. End editing");
				System.out.print("Input one of the numbers: ");
				num = input.nextInt();
				if(num == 1) {  //입력받은 num에 따라서 if문 실행
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
    	System.out.println("*** ScheduleList ***");
		for(int i = 0; i < scheduleList.size(); i++) {  //for 문으로 모든 스케줄 출력
			System.out.print(">> ");
			scheduleList.get(i).printInfo();  //리스트에 저장된 주소마다 있는 printInfo 메소드 실행
			System.out.println();
		}
	}
}
