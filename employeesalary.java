import java.util.Scanner;

public class employeesalary{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

double[] salary = new double[n];

        double total = 0;
        double highest, lowest, average;

        // Input salaries
        for (int i = 0; i< n; i++) {
System.out.print("Enter salary of Employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();

            total += salary[i];
        }

        // Initialize highest and lowest
        highest = salary[0];
        lowest = salary[0];

        // Find highest and lowest salary
        for (int i = 1; i< n; i++) {
            if (salary[i] > highest) {
                highest = salary[i];
            }

            if (salary[i] < lowest) {
                lowest = salary[i];
            }
        }

        // Calculate average
        average = total / n;

        // Display results
System.out.println("\n------ Salary Report ------");
System.out.println("Total Salary   : " + total);
System.out.println("Average Salary : " + average);
System.out.println("Highest Salary : " + highest);
System.out.println("Lowest Salary  : " + lowest);

        // Compare each employee's salary with average
System.out.println("\nEmployee Salary Status:");

        for (int i = 0; i< n; i++) {

System.out.print("Employee " + (i + 1) + " : " + salary[i] + " --> ");

            if (salary[i] > average) {
System.out.println("Above Average");
            } else if (salary[i] < average) {
System.out.println("Below Average");
            } else {
System.out.println("Equal to Average");
            }
        }

sc.close();
    }
}
