import java.util.Scanner;

public class C2_while05 {

	public static void main(String[] args) {
		//국어점수를 입력받아서 국어점수에 대한 학점을 구하기
		//(90: A, 80: B, 70:C, F)
		//1.유효성체크 없이
		
		/*
		int kor_score;
		String level ="";
		System.out.println("국어점수를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		kor_score=sc.nextInt();
		
		if(kor_score>=90) {
			level="A";
		}else if(kor_score>=80) {
			level="B";
		}else if(kor_score>=70) {
			level="C";
		}else {
			level="F";
		}
		System.out.println(level);
		*/
		
		//2.유효성체크
		//점수를 받고 한번 등급을 출력하는데, 점수가 올바르지 않으면 올바른 값이 들어올때까지 받음
		int kor_score;
		String level ="";
		Scanner sc = new Scanner(System.in);
		
		do {  //올바르지 않은 값을 입력받을 동안 반복
			System.out.println("국어점수를 입력해주세요.");
			kor_score=sc.nextInt();
		}while((kor_score<0)||(kor_score>100));
		
						
		if(kor_score>=90) {
			level="A";
		}else if(kor_score>=80) {
			level="B";
		}else if(kor_score>=70) {
			level="C";
		}else {
			level="F";
		}
		System.out.println(level);

	}

}
