import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		//고객정보(이름, 아이디, 나이, 키) 입력받아서 출력하기
		Scanner sc = new Scanner(System.in);
		
		String id;
		String name;
		int age;
		double height;
		
		System.out.println("id를 입력해주세요");
		id=sc.next();
		System.out.println("이름를 입력해주세요");
		name=sc.next();
		System.out.println("나이를 입력해주세요");
		age=sc.nextInt();
		System.out.println("키를 입력해주세요");
		height=sc.nextDouble();
		
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("height:"+height);
		
	}

}
