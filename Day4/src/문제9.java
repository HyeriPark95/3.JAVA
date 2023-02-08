import java.util.Scanner;

public class 문제9 {

	public static void main(String[] args) {
		//구구단 출력
		
//		for(int i=1;i<=9;i++) {
//			System.out.println("<"+i+"단>");
//			for(int j=1;j<=9;j++) {
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//			
//		}
		
		//원하는 단 출력
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("원하는 단을 입력하세요");
		num = sc.nextInt();
		
		for(int j=1;j<=9;j++) {
			System.out.println(num+"*"+j+"="+num*j);
		}
		
	}

}
