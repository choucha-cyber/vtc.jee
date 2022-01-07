package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.VehiculeModel;

public class VehiculeDao implements Idao<VehiculeModel> {

	Connection connect = GetConnection.getConnection();
	ResultSet rs = null;

	@Override
	public void create(VehiculeModel object) {
		try {
			PreparedStatement req = connect.prepareStatement(
					"INSERT INTO vehicule (marque, modele, couleur, immatriculation) VALUES (?,?, ?, ?)");

			req.setString(1, object.getMarque());
			req.setString(2, object.getModele());
			req.setString(2, object.getCouleur());
			req.setString(2, object.getImmatriculation());

			req.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<VehiculeModel> read() {

		List<VehiculeModel> listeVehicules = new ArrayList<>();
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM vehicule");

			rs = req.executeQuery();

			while (rs.next()) {
				VehiculeModel vehicule = new VehiculeModel(rs.getInt("id_vehicule"), rs.getString("marque"),
						rs.getString("modele"), rs.getString("couleur"), rs.getString("immatriculation"));
				listeVehicules.add(vehicule);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listeVehicules;
	}

	@Override
	public void update(VehiculeModel object) {
		try {
			PreparedStatement req = connect.prepareStatement(
					"UPDATE vehicule SET marque=?, modele=?, couleur=?, immatriculation=? WHERE id=?");
			req.setString(1, object.getMarque());
			req.setString(2, object.getModele());
			req.setString(3, object.getCouleur());
			req.setString(4, object.getImmatriculation());
			req.setInt(3, object.getId_vehicule());

			req.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void delete(int id) {
		try {
			PreparedStatement req = connect.prepareStatement("DELETE FROM vehicule WHERE id=?");
			req.setInt(1, id);
			// System.out.println(req);
			req.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	public VehiculeModel findByImmat(String immatVehicule) {
		VehiculeModel vehiculeByImmat = null;

		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM vehicule WHERE immatriculation=?");
			req.setString(1, immatVehicule);
			rs = req.executeQuery();
			while (rs.next()) {
				vehiculeByImmat = new VehiculeModel(rs.getInt("id_vehicule"), rs.getString("marque"),
						rs.getString("modele"), rs.getString("couleur"), rs.getString("immatriculation"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vehiculeByImmat;
	}


	@Override
	public List<VehiculeModel> findByName(String modele) {
		VehiculeModel vehiculeByModele = null;

		List<VehiculeModel> vehicules = new ArrayList<>();
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM vehicule WHERE modele like ?");
			req.setString(1, modele);

			rs = req.executeQuery();
			while (rs.next()) {
				vehiculeByModele = new VehiculeModel(rs.getInt("id_vehicule"), rs.getString("marque"),
						rs.getString("modele"), rs.getString("couleur"), rs.getString("immatriculation"));

				vehicules.add(vehiculeByModele);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vehicules;
	}

	@Override
	public VehiculeModel findById(int idVehicule) {

			VehiculeModel vehiculeById = null;

			try {
				PreparedStatement req = connect.prepareStatement("SELECT * FROM vehicule WHERE id=?");
				req.setInt(1, idVehicule);
				rs = req.executeQuery();
				while (rs.next()) {
					vehiculeById = new VehiculeModel(rs.getInt("id_vehicule"), rs.getString("marque"),
							rs.getString("modele"), rs.getString("couleur"), rs.getString("immatriculation"));
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return vehiculeById;
		}
	}
