package personnages;

public class Romain {
	
	private String nom;
    private Equipement[] equipements;
    private int nbEquipement;

    public Romain(String nom) {
        this.nom = nom;
        this.equipements = new Equipement[2];
        this.nbEquipement = 0;
    }

    public void sEquiper(Equipement equipement) {
        switch (nbEquipement) {
            case 0:
                ajouterEquipement(equipement);
                System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
                break;
            case 1:
                if (equipements[0] == equipement) {
                    System.out.println("Le soldat " + nom + " possède déjà un " + equipement + " !");
                } else {
                    ajouterEquipement(equipement);
                    System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
                }
                break;
            case 2:
                System.out.println("Le soldat " + nom + " est déjà bien protégé !");
                break;
            default:
                break;
        }
    }

    private void ajouterEquipement(Equipement equipement) {
        equipements[nbEquipement] = equipement;
        nbEquipement++;
    }

    public static void main(String[] args) {
        Romain minus = new Romain("Minus");

        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.BOUCLIER);
        minus.sEquiper(Equipement.CASQUE);
    }

<<<<<<< HEAD
=======
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

>>>>>>> 184ef49c3dd92fbdce98b39b4268a781a202c97a

}
