import java.util.Scanner;

public class C3_while_최인호 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//2.유효성체크해서 국어점수 입력받기
		
		
		System.out.println("점수를 입력하세요");
		int korscore2=sc.nextInt();
		loof:while(true) {
			if(korscore2>100||korscore2<0) {
				System.out.println("다시 입력하세요");
			}else if(korscore2>=90) {
				System.out.println("A");
				break loof;
			}else if(korscore2>=80) {
				System.out.println("B");
				break loof;
			}else if(korscore2>=70) {
				System.out.println("C");
				break loof;
			}else {
				System.out.println("F");
				break loof;
			}
			korscore2=sc.nextInt();
		}

	}

}
