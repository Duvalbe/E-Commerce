package fr.demos.Classe;
import fr.demos.Classe.Article;

public class Cd extends Article {
	private String titre;
	private String auteur;
	private String editeur;
	private String genre;
	private int nbrCd;

	public Cd(int prixHt, int stock, String description, int reference,String titre, String auteur, String editeur, String genre) {
		super(prixHt, stock, description, reference);
		this.titre=titre;
		this.auteur=auteur;
		this.editeur=editeur;
		this.genre=genre;
	}
	///Affichage
@Override
	public String toString() {
		return super.toString() + titre + ", auteur=" + auteur + ", editeur=" + editeur + ", genre=" + genre + "]";
	}
	///// getter setter


	public String getTitre() {
		return titre;
	}	
	public int getNbrCd() {
		return nbrCd;
	}
	public void setNbrCd(int nbrCd) {
		this.nbrCd = nbrCd;
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
