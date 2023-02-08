import java.util.Scanner;

public class 문제6 {

	public static void main(String[] args) {
		
		//수를 입력 받아서 짝수의 합 구하기 (10개의 수 입력)
		
		//수를 입력받음
		Scanner sc = new Scanner(System.in);
		
		int num;
		int sum=0;
		
		//입력받은 값이 짝수일 경우 누적
		for(int i=1;i<=10;i++) {
			num= sc.nextInt();
			if(num%2==0) {
				sum+=num;
			}
		}
		//누적한 값 출력하기
		System.out.println(sum);
	}

}
