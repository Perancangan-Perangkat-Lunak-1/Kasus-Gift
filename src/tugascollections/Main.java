/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugascollections;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
import java.lang.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KIKI
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Family cute = new Family();
        Uncle fUncle;
        Niece fNiece;
        String uName, nName, present;
        int day, month;
        
        int menu;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("=  FAMILY  PRESENT  MANAGEMENET  =");
        
        do{
            cute.getMenu();
            System.out.print("\n> Enter menu number: ");
            menu = reader.nextInt();
            
            switch(menu){            
                case 1 : 
                    System.out.print("#" +menu);
                    
                    System.out.print("\n> Name of Uncle : ");
                    uName = reader.next();
                    
                    cute.addUncle(uName);
                break;
                
                case 2 :                    
                    System.out.print("#" +menu);
                    
                    System.out.print("\n> Name of Niece/Nephew  : ");
                    nName = reader.next();
                    System.out.print("> Day of Birth : ");
                    day = reader.nextInt();
                    System.out.print("> Month of Birth   : ");
                    month = reader.nextInt();
                    
                    cute.addNiece(nName, day, month);
                break;
                
                case 3 :
                    System.out.print("#" +menu);
                    
                    System.out.print("\n> Name of Uncle   : ");
                    uName = reader.next();
                    fUncle = cute.findUncle(uName);
                    if(fUncle != null){
                        System.out.print("> Name of Niece/Nephew : ");                
                        nName = reader.next();
                        fNiece = cute.findNiece(nName);
                        if(fNiece!=null){
                            System.out.print("> Presents : ");
                            present = reader.next();
                            
                            if (!cute.isPresentExist(present)) {
                                cute.addPresent(present);
                                fUncle.addPresent(fNiece, present);
                            }                       
                        }
                    }
                break;                
                
                case 4 :
                    System.out.print("#" +menu+"\n");
                    cute.listUncles();break;
                    
                case 5 :
                    System.out.print("#" +menu+"\n");
                    cute.listNieces();break;
                    
                case 6 :
                    System.out.print("#" +menu);
                    
                    System.out.print("\n> Name of Uncle : ");
                    uName = reader.next();
                    
                    fUncle = cute.findUncle(uName);
                    if(fUncle != null){
                        fUncle.listPresents();
                    }
                break;
                
                case 7 :
                    System.out.print("#" +menu);
                    
                    System.out.print("\n> Name of Niece/Nephew : ");
                    nName = reader.next();
                    
                    fNiece = cute.findNiece(nName);
                    if(fNiece != null){
                        fNiece.listPresents();
                    }
                break;
                
                case 8 :
                    System.out.print("#" +menu);
                    
                    System.out.print(" Name of Niece/Nephew : ");                
                    nName = reader.next();
                    fNiece = cute.findNiece(nName);
                    if(fNiece != null){
                        System.out.println("Numbers of deleted present : " +fNiece.clearPresents());
                    }
                break;
            }
            
        }while(menu != 0);
        
       System.exit(0);
           
    }
    
}
