package produit;

public abstract class Produit {
	private String name;
	private Unite unite;
	
	protected Produit(String name, Unite unite) {
		this.name = name;
		this.unite = unite;
	}

	public String getName() {
		return name;
	}

	public abstract void description();
}
