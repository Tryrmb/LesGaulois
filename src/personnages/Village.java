package personnages;

public class Village {
	private String nom;
	private Chef chef;
    private Gaulois[] villageois;
    private int nbVillageois;
    private int nbVillageoisMaximum;
    
    public Village(String nom, int nbVillageoisMaximum) {
        this.nom = nom;
        this.nbVillageoisMaximum = nbVillageoisMaximum;
        this.villageois = new Gaulois[nbVillageoisMaximum];
        this.nbVillageois = 0;
    }
    
    public void setChef(Chef chef) {
        this.chef = chef;
    }
    
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois habitant) {
        if (nbVillageois < nbVillageoisMaximum) {
            villageois[nbVillageois] = habitant;
            nbVillageois++;
        } else {
            System.out.println("Le village est plein, impossible d'ajouter un nouvel habitant.");
        }
    }
	
	public Gaulois trouverHabitant(int numero) {
        if (numero >= 1 && numero <= nbVillageois) {
            return villageois[numero - 1];
        } else {
            System.out.println("Aucun habitant trouvé pour le numéro donné.");
            return null;
        }
    }

    public void afficherVillageois() {
        System.out.println("Chef du village : " + chef.getNom());
        for (int i = 0; i < nbVillageois; i++) {
            System.out.println("Villageois " + (i + 1) + ": " + villageois[i].getNom());
        }
    }
    
    public static void main(String[] args) {
        Village village = new Village("Village des Irréductibles", 30);
        
        // Exemple de levée d'exception
        // Gaulois gaulois = village.trouverHabitant(30);
        // System.out.println(gaulois);
        // Cela lèvera une ArrayIndexOutOfBoundsException car l'index 30 est hors limites pour le tableau villageois.
        
        Chef abraracourcix = new Chef("Abraracourcix", 6, village);
        village.setChef(abraracourcix);
        
        Gaulois asterix = new Gaulois("Astérix", 8);
        village.ajouterHabitant(asterix);
        
        // Exemple de récupération d'un habitant
        // Gaulois gaulois = village.trouverHabitant(1);
        // System.out.println(gaulois);
        // Cela affichera "Astérix" car Astérix est le premier habitant du village.
        
        village.afficherVillageois();
        
        Gaulois obelix = new Gaulois("Obélix", 25);
        village.ajouterHabitant(obelix);
        
        village.afficherVillageois();
    }

}
