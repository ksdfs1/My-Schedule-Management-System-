package gui;

public class ScheduleEditor extends ScheduleAdder { //ScheduleAdder의 상속을 받는 클래스로, 일정을 편집할 때 새로 저장할 데이터를 입력받는 GUI이다.
													//ScheduleAdder GUI와 동일한 형태이다.
	public ScheduleEditor(WindowFrame frame) {  //frame을 받는 생성자
		super(frame);  //super로 부모 클래스 생성자 호출
	}
}
