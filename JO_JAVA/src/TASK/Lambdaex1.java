package TASK;

interface Contract1{
	void sim1(int a,int b);
	public static void rule0() {
		System.out.println("rule0");
		}
	public default void rule1() {
		System.out.println("rule1");
	}
}
public class Lambdaex1{
	public static void main(String[] args) {
		Contract1 Cc1=(a,b)->{
			System.out.println("functional interface"+("a+b"));
		};
				Cc1.sim1(10,20);
				Contract1.rule0();
				Cc1.rule1();
				
			}
}
			
			
			
		
	
	


	
