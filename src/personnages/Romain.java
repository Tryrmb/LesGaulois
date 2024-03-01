package personnages;

public class Romain {
	
	private String nom;
	private int force;
	
	public Romain(String nom , int force) {
		this.nom=nom;
		this.force=force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
		}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		force =- forceCoup;
		if (force > 0) {
			parler("Aie...");
		}else {
			parler("J'abandonne...");

		}
		
	}
	
	public class Main {
	    public static void main(String[] args) {
	        // V�rification des m�thodes dans la classe Romain
	        Romain romain = new Romain("Un Romain", 10);
	        romain.prendreParole(); // V�rification de la m�thode prendreParole
	        romain.parler("Je suis un Romain"); // V�rification de la m�thode parler
	        romain.recevoirCoup(3); // V�rification de la m�thode recevoirCoup
	        Romain Minus = new Romain("Minus", -6);
	    }
	}


}
