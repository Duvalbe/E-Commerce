package fr.demos.Classe;

public class Article {
	private int prixHt;
	private int stock;
	private String description;
	private int reference;
	
	public Article(int prixHt, int stock, String description, int reference) {
		this.prixHt = prixHt;
		this.stock = stock;
		this.description = description;
		this.reference = reference;
	}

	/// Affichage

	@Override
	public String toString() {
		return "Article [ "+Article.this.getClass().getSimpleName()+"=>" +" prixHt= " + prixHt +" Euros"+" stocks= " + stock + ", description= " + description ;
	}

	///// getter setter
	
	
	
	public int getPrixHt() {
		return prixHt;
	}

	

	public void setPrixHt(int prixHt) {
		this.prixHt = prixHt;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = this.stock-stock;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

}
