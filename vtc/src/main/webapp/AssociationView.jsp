<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Association</title>


</head>
<body>

<div class="container">

        <form action="<%= request.getContextPath() %>/association" method="post">
            <div class="mb-3">
              <label for="prenom" class="form-label">conducteur</label>
              <input type="text" class="form-control" id="prenom" placeholder="Prenom">
            </div>
            <div class="mb-3">
              <label for="nom" class="form-label">vehicule</label>
              <input type="text" class="form-control" id="nom">
            </div>
            
            <button type="submit" class="btn btn-primary">Valider association</button>
          </form>

          <hr>
          <div class="liste ">
            <h2>Associations</h2>
            <table class="table">
              <thead>
                <tr>
                  <th scope="col">#</th>
                  <th scope="col">id_association</th>
                  <th scope="col">conducteur</th>
                  <th scope="col">vehicule</th>
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