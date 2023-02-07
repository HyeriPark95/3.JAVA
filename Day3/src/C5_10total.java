
public class C5_10total {

	public static void main(String[] args) {
		//  1   2   3   4   5   6   7   8   9   10
		// 
		
		/*
		 * 처리과정
		 * 반복
		 * - 항을 구한다
		 * - 항을 누적한다
		 * 누적합 출력
		 * */
		
		//🚩변수선언
		//처리변수
		/*🚩방법1
		int n=1;
		//출력변수
		int sum=0;
		
		while(n<=10) {
			sum+=n;
			n++;
		}
		System.out.println(sum);
		*/
		
		/*🚩방법2
		int n=0;
		int sum=0;
		
		while(++n<=10) {   //n++으로 하면 0부터 더해짐
			sum=sum+n;
		}
		System.out.println(sum);
		*/
		
		int n=0;
		int sum=0;
		
		while(n++<10) {  //조건에서는 ++전의 숫자로
			sum =sum+n;  //n을 더할 때에는 ++후의 숫자로 계산됨
		}
		System.out.println(sum);
		
	}
	
	

}
