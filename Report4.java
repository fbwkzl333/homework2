import java.util.Scanner;
import java.text.DecimalFormat;

class Report4{
	public static void main(String[] args){
	result();
	}

	public static void result(){
	Scanner s = new Scanner(System.in);
	int kor;	// 국어 점수
	int eng;	// 영어 점수
	int mat;	// 수학 점수
	int total;	// 총점
	double avg; 	// 평균

	System.out.print("국어 점수를 입력하세요 : ");
	kor = s.nextInt();
	System.out.print("영어 점수를 입력하세요 : ");
	eng = s.nextInt();
	System.out.print("수학 점수를 입력하세요 : ");
	mat = s.nextInt();
	total = kor + eng + mat;

	avg = (double)total/3f;
	String format = "#.#"; // 소수점 첫째자리 까지 나타내기 (및 3줄포함)
	java.text.DecimalFormat df = new java.text.DecimalFormat(format);
	String rateF = df.format(avg);
	
	System.out.println("입력하신 점수의 총점은 "+ total +" 이고,\n평균은 "+rateF+" 입니다.");

	if(kor >= 90)
	System.out.println("국어 점수가 우수합니다.");
	if(eng >= 90)
	System.out.println("영어 점수가 우수합니다.");
	if(mat >= 90)
	System.out.println("수학 점수가 우수합니다.");
	}
}

