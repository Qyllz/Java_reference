
public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student("Nigga", 123, "Math");
		Student s2 = new Student("NIGGA", 123, "Math");
		// for the equals() and for the hashCode()
		System.out.println("s1 equals s2:" + s1.equals(s2));
		System.out.println("s1 hashcode: " + s1.hashCode());
		System.out.println("s2 hashcode: " + s2.hashCode());
		// for toString()
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		// for getters and setters
		s1.SetName("brianigga");
		s1.SetCourse("IS gurly");
		System.out.println("s1 updated: " + s1);

	}

}
