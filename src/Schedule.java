
public class Schedule {
	int date;
	String time;
	String name;
	String content;
	
	public Schedule() {
		
	}
	
	public Schedule(int date, String time, String name) {
		this.date = date;
		this.time = time;
		this.name = name;
	}
	
	public Schedule(int date, String name) {
		this.date = date;
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println("date: " + date + "\ttime: " + time 
						+ "\tname: " + name + "\tcontent: " + content);
	}
}
