import java.util.Scanner;

public class 박혜리 {

	public static void main(String[] args) {
		//🔴문제1
		//1~10까지의 합 구하기
//		int sum=0;
//		for(int i=1;i<=10;i++) {
//			sum+=i;
//		}
//		System.out.println(sum);
		
		
		
		//🔴문제2
		//사용자로부터 수를 입력받아, 입력받은 수까지의 합 구하기
//		Scanner sc = new Scanner(System.in);
//		
//		int max;
//		System.out.println("몇까지의 합을 구할까요?");
//		max=sc.nextInt();
//		
//		int sum=0;
//		for(int i=1;i<=max;i++) {
//			sum+=i;
//		}
//		System.out.println(max+"까지의 합계:"+sum);
		
		
		
		//🔴문제3
		//고객정보(이름, 아이디, 나이, 키) 입력받아서 출력하기
//		Scanner sc = new Scanner(System.in);
//		
//		String id;
//		String name;
//		int age;
//		double height;
//		
//		System.out.println("id를 입력해주세요");
//		id=sc.next();
//		System.out.println("이름를 입력해주세요");
//		name=sc.next();
//		System.out.println("나이를 입력해주세요");
//		age=sc.nextInt();
//		System.out.println("키를 입력해주세요");
//		height=sc.nextDouble();
//		
//		System.out.println("id:"+id);
//		System.out.println("name:"+name);
//		System.out.println("age:"+age);
//		System.out.println("height:"+height);
		
		
		
		//🔴문제4
		//일정관리 프로그램 만들기(1번 반복)
		//1.등록 2.조회 3.변경 4.삭제
				
//		Scanner sc= new Scanner(System.in);
//		System.out.println("===일정관리 프로그램===");
//		
//		int menu;
//		
//		System.out.println("메뉴를 선택해주세요");
//		System.out.println("1.등록 2.조회 3.변경 4.삭제");
//		
//		menu=sc.nextInt();
//		
//		switch(menu) {
//		case 1:
//			System.out.println("등록합니다.");
//			break;
//		case 2:
//			System.out.println("조회합니다.");
//			break;
//		case 3:
//			System.out.println("변경합니다.");
//			break;
//		case 4:
//			System.out.println("삭제합니다.");
//			break;
//		default: 
//			System.out.println("다른 메뉴를 입력해주세요");
//			System.out.println("일정관리 프로그램이 종료됩니다.");
//		
//		}
		
		
		
		//🔴문제5
		//일정을 관리하는 프로그램
		//0을 누를 때까지 반복
				
//		Scanner sc= new Scanner(System.in);
//		System.out.println("===일정관리 프로그램===");
//		
//		int menu;
//		
//		while(true) {
//			System.out.println("메뉴를 선택해주세요");
//			System.out.println("1.등록 2.조회 3.변경 4.삭제");
//			menu=sc.nextInt();
//			
//			if(menu==0) {  //0을 선택하면 더 이상 진행 안함
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}  
//			
//			//일정관리 프로그램
//			switch(menu) {
//			case 1:
//				System.out.println("등록합니다.");
//				break;
//			case 2:
//				System.out.println("조회합니다.");
//				break;
//			case 3:
//				System.out.println("변경합니다.");
//				break;
//			case 4:
//				System.out.println("삭제합니다.");
//				break;
//			default: 
//				System.out.println("다른 메뉴를 입력해주세요");
//			}
//		}
		
		
		//🔴문제6
		//수를 입력 받아서 짝수의 합 구하기 (10개의 수 입력)
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num;
//		int sum=0;
//		for(int i=1;i<=10;i++) {
//			num= sc.nextInt();
//			if(num%2==0) {
//				sum+=num;
//			}
//		}
//
//		System.out.println(sum);
		
		
		
		//🔴문제7,8
//		//별 하나 출력
//		System.out.println("*");
//		
//		//별 세개씩 세출 출력
//		for(int i=1;i<=3;i++) {
//			System.out.println();
//			for(int n=1;n<=3;n++) {
//				System.out.print("*");
//			}
//		}
		
		
		//🔴문제9
		//9-1구구단 출력
//		for(int i=1;i<=9;i++) {
//			System.out.println("<"+i+"단>");
//			for(int j=1;j<=9;j++) {
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//			
//		}
		
		//9-2원하는 단 출력
//		Scanner sc = new Scanner(System.in);
//		int num;
//		System.out.println("원하는 단을 입력하세요");
//		num = sc.nextInt();
//		
//		for(int j=1;j<=9;j++) {
//			System.out.println(num+"*"+j+"="+num*j);
//		}
		
		
		//🔴문제10
		//일정관리 프로그램(등록 및 조회)
		Scanner sc= new Scanner(System.in);
		System.out.println("===일정관리 프로그램===");
		
		int menu;
		String contents="";
		
		while(true) {
			
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1.등록 2.조회 3.종료");
			menu=sc.nextInt();
			
			if(menu==3)break;
			switch(menu) {
			case 1:
				System.out.println("등록할 내용을 입력해주세요");
				contents = sc.next();
				System.out.println("등록되었습니다.\n");
				break;
			case 2:
				System.out.println("조회합니다.");
				System.out.println("조회내용:"+contents+"\n");
				break;
			default: 
				System.out.println("메뉴를 다시 입력해주세요.");
				break;
			
			}
		}
	}

}
