import java.util.Scanner;

public class C1_while02 {

	public static void main(String[] args) {
		//❓0을 입력받을 때까지 입력한 수를 모두 더하시오
		
		//while문
		
		//문제분석
		//3 -> 3
		//5 -> 8
		//7 -> 15
		//0 -> 
		//전체합: 15
		
		//출력변수 전체합계:  total
		//입력변수 입력받은 수 : number
		
		//처리과정
		/*
		 1. 반복(입력받은 수가 0이 아닐동안)
		  1.1 수를입력
		  1.2 수를 누적
		 2. 누적한 값을 출력
		*/
		Scanner sc = new Scanner(System.in);
		
		int total=0;  //누적이 필요하므로 0으로 초기화 필요
		int number;
		
		number = sc.nextInt();
		while(number != 0) {
			total+=number;
			number = sc.nextInt();
			
		}
		System.out.println(total);
		
		//❓추가문제
		//0을 입력받을 때까지 입력한 수를 모두 더하시오
		
		
	}

}
