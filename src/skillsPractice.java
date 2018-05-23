import javax.swing.JOptionPane;

public class skillsPractice {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Hello! I'm a counting assistant!");
	String numb = JOptionPane.showInputDialog(null, "What number do you want me to count to?");
	int count = Integer.parseInt(numb);
	for (int i = 1; i <= count; i++) {
		System.out.println(i);
	}
		
	}
	}


