import java.util.Scanner;

public class C6_제어문03 {

	public static void main(String[] args) {
		
		//지난달 사용금액을 입력받아 고객등급을 출력하는 프로그램 작성
		//50만원이상 VVIP ,30만원이상 VIP, 20만원 이상 우수, 나머지는 브론즈
		
		//입력: 지난달 사용량 amount
		//츨력: 고객등급
		//처리: 
		
		//처리과정
		//1. 고객 사용금액을 입력받는다
		//2. 사용금액에 대한 등급구하기
		
		Scanner sc=new Scanner(System.in);  //import해줌
		
		int amount;
		System.out.print("사용금액 입력:");
		amount = sc.nextInt();  //키보드 입력 받아 amount애 넣음
		
		if(amount>=500000) {
			System.out.println("VVIP");
		}else if(amount>=300000) {
			System.out.println("VIP");
		}else if(amount>=200000) {
			System.out.println("우수");
		}else {
			System.out.println("브론즈");
		}
		
		
	}

}
