import java.util.Scanner; 
public class condicionales_while6 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num=0;
        System.out.println("ingrese un numero: ");
        num=entrada.nextInt();
        int a=0;
        while (a<=num){
            if (a%6==0) {
                System.out.println(a);
            }
            a++; 
        }
    }
    
}
