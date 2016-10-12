import java.util.Scanner;

class VendingMachine{
        public static void main(String[] args){
	        Scanner s = new Scanner(System.in);
		        int coffee =500;  
			        int milk =400;    
				        int Gcoffee =700; 
					        System.out.print("커피(500원) : ");  // 커피 개수는?
						        coffee = coffee * (s.nextInt()); // 입력받은 갯수만큼 곱해서 넣음
							        System.out.print("고급커피(700원): ");  // 우유 개수는?
								        Gcoffee = Gcoffee * (s.nextInt());
									        System.out.print("우유 (400원) : ");  // 고급커피 개수는?
										        milk = milk * (s.nextInt());
											        int totual = coffee+milk+Gcoffee;  // 계산된 물품금액 모두 더해줌
												        System.out.println("총 금액은 "+totual+"원입니다.");  // 총 주문금액 출력
													        System.out.print("돈을 입금: ");
														        int num = s.nextInt();
															        int result = num - totual;
																        System.out.println("잔돈은 "+result+"원입니다.");
																	        }
																		        }
