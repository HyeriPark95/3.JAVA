import java.util.Scanner;

public class c5_pay {

	public static void main(String[] args) {
		//사원번호, 일한 시간(주급) , 시간당 임금을 읽어서 사원의 급여를 계산하여 인쇄하는 순서도를 작성하시오. 일한
		//시간이 40시간을 초과한 경우, 40시간 초과 분에 대해서는 임금율을 1.5배로 계산한다. 총지급액이 40만원을
		//초과한 경우에 세금으로 3만원을 공제한다.
		
		double tax_salary=0;  //실수령액
		
		
		
		//입력변수
		int hour=0;
		int money=0;
		String name;
		
		//처리변수
		double salary=0;  //total지급액
		int over=0;  //초과근무시간
		final int tax;
		
		final int MAX=3;
		
		//스캐너로 입력받음
		Scanner sc = new Scanner(System.in);
		
		//사원정보 입력받는다
//		name="우주연";
//		hour=10;
//		money=400000;
		
		
		name = sc.next();   //첫번째 입력받은 것은 name
		hour = sc.nextInt();  //두번째 입력받은 것은 hour
		money = sc.nextInt();  //세번째 입력받은 것은 money
		
		if(hour>40) {
			over = hour-40;
			salary = ((hour-over)*money) + ((over*money)*1.5);
		}else {
			salary=hour*money;
		}
		
		//세금구하기
		
		if(salary >400000) {
			tax=30000;
		}else {
			tax=0;
		}
		//실수령액 구하기
		tax_salary = salary - tax;
		
		
		System.out.println("이름: "+name +" 시간:"+ hour +" 단가:"+ money+" 세금:"+tax+" 실수령액:"+tax_salary);
	}

}
