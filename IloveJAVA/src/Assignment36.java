/**Establish values to chose from
 * Prompt user to select a value
 * User selects value 
 * display value that corresponds to previously selected value 
 * 
 * 
 */
	
import javax.swing.JOptionPane;
/**
 * 
 * @author brendanmcauliffe
 *
 */
public enum Assignment36 {January, February, March, April, May, June, July, August, September, October, November, December  ;  
	
	 public static void main(String[] args) { 
		 Assignment36[] choices = { Assignment36.January, Assignment36.February, Assignment36.March, Assignment36.April, Assignment36.May, Assignment36.June, Assignment36.July, Assignment36.August, Assignment36.September, Assignment36.October, Assignment36.November, Assignment36.December }; 
		 Assignment36 input = (Assignment36) JOptionPane.showInputDialog(null,"Select the Month.", "Month", 
	                                                                           JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]); 
	             while (input!=null) { 
	                      //Fill in switch case code below to check for account type and return appropriate Welcome message
	  switch(input){ 
	  case December: 
	  case January:
	  case February:
		  JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
	  break;
	  case March: 
	  case April:
	  case May:
		  JOptionPane.showMessageDialog(null, "Happy Spring days!");
	  break;		
	  case June: 
	  case July:
	  case August:
		  JOptionPane.showMessageDialog(null, "It’s a summer time.");
	  break;
	  case September: 
	  case October:
	  case November:
		  JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
	  break;
	  }
	  input = (Assignment36) JOptionPane.showInputDialog(null,"Select the Month.", "Month", 
              JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]); 
	             }
	 }
}
