import java.util.Scanner;
public class switchcaracteres {
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner entrada = new Scanner(System.in); 
        char caracter;
        System.out.println("INGRESE UN CARACTER Y LE DIGO SI ES VOCAL: ");
        caracter= entrada.next().charAt(0); 
        
        switch(caracter)
        { case 'a': System.out.println("EL CARACTER ES UNA VOCAL, ES LA A");
               break;
        case 'e': System.out.println("EL CARACTER ES UNA VOCCAL, ES LA E");
               break;
        case 'i': System.out.println("EL CARACTER ES UNA VOCAL, ES LA I");
               break;
        case 'o': System.out.println("EL CARACTER ES UNA VOCAL, ES LA O");
              break;
        case 'u': System.out.println("EL CARACTER ES UNA VOCAL, ES LA U");
              break; 
        
        default:System.out.println("EL CARACTER NO ES UNA VOCAL");
              break; 
        }
    }
    
}
