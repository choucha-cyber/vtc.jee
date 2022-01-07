package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.ConducteurModel;
import model.VehiculeModel;

public class ConducteurDao implements Idao<ConducteurModel> {

	Connection connect = GetConnection.getConnection();
	ResultSet rs = null;

	@Override
	public void create(ConducteurModel object) {
		try {
			PreparedStatement req = connect.prepareStatement("INSERT INTO conducteur (nom, prenom) VALUES (?,?)");

			req.setString(1, object.getNom());
			req.setString(2, object.getPrenom());

			req.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<ConducteurModel> read() {

		List<ConducteurModel> listeConducteurs = new ArrayList<>();
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM conducteur");

			rs = req.executeQuery();

			while (rs.next()) {
				ConducteurModel conducteur = new ConducteurModel(rs.getString("nom"), rs.getString("prenom"));
				listeConducteurs.add(conducteur);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listeConducteurs;
	}

	@Override
	public void update(ConducteurModel object) {
		try {
			PreparedStatement req = connect.prepareStatement("UPDATE conducteur SET nom=?, prenom=? WHERE id=?");
			req.setString(1, object.getNom());
			req.setString(2, object.getPrenom());
			req.setInt(3, object.getId());

			req.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void delete(int id) {
		try {
			PreparedStatement req = connect.prepareStatement("DELETE FROM conducteur WHERE id=?");
			req.setInt(1, id);
			// System.out.println(req);
			req.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public ConducteurModel findById(int idConducteur) {
		ConducteurModel conducteurById = null;

		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM conducteur WHERE id=?");
			req.setInt(1, idConducteur);
			rs = req.executeQuery();
			while (rs.next()) {
				conducteurById = new ConducteurModel(rs.getInt("id_conducteur"), rs.getString("nom"),
						rs.getString("prenom"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conducteurById;
	}

	@Override
	public List<ConducteurModel> findByName(String nom) {
		ConducteurModel conducteurByName = null;

		List<ConducteurModel> conducteur = new ArrayList<>();
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM conducteur WHERE nom like ?");
			req.setString(1, nom);

			rs = req.executeQuery();
			while (rs.next()) {
				conducteurByName = new ConducteurModel(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"));

				conducteur.add(conducteurByName);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conducteur;
	}

}
