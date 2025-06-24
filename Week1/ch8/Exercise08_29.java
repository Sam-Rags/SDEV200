import java.util.Scanner;
/** This exercise demonstrates a way to iterate through 2 2D arrays
 * to determine if each contains the same values in the same places.
 */

public class Exercise08_29 {
    public static void main(String[] args) {
        //Init scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter m1 (a 3 by 3 matrix) row by row: ");
        String temp = input.nextLine();
        String regex = " ";

        /** splits the entered values by empty string (spaces) and
         * computes it into a 1-dimensonal array of String objects
         */
        String[] a1 = temp.split(regex);
        String[][] m1 = new String[3][3];

        int index = 0;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = a1[index];
                index++;
            }
        }

        System.out.println("Enter m2 (a 3 by 3 matrix) row by row: ");
        String temp2 = input.nextLine();
        
        // exactly the same as a1 above but instantiates a 2nd 1D array
        String[] a2 = temp2.split(regex);
        String[][] m2 = new String[3][3];

        int index2 = 0;
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = a2[index2];
                index2++;
            }
        }
    
        System.out.println("m1 & m2 are the same: " + equals(m1, m2));

    }    
    /** method for iterating 2 arrays will return false anytime a grid 
    coordinate doesn't match m1 & m2 */
    public static final boolean equals(String[][] m1, String[][] m2) {
            for (int i = 0; i < m1.length; i++) {
                if (m1[i].length != m2[i].length) 
                    return false;

            for (int j = 0; j <m1[i].length; j++) {
                if (!m1[i][j].equals(m2[i][j])) {
                    return false;
                }
                    
            }
            
        }return true;
        }
    }

    


