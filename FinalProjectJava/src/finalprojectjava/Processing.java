/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectjava;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.String;
/**
 *
 * @author akhil
 */
public class Processing {
    File entre[];
    int lines_num;
    public Processing(File entre[]){
        this.entre = entre;
    }
   void Split(String Entry,int lines) throws IOException{
       int count = 1;
       int filelines = lines_num/lines;
       String array1[] = Entry.split(". ! ?");
       int c = 0;
       int d = lines;
       if (lines > 1){
         for(int i = 0;i < filelines;i++){ 
           try{
               File myObj = new File ("file"+count+".txt");
               if (myObj.createNewFile()){
                   System.out.print("File created: "  + myObj.getName());
                   while(d!=lines_num){
                     for(int j = c; j < d; j++){
                       FileWriter myWrite = new FileWriter(myObj.getName());
                       myWrite.write(array1[j] + ".");
                       myWrite.close();
                       System.out.println("successfully wrote to the file.");
                   }
               }
               }
               else{
                   System.out.println("File already exists.");
               }
           }
           catch(IOException e){
               System.out.println("an error occurred.");
               e.printStackTrace();
           }
           c = c + lines;
           d = d + lines;
           count++;
       }
       }
       else{
           System.out.println("No Lines in the file");
       }
   }
   void List(File Entry[],int max){
       File Directories[] = null;
       for(int i = 0; i < Entry.length;i++){
           if(Entry[i].isDirectory()){
               Directories[i] = Entry[i];
           }
       }
       for(int j = 0; j <Directories.length;j++){
           File a[];
           a= Directories[j].listFiles();
           for(int k = 0; k < max;k++){
               System.out.println(a[k]);
           }
       }
   }
   void Rename(File Entry[],String suffix){
       for(int j = 0; j < entre.length;j++){
            String filename = entre[j].getName();
            String [] array= filename.split(".");
            array[0] = array[0] + suffix;
           for(int i = 0;i < array.length;i++){
               System.out.print(array[i] + " ");
           }
       }
   }
   void Print(File Entry[]){
       for(int i = 0; i < Entry.length;i++){
           System.out.println(Entry[i].getName() + " "+Entry[i].length()+" "+Entry[i]);
       }
   }
   
   
}

