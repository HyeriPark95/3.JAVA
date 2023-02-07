
public class C4_연산자3 {

	public static void main(String[] args) {
		
		//++, --
		//++변수의 값을 1 증가
		int su1 = 10;
		int su2 = 10;
		
		int result1;
		int result2;
		
		result1 = su1++;  //result에 값을 넣고 더하기
		result2 = ++su2;  //result에 1을 더하고 값을 넣기
		
		System.out.println(result1);
		System.out.println(result2);
		
		//계산이 다 끝난 상태
		System.out.println(su1);
		System.out.println(su2);
		
		
		int su3 = 10;
		int su4 = 10;
		
		int result3;
		int result4;
		
		result3 = su3--;  //감소전의 값을 반환
		result4 = --su4;  //감소후의 값을 반환
		
		System.out.println(result3);
		System.out.println(result4);
		
		System.out.println(su3);
		System.out.println(su4);
		
	}

}
