package produit;

public class Poisson extends Produit {
	private String date;

	public Poisson(String date) {
		super("poisson", Unite.KG);
		this.date = date;
	}

	@Override
	public void description() {
		System.out.println(getName() + " pêchés " + date + ".\n");
	}

}
