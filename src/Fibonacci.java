
public class Fibonacci {
public static void main(String[] args) {
int other = 1;
int high = 0;
int low = 1;
for (int i = 0; i < 10; i++) {
other = high;
high = low + high;
low = other;
System.out.println(high);	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
