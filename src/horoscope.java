import javax.swing.JOptionPane;

public class horoscope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Zodiacs =JOptionPane.showInputDialog(null, "what is your Zodiac sign");

if(Zodiacs.equals("snake")) {
JOptionPane.showMessageDialog(null,"you are mysterious and vicious " );
}
if(Zodiacs.equals("ox")) {
JOptionPane.showMessageDialog(null,"you are proud and confident " );
}
if(Zodiacs.equals("dragon")) {
JOptionPane.showMessageDialog(null,"you are nature and your're wise" );
}
if(Zodiacs.equals("rabbit")) {
JOptionPane.showMessageDialog(null,"You are cute and fuzzy " );
}
if(Zodiacs.equals("dog")) {
JOptionPane.showMessageDialog(null,"You are friendly and playful" );
}
if(Zodiacs.equals("horse")) {
JOptionPane.showMessageDialog(null,"you are fast and have passion " );
}
if(Zodiacs.equals("pig")) {
JOptionPane.showMessageDialog(null,"You are smart and intelligent unlike other animals");
}
if(Zodiacs.equals("sheep")) {
JOptionPane.showMessageDialog(null,"You are most gentle and calm " );
}
if(Zodiacs.equals("monkey")) {
JOptionPane.showMessageDialog(null,"You are clever" );
}
if(Zodiacs.equals("rooster")) {
JOptionPane.showMessageDialog(null," you wake people up early" );
}
if(Zodiacs.equals("rat")) {
JOptionPane.showMessageDialog(null,"You are fast and scurry ");
}
else {
JOptionPane.showMessageDialog(null,"That's not a zodiac sign! " );
}

	}
}
