package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
String num = JOptionPane.showInputDialog("Give a Number!");
int i = 0;
for ( i = 2; i < Integer.parseInt(num); i++) {
	

if (Integer.parseInt(num) % i == 0) {
	JOptionPane.showMessageDialog(null, num + " is not prime!( ͡° ͜ʖ ͡°)");
	break;
}
}
 if (i == Integer.parseInt(num) ) 
	{
		JOptionPane.showMessageDialog(null, num + " is prime!( ͡° ͜ʖ ͡°)");
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
