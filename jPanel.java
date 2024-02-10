import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class jPanel {

	public static void main(String[] args) {
		// for her 
		
		JLabel label = new JLabel();
		label.setText("Bri's fave colorsszzz");
		
		
		JPanel pinkPanel = new JPanel();
		pinkPanel.setBackground(new Color(0xffc0cb));
		pinkPanel.setBounds(0,0,250,250);
		
		JPanel cyanPanel = new JPanel();
		cyanPanel.setBackground(new Color(0x7FFFD4));
		cyanPanel.setBounds(250,0,250,250);
		
		JPanel purplePanel = new JPanel();
		purplePanel.setBackground(new Color(0xb19cd9));
		purplePanel.setBounds(250,250,250,250);
		
		JPanel khakiPanel = new JPanel();
		khakiPanel.setBackground(new Color(0xF0E68C));
		khakiPanel.setBounds(0,250,250,250);
		
		JFrame frame = new JFrame();
		frame.setTitle("Bri's fave colorssszzz");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(690,690);
		frame.setLayout(null);
		pinkPanel.add(label);
		frame.add(pinkPanel);
		frame.add(cyanPanel);
		frame.add(purplePanel);
		frame.add(khakiPanel);
		
		/*ImageIcon image = new ImageIcon("she.png");
		frame.setIconImage(image.getImage()); */
		
		
		
		
		
		
	}

}
