
public class Payroll {
	private String name;
    private String natureOfWork;
    private String position;
    private int hoursWorked;

    public Payroll(String name, String natureOfWork, String position, int hoursWorked) {
        this.name = name;
        this.natureOfWork = natureOfWork;
        this.position = position;
        this.hoursWorked = hoursWorked;
    }

    public void computeGrossPay() {
        int allowance = 0;
        int rate = 0;

        if (natureOfWork.equalsIgnoreCase("field")) {
            allowance = 1000;
        }

        switch (position.toUpperCase()) {
            case "M":
                rate = 1000;
                break;
            case "S":
                rate = 700;
                break;
            case "E":
                rate = 300;
                break;
            default:
                System.out.println("Invalid position.");
                return;
        }
        if (hoursWorked < 1 || hoursWorked > 200) {
            System.out.println("Invalid hours worked.");
            return;
        }
        int grossPay = (rate * hoursWorked) + allowance;
        System.out.println("Name: " + name);
        System.out.println("Nature of Work: " + (natureOfWork.equalsIgnoreCase("field") ? "Field" : "Office"));
        System.out.println("Allowance: " + allowance);
        System.out.println("Position: " + (position.equalsIgnoreCase("M") ? "Manager"
                : (position.equalsIgnoreCase("S") ? "Supervisor" : "Employee")));
        System.out.println("Rate: " + rate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Gross: " + grossPay);

        
}
}
