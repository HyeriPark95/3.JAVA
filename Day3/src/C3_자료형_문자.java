
public class C3_자료형_문자 {

	public static void main(String[] args) {
		
		//문자열 자료형 없음
		//문자열 = 문자의 집합
		
		//"hello"
		//char변수 5개 준비하고, 각 문자를 저장한 다음 출력
		
		char h='h';
		char e='e';
		char l='l';
		char o='o';
		
		//println하면 줄바꿈이 있고, ln없애고 print만 하면 줄바꿈 없음
		System.out.print(h);
		System.out.print(e);
		System.out.print(l);
		System.out.print(l);
		System.out.println(o);
		
		//문자배열로 문자열 처리함
		char[] str = new char[5];
		str[0]='h';  //0의미: 기준으로부터 0만큼 떨어진 거
		str[1]='e';  //1의미: 기준으로부터 1만큼(자료형의 크기 1개만큼) 떨어진 거리
		str[2]='l';
		str[3]='l';
		str[4]='o';
		
		//반복문으로 문자 하나하나를 꺼내옴
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]);
		};
	}

}
