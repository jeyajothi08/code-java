package TASK;
import java.util.Scanner;

public class Conditionst_task1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the colour:");
    	String X=sc.nextLine();
    	if(X.equals("red"))
    	{
    		System.out.println("Stop");
    	}
    	else if (X.equals("yellow"))
    	{
    		System.out.println("Wait");
    	}
    	else if(X.equals("green")) {
    		System.out.println("Go");
    	}
    	else {
    		System.out.println("Invalid colour");
    	}
    }

}
