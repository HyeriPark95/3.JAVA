
public class c4_Exhot01 {

	public static void main(String[] args) {
		// 매운맛 1번 풀이
		// ❓1999sus H시의 인구는 250만면, 연 증가율은 3.6%이고, k시의 인구는 180만명이며,
		// 	 연 증가율은 4.2%일 때 k시의 인구가 h시의 인구를 넘어서는 년도를 구하시오
		double h=2500000 ,k=1800000;
		double hGrow=0.036, kGrow=0.042;
		int year=1999;
		
		while(k<=h) {
			year+=1;
			h=h+(h*hGrow);
			k=k+(k*kGrow);
		}
		System.out.println(year);

	}

}
