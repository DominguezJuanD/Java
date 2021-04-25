import java.util.Scanner;

/**
 *
 * @author agustin
 */
public class PoloTic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        float A1, A2;
        char algo = 'a';
        String hola = "HOLAAA";
        int num1, num2 = 10;
        Clase1 clase = new Clase1();
        clase.setA(1);
        clase.setB(2);
        do{
            System.out.print("Dame num 1 \n");
            A1 = teclado.nextInt();
            if(A1==0){
               break;
            }
            //System.out.println("char ");
            //algo = teclado.next().charAt(0);
            System.out.println("dame num2 \n");
            A2 = teclado.nextInt();
            if((A1+A2) > 0){
                System.out.println("La suma es =  " + (A1+A2) + " La suma de la clase: " + clase.sumar());
            }
        }while (A1 != 0 && A2 != 0);

        do{
          System.out.println("Ingrese numero a comprobar si es multiplo de '10': ");
          num1 = teclado.nextInt();

          resto = num1%num2;
        if (resto==0)
            System.out.println(num1 + " ES multiplo de " + num2);
        else
            System.out.println(num1 + " NO es multiplo de " + num2);

        }while(num1 != 0);

    }

}
