/* PROJECT:  VowelCounter
 * AUTHOR:Drew Rautenberg DESIGNER:  Dr. Kaminski
 * DESCRIPTION:  This uses a while loop to count the number of vowels, spaces
 *      and consonants/other char's that are in a name entered by the user.
 *      It then displays these 3 counts in the Console window.
 * NOTE:  charAt(i) will get you the char at position specified in ( )
 *      - positions start at 0, not 1
 *      - positions end at theString.length() - 1, not theString.length()
 * NOTE:  Use a SWITCH statement to determine which counter to add 1 to.
 ****************************************************************************/

import javax.swing.JOptionPane;

public class VowelCounter {

    public static void main(String[] args) {

        // ---------------------------------------------- VARIABLE DECLARATIONS
        String university;
        int i = 0;
        int nVowels = 0;
        int nSpaces = 0;
        int nOther = 0;
        // -------------------------------------------------------------- INPUT
        university = JOptionPane.showInputDialog("Enter university name");
        // --------------------------------------------------------- PROCESSING










        // ------------------------------------------------------------- OUTPUT
        System.out.printf("%s has\n\t%d vowels, %d spaces, %d other chars\n",
                university, nVowels, nSpaces, nOther);
        // ---------------------------------------------------------- FINISH-UP
        System.exit(0);
    }
}