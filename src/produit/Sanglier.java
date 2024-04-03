package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poids;
	private Gaulois chasseur;

	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier", Unite.KG);
		this.poids = poids;
		this.chasseur = chasseur;
	}

	@Override
	public void description() {
		System.out.println(getName() + " de " + poids + " " +Unite.KG.toString() + " chassé par " + chasseur.getNom() + ".\n");
	}
}
