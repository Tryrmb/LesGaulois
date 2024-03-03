package personnages;
import java.util.Random;

public class Druides {
    private String nom;
    private int effetPotionMin;
    private int effetPotionMax;
    private int forcePotion = 1;

    public Druides(String nom, int effetPotionMin, int effetPotionMax) {
        this.nom = nom;
        this.effetPotionMin = effetPotionMin;
        this.effetPotionMax = effetPotionMax;
        parler("Bonjour, je suis le druide " + nom
                + " et ma potion peut aller d'une force " + effetPotionMin + " à "
                + effetPotionMax + ".");
    }

    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "« " + texte + "»");
    }

    private String prendreParole() {
        return "Le druide " + nom + " : ";
    }

    public void preparerPotion() {
        Random random = new Random();
        int forcePotion = random.nextInt(effetPotionMax - effetPotionMin + 1) + effetPotionMin;

        if (forcePotion > 7) {
            parler("J'ai préparé une super potion de force " + forcePotion);
        } else {
            parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + forcePotion);
        }
    }

    public void booster(Gaulois gaulois) {
        if (gaulois.getNom().equals("Obélix")) {
            parler("Non, Obélix !... Tu n’auras pas de potion magique !");
        } else {
            gaulois.boirePotion(effetPotionMax);
        }
    }

    public static void main(String[] args) {
        Druides panoramix = new Druides("Panoramix", 5, 10);
        Gaulois asterix = new Gaulois("Astérix", 8);
        Gaulois obelix = new Gaulois("Obélix", 10); // Obélix ne devrait pas pouvoir boire la potion
        
        panoramix.booster(asterix); // Test de la méthode booster avec Astérix
        panoramix.booster(obelix); // Test de la méthode booster avec Obélix
    }
}
