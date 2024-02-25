
public class Student {
	//private instance variables
	private String name;
	private int studentId;
	private String course;
	//constructor
	public Student(String name, int studentId, String course) {
		this.name = name;
		this.studentId = studentId;
		this.course = course;
	}
	// getters and setters
	public String getName() {
		return name;
	}
	
	public void SetName(String name) {
		this.name = name;
	}
	
	public int getstudentId() {
		return studentId;
	}
	public void SetStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getCourse() {
		return course;
	}
	public void SetCourse(String course) {
		this.course = course;
	}
	@Override
	// toSting
	public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId='" + studentId + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
	@Override
	// checking if equal s1 and s2
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }
    @Override
    // hashCode method whatever
    public int hashCode() {
        return Integer.hashCode(studentId);
    }

}
