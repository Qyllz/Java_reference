
public class Student {
	private String name;
	private int studentId;
	private String course;
	
	public Student(String name, int studentId, String course) {
		this.name = name;
		this.studentId = studentId;
		this.course = course;
	}
	
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
	public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId='" + studentId + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(studentId);
    }

}
