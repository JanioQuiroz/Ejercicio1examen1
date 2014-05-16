import java.util.Scanner;


public class Ejercicio1examen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a= new Scanner(System.in);
		System.out.print("Ingrese calificacion del 1 a 5 para The Amazing SpiderMan II: ");
		int valor = a.nextInt();
		
		switch (valor)
		{
		case 1 :
			System.out.print("Pesima");
		break;

		case 2 :
			System.out.print("Mala");
		break;

		case 3 :
			System.out.print("Regular");
		break;

		case 4 :
			System.out.print("Buena");
		break;
		case 5 :
			System.out.print("Excelente");
		break;

		default:
			System.out.print("Califacion no Reconocida");
			break;
		}
		
	}

}
