import java.util.*;

public class onlinejudge_10878_ {
	public static void main(String[] args) {
		
		// Setting up input and wasting one line (formatting reasons).
		Scanner input = new Scanner(System.in);
		input.nextLine();
		
		// Reading data until there is nothing left.
		while (true) {
			// Breaking up data into lines.
			String line = input.nextLine();
			// Creating a byte of data to organize bits.
			String aByte = "";
			
			// Iterating through each character in a line to interpret information (perform translation).
			for (int i = 0; i < line.length(); i++) { 
				if (line.charAt(i) == ' '){
					aByte += '0';
				} else if (line.charAt(i) == 'o'){
					aByte += '1';
				} else if (line.charAt(i) == '-') {break;}
				
				// Cutting off group of bits so that a single byte can be interpreted into a single character for all bytes. 
				if (aByte.length() == 8){
					// Converting string of bits into an integer into a character.
					// Below line basically found at https://stackoverflow.com/questions/4211705/binary-to-text-in-java
					System.out.print((char) Integer.parseInt(aByte, 2));
					// Resetting abyte for next byte.
					aByte = "";
				}
			}
			if (!input.hasNext()) {input.close(); break;}
		}
	}
}


