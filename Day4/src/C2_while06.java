import java.util.Scanner;

public class C2_while06 {

	public static void main(String[] args) {
		//❓세명의 학생 점수 처리
		//세번 반복하되, 들어오는 값 유효성 검사
		Scanner sc = new Scanner(System.in);
		int kor_score;
		String level ="";
		
		for(int i=1;i<=3;i++) {
			do {  //올바르지 않은 값을 입력받을 동안 반복
				System.out.println("국어점수를 입력해주세요.");
				kor_score=sc.nextInt();
			}while((kor_score<0)||(kor_score>100));
			
			//학점을 구한다.				
			if(kor_score>=90) {
				level="A";
			}else if(kor_score>=80) {
				level="B";
			}else if(kor_score>=70) {
				level="C";
			}else {
				level="F";
			}
			
			//학점을 출력
			System.out.println(level);
		}
	}

}
