package algorithm_100.Basic_001;

public class Student {
	private String name;
	private String no;
	
	// 기본 생성자
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	
	@Override
	public String toString() {
		return name + no;
	}
	
}
