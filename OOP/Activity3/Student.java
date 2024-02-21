package Activity3;

public class Student {
    private static int studentCounter =  0;
    private String name;
    private String course;
    private float tuitionFee;
    private int studentNumber;

    public Student(String name, String course, float tuitionFee) {
        this.name = name;
        this.course = course;
        this.tuitionFee = tuitionFee;
        studentCounter++;
        this.studentNumber = studentCounter;
    }

    public float getTuitionFee() {
        return tuitionFee;
    }

    @Override
    public String toString() {
        return "Student # " + studentNumber + ": " + name + " is taking up " + course + " with a tuition fee of " + tuitionFee;
    }
}


