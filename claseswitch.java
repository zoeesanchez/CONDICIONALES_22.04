import java.util.Scanner;
package clase;

public class claseswitch {

    public static void main(String[] args) {
        // TODO code application logic here
        
Scanner dias=new Scanner(System.in);
        
System.out.println("Ingrese un numero para saber que dia es");

int dia=dias.nextInt();

        String nomdia;
        switch (dia)
        {case 1: nomdia="Lunes";
                 break;
        case 2: nomdia="Martes";
                 break;
        case 3: nomdia="Miercoles";
                 break;
        case 4: nomdia="Jueves";
                 break;
        case 5: nomdia="Viernes";
                 break; 
        case 6: nomdia="Sabado";
                 break;
        case 7: nomdia="Domingo";
                 break;
        
        default: nomdia="Dia invalido";
                 break;      
        }
          System.out.println(nomdia);
    }
    
}
