//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		 Robot bob = new Robot();
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog(null, "what color do you want ?");
		//5. Use an if/else statement to set the pen color that the user requested
if(color.equals("red")) {
bob.setPenColor(Color.red);
}
if(color.equals("blue")) {
bob.setPenColor(Color.blue);
}  
if(color.equals("green")) {
bob.setPenColor(Color.green);
}     
//6. If the user doesn’t enter anything, choose a random color
else {
	bob.setRandomPenColor();
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		for (int i=0;i<10;i++) {
		//4. Set the pen width to 10
		bob.setPenWidth(10);
    //2. Make the robot draw a shape (this will take more than one line of code)
bob.setSpeed(100);
bob.penDown();
bob.move(100);
bob.setAngle(90);
bob.move(300);
bob.setAngle(180);
bob.move(200);
bob.setAngle(270);
bob.move(250);
bob.move(50);
bob.setAngle(360);
bob.move(200);
	}} }
