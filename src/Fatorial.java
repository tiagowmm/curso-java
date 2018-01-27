
public class Fatorial {

	public static void main(String[] args) {

		int resultado = 1;
		int fatorial = 6;

		for (int i = 1; i <= fatorial; i++) {
			resultado *= i;
		}
		System.out.println(resultado);
		
		double fat = 1;
		for (int n = 1; n <= 40; n++) {
			fat *= n;
			System.out.println("fat("+n+")=" + fat );
		}
	}
}
