package model;

public class VehiculeModel {
	
	private int id_vehicule; //AI
	private String marque;
	private String modele;
	private String couleur;
	private String immatriculation;
	
	public VehiculeModel(String marque, String modele, String couleur, String immatriculation) {
		//super();
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
		this.immatriculation = immatriculation;
	}
	
	public VehiculeModel(int id_vehicule, String marque, String modele, String couleur, String immatriculation) {
		//super();
		this.id_vehicule = id_vehicule;
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
		this.immatriculation = immatriculation;
	}
	public int getId_vehicule() {
		return id_vehicule;
	}
	public void setId_vehicule(int id_vehicule) {
		this.id_vehicule = id_vehicule;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	
	
	
	
	
	

}
