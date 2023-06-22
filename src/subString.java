//import java.util.HashSet;

import java.util.Scanner;

public class subString{
    public static void main(String []args){
        //HashSet hashset = new HashSet<>();
    String  names2 =" ";
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a String: ");
    String name1 = scanner.next();
    
    
    //while(name1 != null){
        for(int i = 0; i<= name1.length();i++){
            for(int j = i+1; j< name1.length(); j++)
        if (name1.charAt(i) !=name1.charAt(j)){
          names2 = Character.toString(name1.charAt(i));
           
          
         
        }
        
    }
    System.out.println(names2);
    
       

        


            }
        }

   