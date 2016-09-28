import java.util.Scanner;

class Report5{
	public static void main(String[] args){
	result();
	}

	public static void result(){
	Scanner s = new Scanner(System.in);
	int year;	// 태어난 년도
	int age;	// 나이

	System.out.print("태어난 년도를 입력하세요 : ");
	year = s.nextInt();

	age = 2012 - year + 1;

	if(age >= 60)
	System.out.println("노년입니다.");
	else if(60>age && age >= 30)
	System.out.println("중년입니다.");
	else if(30>age && age >= 20)
	System.out.println("청년입니다.");
	else if(20>age && age >= 13)
	System.out.println("청소년입니다.");
	else if(13>age && age >= 7)
	System.out.println("어린이입니다.");
	else if(age < 7)
	System.out.println("유아입니다.");
	}
}
