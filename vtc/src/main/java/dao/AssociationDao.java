package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.AssociationModel;
import model.ConducteurModel;

public class AssociationDao implements Idao<AssociationModel> {
	
	Connection connect = GetConnection.getConnection();
	ResultSet rs = null;

	@Override
	public void create(AssociationModel object) {
		try {
			PreparedStatement req = connect.prepareStatement("INSERT INTO association (conducteur, vehicule) VALUES (?,?)");

			req.setObject(1, object.getConducteur());
			req.setObject(2, object.getVehicule());

			req.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<AssociationModel> read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(AssociationModel object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AssociationModel findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AssociationModel> findByName(String nom) {
		// TODO Auto-generated method stub
		return null;
	}


}
