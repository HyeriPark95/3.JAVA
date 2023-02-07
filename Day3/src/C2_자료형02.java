
public class C2_자료형02 {

	public static void main(String[] args) {

		byte b = 127; //1byte (-128~127) 128이상의 숫자는 들어가지 않음
		
		b=125;
		//b=128; 🔴Type mismatch: cannot convert from int to byte
		
		short s= 128; //2byte (-32768 ~ 32767)
		
		int su=25000; //4byte
		
		//int su2=2200000000; //(-21억~21억)  22억
		
		
		//리터럴(값)도 크기를 가진다
		//리터럴도 저장이 됩니다.(상수영역)
		//long i = 2200000000; //🔴The literal 2200000000 of type int is out of range 
		
		//문제발생 이유: 22억이라는 값 자체가 저장이 안됨, 리터럴 정수의 기본이 int 임
		// long형 상수임을 명시해줘야 함
		
		long l = 2200000000l; //숫자 끝에 l(영어 엘)을 붙여준다.
		 
		System.out.println(l);
		
		
		//🚨리터럴(값 자체)도 저장된 다음부터 사용됩니다! (상수영역)
		//정수 => int
		//실수=>double
		
		double avg=96.88;  //float을 double에 넣는 것은 가능 
		
		//float avg2=96.88; //🔴The literal 2200000000 of type int is out of range 
		//double을 float에 넣을 수 없음
		
		float avg2= 96.88f;  //96.88f  상수영역에 저장될 때 float형 상수임을 명시해줌
		
		
		
	}

}
