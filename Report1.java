import java.util.Scanner;
class Report1{
	public static void main(String[] args){
	result();
	}
	
	public static void result(){
	Scanner s = new Scanner(System.in);
	int birth_year;
	int age;

	System.out.print("태어난 년도를 입력하세요. ");
	birth_year = s.nextInt();
	age = 2014 - birth_year + 1;

	if(age < 20)
	System.out.println("미성년자 입니다.");
	else
	System.out.println("미성년자가 아닙니다.");
	}
}
