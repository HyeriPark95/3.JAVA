
public class c1_Ex02_01 {

	public static void main(String[] args) {
		// 🔴1+(1+2)+(1+2+3)+...+(1+2+3+...+100) 까지의 합 구하기
		int i=1;
		int sum=0;
		int n=0;
		final int Max=10;
		
		while(i<=Max) {
			n=n+i;
			sum=sum+n;
			i++;
		}
		System.out.println(sum);

	}

}
