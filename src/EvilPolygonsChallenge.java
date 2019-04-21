
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot bob = new Robot();
		//2. Set the speed to 100
		bob.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "What color would you like?", "Color Choice", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Black", "Green"}, 0);
		System.out.println(colorChoice);
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice == 0) {
		bob.setPenColor(Color.red);
		}
		if(colorChoice ==1) {
			bob.setPenColor(Color.black);
			}
		if(colorChoice == 2) {
			bob.setPenColor(Color.green);
			}
		//4. Ask the use how many polygons they want to be drawn.
		String poly = JOptionPane.showInputDialog("How many polygons do you want to have?");
		int pol = Integer.parseInt(poly);
		//5. Use the robot to draw the number of polygons the user requested.
		for(int j=0;j < pol;j++) {	
			for(int i=0;i<6;i++) {
			bob.penDown();
			bob.move(100);
			bob.turn(360/6);
	
		}
			bob.move(15);
		}
		//6. Make it so your shapes do not overlap
		
		//7. Challenge: add more colors to the Option Dialog.
	}
}

