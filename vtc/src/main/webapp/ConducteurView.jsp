<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gestion des Conducteurs</title>


</head>
<body>

<div class="container">

        
        <form action="<%= request.getContextPath() %>/conducteur" method="post">
            <div class="mb-3">
              <label for="prenom" class="form-label">Prénom</label>
              <input type="text" class="form-control" id="prenom" placeholder="Prenom">
            </div>
            <div class="mb-3">
              <label for="nom" class="form-label">Nom</label>
              <input type="text" class="form-control" id="nom">
            </div>
            
            <button type="submit" class="btn btn-primary">Ajouter ce conducteur</button>
          </form>

          <hr>
          <div class="liste ">
            <h2>Liste Conducteurs</h2>
            <table class="table">
              <thead>
                <tr>
                  <th scope="col">#</th>
                  <th scope="col">id_conducteur</th>
                  <th scope="col">prenom</th>
                  <th scope="col">nom</th>
                  <th scope="col">modification</th>
                  <th scope="col">suppression</th>
                </tr>
              </thead>
              
            </table>
          </div>

    </div>


<script src="js/script.js"></script>
</body>
</html>