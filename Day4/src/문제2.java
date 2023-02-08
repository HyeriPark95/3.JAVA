import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		
		
		//사용자로부터 수를 입력받아, 입력받은 수까지의 합 구하기
		Scanner sc = new Scanner(System.in);
		
		int max;
		System.out.println("몇까지의 합을 구할까요?");
		max=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=max;i++) {
			sum+=i;
		}
		System.out.println(max+"까지의 합계:"+sum);
	}

}
