package Schedule;
//ScheduleInput�� Course, Assignment, Exam, Promise Ŭ������ �������̽��̴�.
//��ӹ޴� �� ���� Ŭ������ ���������� ����ϴ� �޼ҵ带 abstract�� ������ ����.
import java.util.Scanner;

public interface ScheduleInput {
	
	public void setDate(int date);
	
	public void setTime(String time);
	
	public void setContent(String content);
	
	public String getContent();
	
	public void printInfo();
	
	public void getUserInput(Scanner input);
}
