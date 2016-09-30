import java.util.Scanner;

class A06{
	public static void main(String[] args){
	result();
	}

	public static void result(){
	Scanner s = new Scanner(System.in);
	System.out.print("이름 : ");
	String name = s.nextLine();
	System.out.print("국어점수 입력 : ");
	int kor = s.nextInt();
	System.out.print("수학점수 입력 : ");
	int mat = s.nextInt();
	System.out.print("영어점수 입력 :");
	int eng = s.nextInt();

	double total = kor + mat + eng;
	double avg = total /3f;

	String hak;
	if(avg >= 95)	hak = "A+";
	else if(avg >= 90)	hak = "A";
	else if(avg >= 85)	hak = "B+";
	else if(avg >= 80)	hak = "B";
	else if(avg >= 75)	hak = "C+";
	else if(avg >= 70)	hak = "C";
	else if(avg >= 65)	hak = "D+";
	else if(avg >= 60)	hak = "D";
	else hak = "F";
	
	System.out.println(name + "님은\n 평균은 "+avg+"이고\n학점은 "+hak+" 입니다."); 
	}
}
