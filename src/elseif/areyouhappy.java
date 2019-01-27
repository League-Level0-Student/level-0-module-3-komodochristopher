package elseif;

import javax.swing.JOptionPane;

public class areyouhappy {
	public static void main(String[] args) {
		int x = JOptionPane.showConfirmDialog(null, "are you happy?");
		if (x == 1) {
			x=JOptionPane.showConfirmDialog(null, "do you want to be happy?");
			if (x == 0) {
				JOptionPane.showMessageDialog(null, "change something");
				
			 if (x==0) {
					JOptionPane.showMessageDialog(null, "keep doing whatever you're doing");
				}
			}
		}
	}
}
