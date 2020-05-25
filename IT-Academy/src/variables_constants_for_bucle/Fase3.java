package variables_constants_for_bucle;

public class Fase3 {
	public static void main(String[] args) {
		final int any_traspas = 1948;
		int anys_entre_traspas = 4;
		int any_naixement = 1976;
		boolean is_any_traspas = false;
		
		String si_es_de_traspas = "Aquest any es de traspas.";
		String no_es_de_traspas = "Aquest any NO es de traspas";
		
		for (int i = any_traspas; i <= any_naixement; i++) {
			if(i % anys_entre_traspas == 0) {
				is_any_traspas = true;
				System.out.println("\n" + i + "->" + si_es_de_traspas); 
			} else {
				is_any_traspas = false;
				System.out.println(i + "->" + no_es_de_traspas);
			}
		}
	}
}
