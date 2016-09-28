import java.util.Scanner;

class Report3{
	public static void main(String[] args){
	result();
	}

	public static void result(){
	Scanner s = new Scanner(System.in);
	int days;	// 날 수
	int seconds;	// 초 단위 시간
	int m_count;	// 100만 초 포함 횟수

	System.out.print("날수를 입력하세요 : ");
	days = s.nextInt();
	seconds = days * 24 * 60 * 60;
	System.out.println("날수에 해당되는 기간은 모두 "+ seconds +" 초입니다.");
	
	if(seconds >= 1000000)
	{
	m_count = seconds / 1000000;
	System.out.println("100만 초가 모두 "+ m_count +" 번이나 포함됩니다.");
	}
				}
}
