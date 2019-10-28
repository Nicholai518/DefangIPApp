package fun;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class DefangIPApplication {

	public static void main(String[] args) {

		Greeting();

		String ip = getIPAddress();

		String displayIP = defangIP(ip);
		
		JOptionPane.showMessageDialog(null, displayIP);

	} // End of Main method

	public static void Greeting() {
		JOptionPane.showMessageDialog(null, "This program allows you to defang an IP address.");

	}

	public static String getIPAddress() {
		String ipAddress = JOptionPane.showInputDialog("Enter your IP: ");

		return ipAddress;
	}

	public static String defangIP(String ipAddress) {

		// Declaring StringBuilder object
		StringBuilder builder = new StringBuilder(ipAddress.length() + 2 * 3);

		for (int i = 0; i < ipAddress.length(); i++) {
			char currentCharacter = ipAddress.charAt(i);

			if (currentCharacter == '.') {
				builder.append("[.]");
			} else {
				builder.append(currentCharacter);
			}
			
		}

		return builder.toString();

	} // End of defangIP method

} // End of Class
