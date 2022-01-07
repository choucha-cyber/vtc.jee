<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gestion des Véhicules</title>


</head>
<body>

<div class="container">

        <form action="<%= request.getContextPath() %>/vehicule" method="post">
            <div class="mb-3">
              <label for="prenom" class="form-label">marque</label>
              <input type="text" class="form-control" id="prenom" placeholder="Prenom">
            </div>
            <div class="mb-3">
              <label for="nom" class="form-label">modele</label>
              <input type="text" class="form-control" id="nom">
            </div>
            <div class="mb-3">
              <label for="nom" class="form-label">couleur</label>
              <input type="text" class="form-control" id="nom">
            </div>
            <div class="mb-3">
              <label for="nom" class="form-label">immatriculation</label>
              <input type="text" class="form-control" id="nom">
            </div>
            
            <button type="submit" class="btn btn-primary">Ajouter ce vehicule</button>
          </form>

          <hr>
          <div class="liste ">
            <h2>Liste Véhicules</h2>
            <table class="table">
              <thead>
                <tr>
                  <th scope="col">#</th>
                  <th scope="col">id_vehicule</th>
                  <th scope="col">marque</th>
                  <th scope="col">modele</th>
                  <th scope="col">couleur</th>
                  <th scope="col">immatriculation</th>
                  <th scope="col">modification</th>
                  <th scope="col">suppression</th>
                </tr>
              </thead>
              
            </table>
          </div>

    </div>


<script src="js/conducteurJS"></script>
</body>
</html>