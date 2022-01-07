


    document.querySelector('form').submit(function () {
        console.log('formulaire soumis !');

        getData();
    })


function getData() {
    var prenom  = document.querySelector('#prenom').value;
    var nom  = document.querySelector('#nom').value;
  

    ajoutConducteur(prenom,nom)
}

function ajoutConducteur(prenom, nom) {

    var table = document.querySelector('.table');
    var nouvelleLigne = table.insertRow();

    nouvelleLigne.insertCell(0).innerHTML = 1;
    nouvelleLigne.insertCell(1).innerHTML = prenom;
    nouvelleLigne.insertCell(2).innerHTML = nom;
    nouvelleLigne.insertCell(4).innerHTML = "<i class='bi bi-pencil-square'></i>";
    nouvelleLigne.insertCell(5).innerHTML = "<i class='bi bi-trash'></i>";
}