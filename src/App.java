import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      // tehdään muuttujat
        int numero = 2;
        int numero1 = 3;
      Scanner in = new Scanner(System.in);
          // kysytään ensimmäistä numeroa
         System.out.println("First number?");
          numero = in.nextInt();{
          }
         // kysytään toista numeroa
        System.out.println("Second number?");
          numero1 = in.nextInt();
        // Summataan muuttujat yhteen
         int sum = (numero + numero1);
          
         // printataan vastaus
        System.out.println("The sum is. " + sum + "." );


         // ohjelma valmis
         
    }
}
  