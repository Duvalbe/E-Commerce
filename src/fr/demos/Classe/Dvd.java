package fr.demos.Classe;
import fr.demos.Classe.Article;

public class Dvd extends Article {
	private String titre;
	private String auteur;
	
	private String genre;
	private int nbrDvd;

	public Dvd(int prixHt, int stock, String description, int reference,String titre, String auteur,  String genre) {
		super(prixHt, stock, description, reference);
		this.titre=titre;
		this.auteur=auteur;
		
		this.genre=genre;
	}
	///Affichage
@Override
	public String toString() {
		return super.toString() + titre + ", auteur=" + auteur +  ", genre=" + genre + "]";
	}
	///// getter setter


	public String getTitre() {
		return titre;
	}	
	public int getNbrDvd() {
		return nbrDvd;
	}
	public void setNbrDvd(int nbrDvd) {
		this.nbrDvd = nbrDvd;
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

	

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
