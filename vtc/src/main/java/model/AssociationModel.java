package model;

public class AssociationModel {

	private int id_association;// Je choisis de générer moi meme cet id, en concaténant les initiales
								// conducteurs et vehicule
	private ConducteurModel conducteur;
	private VehiculeModel vehicule;

	public AssociationModel(ConducteurModel conducteur, VehiculeModel vehicule) {
		super();
		this.conducteur = conducteur;
		this.vehicule = vehicule;
	}

	public AssociationModel(int id_association, ConducteurModel conducteur, VehiculeModel vehicule) {
		super();
		this.id_association = id_association;
		this.conducteur = conducteur;
		this.vehicule = vehicule;
	}

	public int getId_association() {
		return id_association;
	}

	public void setId_association(int id_association) {
		this.id_association = id_association;
	}

	public ConducteurModel getConducteur() {
		return conducteur;
	}

	public void setConducteur(ConducteurModel conducteur) {
		this.conducteur = conducteur;
	}

	public VehiculeModel getVehicule() {
		return vehicule;
	}

	public void setVehicule(VehiculeModel vehicule) {
		this.vehicule = vehicule;
	}
	
	

}
