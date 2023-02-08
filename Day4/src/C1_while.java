
public class C1_while {

	public static void main(String[] args) {
		/*
		 * while(조건){무한루프 조심!!}
		 * while(true){
		 * 	if(조건)break;
		 * }
		 * 
		 * boolean flag=true;
		 * while(flag){
		 * 	if(조건) flag=false;
		 * 
		 * }
		 * 
		 * do{
		 * 
		 * }while(조건);
		 * 
		 * */
		
		// 1+3+5+7+9+..99
		
		int n=1;
		int sum=0;
		final int MAX=5;
		
		while(n<=5) {
			sum+=n;
			n=n+2;
			
		}
		System.out.println(sum);
		
	}

}
