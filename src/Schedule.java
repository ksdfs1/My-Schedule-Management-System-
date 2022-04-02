
public class Schedule {  //Schedule 클래스
	int date;            //필드에 변수 선언
	String time;
	String name;
	String content;
	
	Schedule() {  //생성자
		
	}
	
	Schedule(int date, String time, String name) {  //생성자
		this.date = date;
		this.time = time;
		this.name = name;
	}
	
	Schedule(int date, String name) {  //생성자
		this.date = date;
		this.name = name;
	}
	
	public void printInfo() {  //필드의 변수갑을 출력하는 함수
		System.out.println("date: " + date + "\ttime: " + time 
						+ "\tname: " + name + "\tcontent: " + content);
	}
}
