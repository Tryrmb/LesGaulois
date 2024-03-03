package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;
	
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
        return nom;
    }
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");

	}

	private String prendreParole() {
		// TODO Auto-generated method stub
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		 int forceCoup = force / 3 * effetPotion;
	     System.out.println(nom + " envoie un coup avec une force de " + forceCoup + " dans la mâchoire de "+ romain.getNom());
	     romain.recevoirCoup(forceCoup);
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion="+ effetPotion + "]";
	}
	
    public void boirePotion(int forcePotion) {
        effetPotion = forcePotion;
        System.out.println(nom + " : Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée.");
    }
	
	public static void main(String[] args) {
		// Créer un objet asterix de la classe Gaulois
	    Gaulois asterix = new Gaulois("Astérix", 8);
	    // Afficher l'objet asterix
	    System.out.println("Nom de l'objet : " + asterix.getNom());
	    System.out.println(asterix);
	    
	 // Vérification de la méthode prendreParole
	    String parole = asterix.prendreParole();
	    System.out.println(parole); // Devrait afficher "Le gaulois Astérix : "

	    // Vérification de la méthode parler
	    asterix.parler("Bonjour à tous");

	    // Création d'un objet Romain pour tester la méthode frapper
	    Romain romain = new Romain("Minus", 6);
	    asterix.frapper(romain);

        asterix.boirePotion(3);
	}
	
}
