
public class C3_자료형03 {

	public static void main(String[] args) {
		
		//변수 : 기억저장소 (내부적으로 주소, 크기정보가 사용됨)
		
		int lvalue = 95;
		//큰 공간 <-작은 값  OK (작은값을 큰 값으로 자동형변환)
		//작은 공간 <- 큰 값 NO (error발생 명시적으로 형변환 필요)
		
		float f = (float)76.66; //형변환 연산자, cast연산자

		double term = 1/2;   //기대하는 값을 0.5
		System.out.println(term); //결과값은 0.0 이 나옴

		//🔴정수의 연산
		//정수와 정수의 연산은 결과가 정수입니다.
		//1도 정수도 2도 정수였기 때문에 결과값도 정수인 0으로 나옴
		//하지만 double형의 변수에 들어갔기 때문에 0.0이 됨
		
		
		//실수의 연산으로 바꿔주자!
		double term2 = 1/2.0; //둘 중의 하나를 실수형으로 변환
		double term3 = 1/(double)2;
		double term4 = (double)1/2;
		double term5 = ((double)1/2);
		
		System.out.println(term2);
		System.out.println(term3);
		System.out.println(term4);
		System.out.println(term5);
	}

}
