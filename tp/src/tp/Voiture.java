package tp;

public class Voiture {

	private String marque;
	private String modele;
	private double vitesse;
	private int annee;

	// constructeur par defaut
	public Voiture() {
		this.marque = "Inconnue";
		this.modele = "Standard";
		this.vitesse = 0.0;
		this.annee = 2024;

	}

	// constructeur parametre
	public Voiture(String marque, String modele, double vitesse, int annee) {
		this.marque = marque;
		this.modele = modele;
		this.vitesse = vitesse;
		this.annee = annee;

	}

	// Constructeur de copie
	public Voiture(Voiture autreVoiture) {
		this.marque = autreVoiture.marque;
		this.modele = autreVoiture.modele;
		this.vitesse = autreVoiture.vitesse;
		this.annee = autreVoiture.annee;

	}

	// Getters (déjà définis)
	public String getMarque() {
		return marque;
	}

	public String getModele() {
		return modele;
	}

	public double getVitesse() {
		return vitesse;
	}

	public int getAnnee() {
		return annee;
	}

	// Setters avec validations
	public void setMarque(String marque) {
		if (marque != null && !marque.trim().isEmpty()) {
			this.marque = marque;
		} else {
			System.out.println("Erreur : La marque ne peut pas être vide.");
		}
	}

	public void setModele(String modele) {
		if (modele != null && !modele.trim().isEmpty()) {
			this.modele = modele;
		} else {
			System.out.println("Erreur : Le modèle ne peut pas être vide.");
		}
	}

	public void setVitesse(double vitesse) {
		if (vitesse >= 0) {
			this.vitesse = vitesse;
		} else {
			System.out.println("Erreur : La vitesse ne peut pas être négative.");
		}
	}

	public void setAnnee(int annee) {
		int anneeCourante = java.time.Year.now().getValue();
		if (annee > 1885 && annee <= anneeCourante) {
			this.annee = annee;
		} else {
			System.out.println("Erreur : L'année doit être entre 1886 et " + anneeCourante + ".");
		}
	}

	// Méthodes métier
	public void accelerer(double augmentation) {
		if (augmentation > 0) {
			this.vitesse += augmentation;
			System.out.println(marque + " " + modele + " accélère de " + augmentation + " km/h. Nouvelle vitesse : "
					+ vitesse + " km/h.");
		} else {
			System.out.println("Erreur : L'augmentation de vitesse doit être positive.");
		}
	}

	public void freiner(double reduction) {
		if (reduction > 0) {
			if (this.vitesse - reduction < 0) {
				this.vitesse = 0;
				System.out.println(marque + " " + modele + " s'arrête complètement.");
			} else {
				this.vitesse -= reduction;
				System.out.println(marque + " " + modele + " freine de " + reduction + " km/h. Nouvelle vitesse : "
						+ vitesse + " km/h.");
			}
		} else {
			System.out.println("Erreur : La réduction de vitesse doit être positive.");
		}
	}

	public void afficherInformations() {
		System.out.println("=== Informations de la Voiture ===");
		System.out.println("Marque : " + marque);
		System.out.println("Modèle : " + modele);
		System.out.println("Vitesse actuelle : " + vitesse + " km/h");
		System.out.println("Année : " + annee);
	}

}
