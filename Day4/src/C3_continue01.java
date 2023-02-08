
public class C3_continue01 {

	public static void main(String[] args) {
		//continue , 짝수합 구하기 (1~10)
		
		int sum=0;
		for(int i=1;i<=5;i++) {
			if(i%2!=0) {//홀수 의미
				continue;    //반복문의 끝으로 이동
			}
			sum=sum+i;  //홀수 일 때에는 더하기를 건너뛰고
		} //📌여기로 이동하게 됨
		System.out.println(sum);
	}
	

}
