import java.util.Scanner;

public class c7_guessingGame {

	public static void main(String[] args) {
		//❓사용자가 임의의 숫자를 맞추기 위해 값을 입력하면 
		Scanner sc = new Scanner(System.in);
		int input;
		int answer;
		//answer=102;
		
		//임의의 수를 받아와봅시다.
		answer = (int) (Math.random() * 100);   //int로 뒤의 소수점을 버려줌  0~99까지의 수
 		int count =0;
		
		while(true) {
			input =sc.nextInt();
			count++;
			if(input > answer) {
				System.out.println("아래로");
			}else if(input < answer){
				System.out.println("위로");
			}else {
				System.out.println("정답입니다~");
				break;
			}
		}
		System.out.println("정답을 맞추었어요 정답은: "+answer);
		if(count<=3) {
			System.out.println("3번안에 맞추었어요 간식 획득!");
		}else {
			System.out.println("3번이 넘었어요! 다음기회에");
		}
	}

}
