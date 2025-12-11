package TASK;

import java.util.Scanner;

public class Salary_task1 {
    public static void main(String[] args) {
        int baseSalary = 50000;
        int rating;
        int leaves;
        double finalSalary = baseSalary;

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter performance rating (0-100): ");
        rating = sc.nextInt();

  
        System.out.print("Enter number of leaves taken: ");
        leaves = sc.nextInt();

        if (leaves > 5) {
            int extraLeaves = leaves - 5;
            int leaveDeduction = extraLeaves * 500;
            finalSalary -= leaveDeduction;
            System.out.println("Leave deduction applied: Rs. " + leaveDeduction);
        } else {
            System.out.println("No leave deduction.");
        }

  
        double performanceDeduction = 0;
        if (rating > 90) {
            System.out.println("Excellent performance: No deduction.");
        } else if (rating > 75) {
            performanceDeduction = baseSalary * 0.02; // 2% deduction
            finalSalary -= performanceDeduction;
            System.out.println("Good performance: 2% deduction = Rs. " + performanceDeduction);
        } else {
            performanceDeduction = baseSalary * 0.05; // 5% deduction
            finalSalary -= performanceDeduction;
            System.out.println("Poor performance: 5% deduction = Rs. " + performanceDeduction);
        }


        System.out.println("Final Salary = Rs. " + finalSalary);

        sc.close();
    }
}
