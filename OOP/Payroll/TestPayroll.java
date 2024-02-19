import java.util.Scanner;

public class TestPayroll {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); 
         System.out.print("Name: ");
         String name = sc.nextLine();

         System.out.println("Nature of Work: ");
         System.out.println("[1] Field");
         System.out.println("[2] Office");
         System.out.print("Choice: ");
         String natureOfWork = sc.nextLine();
         if (!natureOfWork.equals("1") && !natureOfWork.equals("2")) {
             System.out.println("Invalid choice for nature of work.");
             return;
         }
         natureOfWork = (natureOfWork.equals("1")) ? "field" : "office";

         System.out.println("Position: ");
         System.out.println("[M] Manager");
         System.out.println("[S] Supervisor");
         System.out.println("[E] Employee");
         System.out.print("Choice: ");
         String position = sc.nextLine();
         if (!position.equalsIgnoreCase("M") && !position.equalsIgnoreCase("S") && !position.equalsIgnoreCase("E")) {
             System.out.println("Invalid choice for position.");
             return;
         }

         System.out.print("Number of Hours Worked: ");
         int hoursWorked = sc.nextInt();

         Payroll payroll = new Payroll(name, natureOfWork, position, hoursWorked);
         payroll.computeGrossPay();}

}
