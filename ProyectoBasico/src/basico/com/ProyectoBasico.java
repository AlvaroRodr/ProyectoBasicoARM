package basico.com;

public class ProyectoBasico {

	public static String logico(int a, int b) {
		String resultado=null;
		if (a > b) {
			resultado="\n"+a+" es mayor que "+b;
		}else {
			resultado="\n"+b+" es mayor que "+a;
		}
		return resultado;
	} 
	public static void main(String args[]) {
		
		System.out.print(logico(5,3));
		System.out.print(logico(2,34));
	}
}
