package fr.demos.Classe;

import java.util.ArrayList;
import java.util.List;

public class Panier {

	List<Article> panier = new ArrayList<>();
	
	
	public void retirer(Article article, int nbr) {
		try {
			this.removePanier(article, nbr);
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public void ajouter(Article article, int nbr) {
		try {
			this.addPanier(article, nbr);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	public void vider() {
		try {
			this.clearPanier();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	public void addPanier(Article artadd, int nbr) throws Exception {
		if (artadd.getStock() != 0) {
			for (int i=1; i<=nbr;i++ ){
			panier.add(artadd);
			artadd.setStock(1);					
			}
		} else
			throw new Exception("Plus en stock " + artadd.getReference());
	}

	public void removePanier(Article artrem, int nbr) throws Exception {
		if (panier.contains(artrem)) {
			for (int i=1; i<=nbr;i++ ){
			panier.remove(artrem);
			artrem.setStock(-1);
			
			}
		} else
			throw new Exception("Pas dans le panier "+artrem.getReference());
	}

	public void clearPanier() throws Exception {
		if (!panier.isEmpty()) {
		panier.clear();
	}else
		throw new Exception("Panier déjà vide");
	}
//// getter setter
	
	
	public List<Article> getPanier() {
		return panier;
	}

	public int getNbrArticle() {
		return panier.size();
	}

	
	public void setPanier(List<Article> panier) {
		this.panier = panier;
	}

	@Override
	public String toString() {
		return "Panier [panier=" + panier + "]";
	}

}
