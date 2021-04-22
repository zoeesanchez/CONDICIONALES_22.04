
package zsanchez;
import java.util.Scanner; 
public class condicionales_divisible6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada = new Scanner (System.in);
       int num=0;
        System.out.println("ingrese un numero: ");
       num=entrada.nextInt();
       for (int i=1; i<=num; i++) {
           if (i%6==0) {
               System.out.println(i);
           }
       }
}
}