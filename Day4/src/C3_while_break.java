import java.util.Scanner;

public class C3_while_break {

	public static void main(String[] args) {
		//반복문안에서 break : 자신이 속한 반복문 빠져나옴
		
		//0이 아닐동안 입력받은 수 출력
		Scanner sc =new Scanner(System.in);
		int su;
		while(true) {
			su=sc.nextShort();
			if(su==0)break;
			System.out.println(su);
		}
		System.out.println("프로그램이 종료");
	}

}
