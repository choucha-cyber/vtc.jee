package model;

public class ConducteurModel {
	
	private int id_conducteur; //AI
	private String nom;
	private String prenom;
	
	public ConducteurModel(String nom, String prenom) {
		//super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public ConducteurModel(int id_conducteur, String nom, String prenom) {
		this.id_conducteur = id_conducteur;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getId_conducteur() {
		return id_conducteur;
	}

	public void setId_conducteur(int id_conducteur) {
		this.id_conducteur = id_conducteur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
