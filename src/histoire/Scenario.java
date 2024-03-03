package histoire;

import personnages.Druides;
import personnages.Gaulois;
import personnages.Romain;



public class Scenario{
    public static void main(String[] args) {
    	Druides panoramix = new Druides("Panoramix", 5, 10);
        Gaulois asterix = new Gaulois("Astérix", 8);
        Gaulois obelix = new Gaulois("Obélix", 25);
        Romain minus = new Romain("Minus", 6);

        panoramix.parler("Je vais aller préparer une petite potion...");
        panoramix.preparerPotion();

        panoramix.booster(obelix);

        obelix.parler("Par Bélénos, ce n'est pas juste!");

        asterix.boirePotion(6);
        asterix.parler("Bonjour");

        minus.parler("UN GAU... UN GAUGAU...");

        asterix.frapper(minus);

        minus.parler("J'abandonne...");
    }
}
