package produit;

public enum Unite {
	L("litre"), G("gramme"), KG("kilogramme"), CL("centilitre"), ML("mililitre"), PIECE("pièce"); 
	
	private final String nom;
	
	private Unite(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return nom;
	}
}

