/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectjava;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
/**
 *
 * @author akhil
 */
public class FinalProjectJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File something[]= new File [10];
        for(int i = 0; i <something.length;i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Please neter a file or directory path: ");
            String path = input.next();
            something[i] = new File(path);
        }
         Processing element = new Processing(something);
    }
}


