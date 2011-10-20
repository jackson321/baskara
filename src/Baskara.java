import java.util.Scanner;


public class Baskara {
	public static void main(String[] args) throws BaskaraException {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor de a: ");
		String entradaStringA = entrada.nextLine();
		System.out.print("Digite o valor de b: ");
		String entradaStringB = entrada.nextLine();
		System.out.print("Digite o valor de b: ");
		String entradaStringC = entrada.nextLine();
		
		int a = Integer.parseInt(entradaStringA);
		int b = Integer.parseInt(entradaStringB);
		int c = Integer.parseInt(entradaStringC);
		
		calcular(a, b, c);
		
		System.out.print("as raizes são: " );
		
		 
	}


	public static double[] calcular(int a, int b, int c) throws BaskaraException {
		double delta =(b * b)- (4 * a * c);
		double [] raizes = new double[2];
		if(delta >= 0 ){
			raizes[0] =  (((-b) + Math.sqrt(delta)))/(2 * a);
			raizes[1]=   (((-b) - Math.sqrt(delta)))/(2 * a);
		} else{
			throw new BaskaraException();
		}
		
		return raizes;
	}
}
