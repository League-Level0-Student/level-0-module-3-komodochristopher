package elseif;

import javax.swing.JOptionPane;

public class areyouhappy {

	public static void main(String[] args) {

		String happy = JOptionPane.showInputDialog(null, "are you happy?");

		if (happy.equals("yes")) {
			JOptionPane.showMessageDialog(null, "keep doing whatever your doing.");
		}

		if (happy.equals("no")) {
			happy = JOptionPane.showInputDialog(null, "do you want to be happy?");

			if (happy.equals("yes")) {
				JOptionPane.showMessageDialog(null, "change something");
			} else {

				// if (happy.equals("yes")) {
				JOptionPane.showMessageDialog(null, "keep doing whatever your doing.");
				// }

			}

		}
	}
}
