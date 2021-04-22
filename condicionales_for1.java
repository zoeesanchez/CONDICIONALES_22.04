
package zsanchez;
public class condicionales_for1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num =1;
        
        for(int i=0; i<=100; i++){
            if(num %2==0||num%3==0){
                System.out.println(num);
            }
        
        num++;
    }
   } 
}
