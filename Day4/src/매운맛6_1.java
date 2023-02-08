
public class 매운맛6_1 {

	public static void main(String[] args) {
		
		double sum=0;  //모든 값의 합
		//처리변수
		int sw=1;
		int result =1; //분모
		double n ;//항
		
		for(int i=1;i<=3;i++) {
			//분모구하기
			for(int j=1;j<=i;j++) {
				result = result * j;
			}
			
			n=i/(double)result*sw;
			System.out.println("분자:"+i);
			System.out.println("분모:"+result);
			System.out.println("부호가 있는 항:"+n);
			sum=sum+n;
			//부호바꾸기
			result=1;  //다음범 분모를 구해주기 위해
			sw = -sw;
			
		}
		System.out.println(sum);
	}

}

