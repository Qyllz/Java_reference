import javax.swing.JOptionPane;

public class GUI {

	public static void main(String[] args) {
		
		String name =JOptionPane.showInputDialog("Enter your name!:");
		JOptionPane.showMessageDialog(null, "Heyy " + name);

		int age =Integer.parseInt(JOptionPane.showInputDialog("Enter your age!:"));
		JOptionPane.showMessageDialog(null, "you are " + age + " yrs old " + name);
		
		double height =Double.parseDouble(JOptionPane.showInputDialog("Enter your height!:(cm)"));
		JOptionPane.showMessageDialog(null, "you are" + height + "cm tall");
	}

}
