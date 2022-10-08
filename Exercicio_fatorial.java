import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {

    Scanner sc = new Scanner (System.in);

    int numero;
    double fatorial = 1;

      System.out.print ("Digite um Numero: ");
      numero = sc.nextInt ();


    for (int i = 1; i <= numero; i++)
      {

    fatorial = fatorial * i;

      }

    System.out.printf ("Resultado: %.2f " , fatorial);


    sc.close ();
  }
}