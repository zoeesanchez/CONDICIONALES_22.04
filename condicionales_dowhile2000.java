/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zsanchez;

/**
 *
 * @author pc05
 */
public class condicionales_dowhile2000 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int num=1;
      do { System.out.println(num);
      num++;
      }
      while (num<=2000); {
        if (num%10==0){
            System.out.println(num);
        }
        num++; 
    }
         
        
    }
    
}
          
