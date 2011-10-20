import java.util.Scanner;

import javax.swing.JOptionPane;


public class Baskara {
	public static void main(String[] args) throws BaskaraException {
				
			String entradaStringA = JOptionPane.showInputDialog("Digite o valor de a");	
			String entradaStringB = JOptionPane.showInputDialog("Digite o valor de b");
			String entradaStringC = JOptionPane.showInputDialog("Digite o valor de c");
			
			int a = Integer.parseInt(entradaStringA);
			int b = Integer.parseInt(entradaStringB);
			int c = Integer.parseInt(entradaStringC);
			
			calcular(a, b, c);
			String[] raizes = trasformaStrings(a,b,c);
			
			  JOptionPane.showMessageDialog(null, "x' é igual a:" +raizes[0]+"  e  x´´ é igual a:"+raizes[1] );
		 
	}

	private static String[] trasformaStrings(int a, int b, int c) throws BaskaraException {
		double[] resultado = calcular(a, b, c);
		String[] raizes = new String [2];
		raizes[0] = "" + resultado[0];
		raizes[1] = "" + resultado[1];
	
		return raizes;
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
