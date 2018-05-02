import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog(null, "What number do u want to see if its a prime number.");
	int numb = Integer.parseInt(answer);
for (int i = 2; i < numb; i++) {
	

	if (numb % i == 0) {
		JOptionPane.showMessageDialog(null, "That number aint prime!");
		System.exit(0);
	}
	
}
JOptionPane.showMessageDialog(null, "Thats prime");
}
}
