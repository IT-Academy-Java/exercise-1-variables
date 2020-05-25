package variables_constants_for_bucle;

public class Fase2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int any_traspas = 1948;
		int anys_entre_traspas = 4;
		int any_naixement = 1976;
		int cont = 0;
		
		for (int i = any_traspas; i <= any_naixement; i++) {
			if(i % 4 == 0) {
				cont ++;
			}
		}
		System.out.println("Des de " + any_traspas + " fins a " + any_naixement + " hi ha: " + cont + " anys de traspàs." );
	}
}
