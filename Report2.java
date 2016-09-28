import java.util.Scanner;
class Report2{
	public static void main(String[] args){
	result();
	}

	public static void result(){
	Scanner s = new Scanner(System.in);

	double input_degree;	// 입력받은 온도
	String kind;		// 온도의 종류, 섭씨온도는 'C', 화씨온도는 'F'
	double output_degree = 0 ;	// 변환한 온도

	System.out.print("온도를 입력하세요 : ");
	input_degree = s.nextDouble();
	System.out.print("입력하신 온도가 섭씨온도이면 C를, 화씨온도이면 F를 입력하세요 : ");
	kind = s.next();

	if("C".equals(kind)) 	// 섭씨온도 일때! 화씨온도로 변환
	{
	output_degree = input_degree * 1.8 + 32;
	}
	else if("F".equals(kind)) 	// 화씨온도 일떄! 섭씨온도로 변환
	{
	output_degree = (input_degree - 32) / 1.8;
	}

	System.out.println("변화된 온도는 "+ output_degree +" 입니다.");
	}
}
