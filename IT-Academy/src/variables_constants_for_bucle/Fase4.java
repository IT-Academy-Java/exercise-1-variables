package variables_constants_for_bucle;

public class Fase4 {
	public static void main(String[] args) {
		String nom = "Elena";
		String cognom1 = "Piaggio";
		String cognom2 = "Valdivieso";
		int dia = 07;
		int mes = 11;
		int any = 1976;
		
		int anys_entre_traspas = 4;
		boolean is_any_traspas = false;
		String si_es_de_traspas = "El meu any de naixement és de traspàs.";
		String no_es_de_traspas = "El meu any de naixement NO és de traspàs.";
		
		String noms_cognoms = nom + " " + cognom1  + " " + cognom2;
		String naixement = dia + " / " + mes + " / " + any;
		
		if(any % anys_entre_traspas == 0) {
			is_any_traspas = true;
		}

		System.out.println("El meu nom és " + noms_cognoms);
		System.out.println("Vaig néixer el " + naixement);
		
		if(is_any_traspas) {
			System.out.println(si_es_de_traspas);
		} else {
			System.out.println(no_es_de_traspas);
		}
	}
}
