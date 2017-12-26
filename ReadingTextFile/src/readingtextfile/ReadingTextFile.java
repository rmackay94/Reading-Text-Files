/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readingtextfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Robbie Mackay
 * Student Number: 16003059
 * 
 * 18/12/2017
 * Version: 4
 */

/*
This demonstrates reading a text file and outputing the contents to the consol line by line.
This version read the temp.txt file located in the useres appdata
This version splits the lines into chars then stores them in a 2D array
*/
public class ReadingTextFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        System.out.println(System.getenv("APPDATA"));
        
        File file = new File(System.getenv("APPDATA") + "//temp.txt");
        
        Scanner scanner = new Scanner(file);
        
        String lines[] = new String[3];
        char charecters2[][] = new char[3][6];
        
        int i = 0;
        while (scanner.hasNextLine()) {
            
            lines[i] = scanner.nextLine();
            char charecters[] = lines[i].toCharArray();
            int j = 0;
            while (j < charecters.length) {
                charecters2[i][j] = charecters[j];
                System.out.println(charecters2[i][j]);
                j++;
            }

            i++;
        }
        
        System.out.println(charecters2[0][0]);
        System.out.println(charecters2[2][5]);
        System.out.println(charecters2[1][3]);
        
        int x = 0;
               
        while (x < 3) {
            int y = 0;
            while (y < 6) {
                System.out.print(charecters2[x][y]);
                y++;
            }  
            System.out.println("");
            x++;
        }

        
    }
    
}
