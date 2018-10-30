package naturalperfecto;
import java.util.Scanner;
public class NaturalPerfecto {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el número:");
        int N = leer.nextInt();
        int i, suma=0, n=0;
        for(i=1;i<N;i++)
        {
            if(N%i==0)
            {
                suma=suma+i;
            }
        }
        if(suma==N)
        {
            System.out.println("El numero es natural perfecto");
        }
        else
        {
            System.out.println("El numero no es natural perfecto");
        }
    }
    
}
