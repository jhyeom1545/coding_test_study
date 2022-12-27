package algorithm_100.Basic_001;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student std1 = new Student("손오공", "1000");
		Student std2 = new Student("임삿갓", "1001");
		Student std3 = new Student("정호진", "1002");

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(std1);
		list.add(std2);
		list.add(std3);

		for (Student std : list) {
			System.out.println(std.getName());
			System.out.println(std.getNo());
		}

		Scanner scan = new Scanner(System.in);

		

		while (true) {
			System.out.println("계속 검색을 하고싶으시면 y, 종료 하고 싶으시면 n");
			String input = scan.next();
			

			if (input.equals("y")) {
				System.out.println("검색을 시작합니다.");
				
				String name = scan.next();
				
				boolean flag = false;
				
				for(Student std: list) {
					if(std.getName().equals(name)) {
						System.out.println("해당하는 학생의 학번은 "+std.getNo()+"입니다.");
						flag = true;
					} 
				}
				if (!flag) {
					System.out.println("해당하는 학생 이름이 없습니다.");
				}
			} else if (input.equals("n")) {
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}
}
