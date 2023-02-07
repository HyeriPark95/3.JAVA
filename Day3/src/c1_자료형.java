
public class c1_자료형 {

	public static void main(String[] args) {
		
		//변수: 기억장소 , 메모리블럭 , 공간을 의미
		//공간: 주고 + 크기
		//변수선언시 변수타입 변수명
		int a; // 변수명은 최대한 의미있게 부여함, 가독성
		a=10; //변수의 역할(목적), 값을 저장, 값을 이용할 목적
		
		//변수의 종류
		//1. 기본형변수: 값자체를 저장합니다(데이터)
		//2. 참조형변수: 위치(주소)를 저장합니다.
		
		/*
		 * 숫자형: 정수, 실수, 3, 3.14
		 * 논리형: true, false (참, 거짓)
		 * 문자: 'a' ,'한' : 한 문자를 표현   '한글'(X)
		 * 문자열: "안녕", "hello"
		 */
		//자료형 알아보기
		//자바는 변수 선언시 반드시 자료형을 명시한다.
		//자료형의 의미: 공간의 크기정보(각 자료형마다의 크기가 다름), 해석정보(내가 무엇인지 설명)
		
		
		
		int kor  = 90;
		double avg = 98.23;
		char ch='한';
		boolean flag = true;
		
		String str = "hello";
		
		System.out.println(kor);
		System.out.println(avg);
		System.out.println(ch);
		System.out.println(flag);
		System.out.println(str);
		

		//1byte 바이너리 (이진: 0,1)
		//125(십진) : 0,1,2,3,4,5,6,7,8,9
		//천억백억십업억 천만백만십만만 천백십일
		
		//125 -> 100 +20 +5
		//       1*100 + 2*10 + 1*5
		
		//최소단위 (bit) : 0 또는 1을 저장할 수 있는 단위
		//의미있는 값을 표현하는 최소단위 (byte) : 8개의 bit, 한 문자를 표현할 수 있는 단위
		
		//정수형자료형
		int su=10;  //byte(1byte), short(2byte), 🔴int(4byte), long(8byte)
		double su2=125.56;// float(4byte) , 🔴double(8byte) :정밀하게 소수자리를 사용할 때 이용
		char ch2='a'; 
		
		String s = "hello java";
		boolean sw = true;  //false
		
		
		System.out.println(su);
		System.out.println(su2);
		System.out.println(ch2);
		System.out.println(s);
		System.out.println(sw);
		
		
	}

}
