package tp;

public class Test {

	public static void main(String[] args) {

		Voiture voiture1 = new Voiture();
		// voiture1.afficherInformations();

		Voiture voiture2 = new Voiture("Tesla", "Model 3", 0.0, 2024);
		// voiture2.afficherInformations();

		Voiture voiture3 = new Voiture(voiture2);
		// voiture3.afficherInformations();

		/*
		 * System.out.println("\n Comparaison des objets :");
		 * System.out.println("voiture1 == voiture2 ? " + (voiture1 == voiture2));
		 * System.out.println("voiture2 == voiture3 ? " + (voiture2 == voiture3));
		 * 
		 * System.out.println("Modification de voiture2 "); voiture2.accelerer(100);
		 * voiture2.freiner(20); voiture2.afficherInformations();
		 * 
		 * System.out.println("\n Modification de voiture3 "); voiture3.accelerer(80);
		 * voiture3.afficherInformations();
		 * 
		 * System.out.println("\nTest des setters avec validation ");
		 * voiture2.setVitesse(-5); voiture2.setAnnee(1700); voiture2.setMarque("");
		 * voiture2.afficherInformations();
		 * 
		 * System.out.println("\n Comparaison finale ");
		 * voiture2.afficherInformations(); voiture3.afficherInformations();
		 */

		System.out.println("=== TESTS DES VALIDATIONS ===");

		Voiture voiture = new Voiture("Renault", "Clio", 0.0, 2022);

		// Test 1 : Vitesse négative
		System.out.println("\nTest 1 : Vitesse négative");
		voiture.setVitesse(-10);
		System.out.println("Vitesse actuelle : " + voiture.getVitesse());

		// Test 2 : Vitesse nulle
		System.out.println("\nTest 2 : Vitesse nulle");
		voiture.setVitesse(0);
		System.out.println("Vitesse actuelle : " + voiture.getVitesse());

		// Test 3 : Année invalide (trop ancienne)
		System.out.println("\nTest 3 : Année invalide (trop ancienne)");
		voiture.setAnnee(1800);
		System.out.println("Année actuelle : " + voiture.getAnnee());

		// Test 4 : Année invalide (future)
		System.out.println("\nTest 4 : Année invalide (future)");
		voiture.setAnnee(2050);
		System.out.println("Année actuelle : " + voiture.getAnnee());

		// Test 5 : Marque vide
		System.out.println("\nTest 5 : Marque vide");
		voiture.setMarque("");
		System.out.println("Marque actuelle : " + voiture.getMarque());

		// Test 6 : Marque null
		System.out.println("\nTest 6 : Marque null");
		voiture.setMarque(null);
		System.out.println("Marque actuelle : " + voiture.getMarque());
		// Test 7 : Modele null
		System.out.println("\nTest 7 : Modele null");
		voiture.setModele(null);
		System.out.println("Modele actuel : " + voiture.getModele());

		// Test 8 : Accélération négative
		System.out.println("\nTest 8 : Accélération négative");
		voiture.accelerer(-50);
		System.out.println("Vitesse actuelle : " + voiture.getVitesse());

		// Test 9 : Freinage excessif
		System.out.println("\nTest 9: Freinage excessif");
		voiture.setVitesse(20);
		voiture.freiner(50);
		System.out.println("Vitesse actuelle : " + voiture.getVitesse());

		voiture.afficherInformations();
	}
}
