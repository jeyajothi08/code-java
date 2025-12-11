package TASK;
interface Operation{
	int calculate(int a,int b);
}

public class Interfaceex1 {
	public static void main(String[] args)
	{
		Operation add=(a,b)->a+b;
		Operation sub=(a,b)->a-b;
		Operation multi=(a,b)->a*b;
		int x=10;
		int y=20;
		System.out.println("Addition:"+add.calculate(x,y));
		System.out.println("Subtraction:"+sub.calculate(x,y));
		System.out.println("Multiplicatin:"+multi.calculate(x,y));
		
	}


}
