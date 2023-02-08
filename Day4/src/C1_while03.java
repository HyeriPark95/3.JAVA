import java.util.Scanner;

public class C1_while03 {

	public static void main(String[] args) {
		
		//❓추가문제
		//0을 입력받을 때까지 입력한 수를 모두 더하시오
		
		Scanner sc = new Scanner(System.in);
		
		int total=0;
		int[] numbers = new int[10];
		int index =0;
		
		while(true) {
			numbers[index]=sc.nextInt();  //숫자를 받고
			if(numbers[index]==0)break;   //0이면 멈추기
			total+=numbers[index];
			index++;
		}
		for(int i=0;i<index;i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println("\ntotal:"+total);
	}

}
