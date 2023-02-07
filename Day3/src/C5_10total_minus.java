
public class C5_10total_minus {

	public static void main(String[] args) {
		
		//첫번째 방법
		
		int n = 11;
		int sum = 0;
		
		while(--n>0) {  //중괄호안에 n--;를 넣지 않고, 소활호 안에 넣는 방법
			sum+=n;
		}
		System.out.println(sum);
		
		
		//두번째 방법
		/*
		int sum=0;
		for(int i=10;i>0;i--) {
			sum+=i;
		}
		System.out.println(sum);
		*/
	}

}
