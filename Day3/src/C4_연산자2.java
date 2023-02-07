
public class C4_연산자2 {

	public static void main(String[] args) {

		int su1= 10;
		int su2= 3;
		
		int result1 =su1+su2;
		int result2 =su1=su2;
		int result3 =su1*su2;
		double result4 =su1 / (double)su2;
		//The value of the local variable result1 is not used
		//자바에서는 변수값을 만들어두고 사용하지 않으면 노란줄로 경고가 뜬다.
		
		System.out.println(result1);
		System.out.println(result4);
		
	}

}
