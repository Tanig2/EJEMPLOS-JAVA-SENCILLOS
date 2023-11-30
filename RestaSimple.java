import java.util.Scanner; //esto siempre

public class RestaSimple {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in); //Primero declaramos el objeto sc
	
	//Pido el primer numero
	System.out.println("Introduce un número: ");
	
	//ahora tiene que leerlos
	int num1 = sc.nextInt();
	
	//pido el segundo numero
	System.out.println("Introduce el segundo núumero");
	int num2 = sc.nextInt();
	
	if (num1 == num2) {
		System.out.printf("Los dos números introducidos son iguales");
	}
	
	else if (num1>num2) {
		System.out.printf("La resta es: %d",(num1-num2));
		
	}
	
	else System.out.printf("La resta es: %d",(num2-num1));
	
	//Cierro el objeto Scanner
	
	sc.close();
	

	}

}
