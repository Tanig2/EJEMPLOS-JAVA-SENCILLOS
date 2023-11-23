import java.util.Scanner;

public class TablaM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc;
		int numero, contador;
		sc= new Scanner(System.in);
		
		System.out.println("Introduce un numero, por favor"); // si ponemos solo print no hace salto de linea
		numero=sc.nextInt();
		
		contador = 0;
		while (contador<=10) {
			System.out.printf("el numero %f por %d es igual %d\\n", numero, contador,(numero*contador));
			contador+=1;
		}
 sc.closed();
	}

}
