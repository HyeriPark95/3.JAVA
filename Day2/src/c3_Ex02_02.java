
public class c3_Ex02_02 {

	public static void main(String[] args) {
		//다른 사람의 순서도 풀이
			int p=0, i=1, j=1, n=0;
			final int Max=4;
			
			while(i<=Max) {
				j=1;
				n=0;
				//항 구하기
				while(j<=i) {
					n=n+j;
					j++;
				}
				p=p+n;
				i++;
				
			}
			System.out.println(p);

	}

}
