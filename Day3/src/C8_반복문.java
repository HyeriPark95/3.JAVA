
public class C8_반복문 {

	public static void main(String[] args) {
		
		/*
		for(int i=1; i<=3; i++) {  //초기식, 조건식, 증감식
			System.out.println("엄마");
		}
		
		for(int i=3;i>=1;i--) {
			System.out.println("아빠");
		}
		*/
		
		System.out.println("엄마");
		//반복문제공

		for(int i=1;i<=3;i++) {
			System.out.println("엄마");
		}
		
		//별 하나 출력
		System.out.println("*");
		
		//별 다섯개 출력
		for(int i=1;i<=5;i++) {
			System.out.print("*");

		}
		System.out.println("===========");
		
		//for무한루프
		int count=0;
		for(;;) {
			System.out.print("*");
			count++;
			if(count==5) {
				break;
			}
		}
		
		//2단 출력
		System.out.println("\n <2단출력>");
		System.out.println(2*1);
		System.out.println(2*2);
		System.out.println(2*3);
		System.out.println(2*4);
		System.out.println(2*5);
		System.out.println(2*6);
		System.out.println(2*7);
		System.out.println(2*8);
		System.out.println(2*9);
		
		System.out.println("\n for이용 <2단출력>");
		for(int i=1;i<=9;i++) {
			System.out.println("2*"+i+"="+2*i);
		}
		
		//구구단 출력
		for(int i=2;i<=9;i++) {
			System.out.println("<"+i+"단>");
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		//특정 단 출력
		
		//별찍기
		
		
		
	}

}
