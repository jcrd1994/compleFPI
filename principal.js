////ID
var titulo;


//Estos son para los JSON
var JSONpelicula;


//Array para las listas de ligas y id
var listapeliculas = new Array();




function cargarMovies() {

    titulo = document.getElementById("name").value;

    $.ajax({
        url: 'http://www.omdbapi.com/?t=' + titulo + '&apikey=da423c50',
        dataType: 'json',
        type: 'GET',
    }).done(function (response) {
        console.log(response);
        mostrar(response);
    });
}




function mostrar(JSON) {

    $(".mostrar").html("");


            var contenido = `<div class="peliculas">
                        <label class="titulos">Nombre: </label><label>${JSON.pelicula.Title}</label><br>
                        <label class="titulos">anio: </label><label>${JSON.pelicula.Year}</label><br>
                        <label class="titulos">clasificacion: </label><label>${JSON.pelicula.Rated}</label><br>
                        <label class="titulos">sinopsis: </label><label>${JSON.pelicula.Plot}</label><br>

                    </div>`;

            var node = document.createElement("div");
            node.innerHTML = contenido;
            $(".mostrar").append(node);

}

function limpiar() {
    $(".contenedor-jugadores").html("");
    $(".equipos").val("");
    $("#lista2").html("");
}
