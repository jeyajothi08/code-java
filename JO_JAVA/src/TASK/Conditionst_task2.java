package TASK;

public class Conditionst_task2 {

	public static void main(String[] args) {
		int mark=60;
		if(mark>=35) {
			if(mark>=35 && mark<=50) {
				System.out.println("D Grade");
			}
			else if (mark>=51 && mark<=50)
			{
				System.out.println("C Grade");
			}
			else if(mark>=71 && mark<=80)
			{
				System.out.println("B Grade");
			}
			else if (mark>=81 && mark<=99)
			{
				System.out.println("A Grade");
			}
		}
		else
		{
			System.out.println("centum");
		}
	

	}
 

}
