package Schedule;
//ScheduleInput은 Course, Assignment, Exam, Promise 클래스의 인터페이스이다.
//상속받는 네 개의 클래스가 공통적으로 사용하는 메소드를 abstract로 선언해 놓음.
import java.util.Scanner;

public interface ScheduleInput {
	
	public void setDate(int date);
	
	public void setTime(String time);
	
	public void setContent(String content);
	
	public String getContent();
	
	public void printInfo();
	
	public void getUserInput(Scanner input);
}
