
public class c4_Ex02_03 {

	public static void main(String[] args) {
		//계산식을 만들어서 푼 풀이
		final int Max=4;
		int n=1;  //항의순번
		double sum=0; //항의누적
		double m=0; //항

		
		while(n<=Max) {
			m =0.5 * n * (n+1);
			sum = sum+m;
			n++;
			
		}
		System.out.println(sum);
	}

}
