package fr.demos.Classe;

public class Livre extends Article{
	private String titre;
	private String auteur;
	private String editeur;
	private String genre;
	private int nbrLivre;

	public Livre(int prixHt, int stock, String description, int reference,String titre, String auteur, String editeur, String genre) {
		super(prixHt, stock, description, reference);
		this.titre=titre;
		this.auteur=auteur;
		this.editeur=editeur;
		this.genre=genre;
	}
	///Affichage
@Override
	public String toString() {
		return super.toString()+", Titre " + titre + ", Auteur=" + auteur + ", Éditeur=" + editeur + ", Genre=" + genre + "]"+'\n';
	}
	///// getter setter

public int getNbrLivre() {
	return nbrLivre;
}
public void setNbrLivre(int nbrLivre) {
	this.nbrLivre = nbrLivre;
}
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
