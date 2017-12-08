var pelicula;

var xhttp = new XMLHttpRequest();
xhttp.onreadystatechange=function(){
  if (this.readyState==4 && this.status==200) {
  console.log("conexion exitosa!");
}
};
xhttp.open("GET", "http://www.omdbapi.com/",true);
xhttp.send();


function cargarPeliculas() {
  var titulo=document.getElementById("name").value;
  var todobien = true;
  var xhttp = new XMLHttpRequest();

  xhttp.onreadystatechange= function () {
    if (this.readyState==4 && this.status==200) {
      pelicula=JSON.parse(this.responseText);
      var myJSON = JSON.stringify(pelicula.Poster);
      var myJSON = myJSON.slice(1, -1);
      document.getElementById("poster").src = myJSON;
      document.getElementById("titulo").innerHTML= "Titulo: "+pelicula.Title;
      document.getElementById("anio").innerHTML="Año: " +pelicula.Year;
      document.getElementById("clasificacion").innerHTML= "Clasificacion: "+pelicula.Rated;
      document.getElementById("sinopsis").innerHTML="Sinopsis: "+pelicula.Plot;

    }
  };
  xhttp.open("GET", "http://www.omdbapi.com/?t="+ titulo +"&apikey=da423c50",true);
  xhttp.send();
}

function agregar() {

  var tit = document.getElementById('titulo').textContent;
  var an = document.getElementById('anio').textContent;
  var clas = document.getElementById('clasificacion').textContent;
  var sin = document.getElementById('sinopsis').textContent;
console.log(tit+", "+an+", "+clas+", "+sin);

  document.getElementById('ntitulo').innerHTML = "";
  document.getElementById('nanio').innerHTML = an;
  document.getElementById('nclasificacion').innerHTML = clas;
  document.getElementById('nsinopsis').innerHTML = sin;

}
