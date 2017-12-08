var atitulo = [],
aanio = [],
aclasificacion = [],
asinopsis = [],
acalificacion = [],
acomentario = [];

function registrar() {
  var mtitulo = document.getElementById('ntitulo').value;
  var manio = document.getElementById('nanio').value;
  var mclasificacion = document.getElementById('nclasificacion').value;
  var msinopsis = document.getElementById('nsinopsis').value;
  var mcalifiacion = document.getElementById('ncomen').value;
  var mcomentario = document.getElementById('ncali').value;


atitulo.push(mtitulo);
aanio.push(manio);
aclasificacion.push(mclasificacion);
asinopsis.push(msinopsis);
acalificacion.push(mcalifiacion);
acomentario.push(mcomentario);

localStorage.setItem('titulos', JSON.stringify(atitulo));
localStorage.setItem('anios', JSON.stringify(aanio));
localStorage.setItem('clasificaciones', JSON.stringify(aclasificacion));
localStorage.setItem('sinopsis', JSON.stringify(asinopsis));
localStorage.setItem('calificaciones', JSON.stringify(acalificacion));
localStorage.setItem('comentarios', JSON.stringify(acomentario));

llenartabla();
}

function llenartabla() {
  var tbody = document.getElementById("tbDatos");

  tbody.innerHTML = "";

  var atitulo = JSON.parse(localStorage.getItem('titulos'));
  var aanio = JSON.parse(localStorage.getItem('anios'));
  var aclasificacion = JSON.parse(localStorage.getItem('clasificaciones'));
  var asinopsis = JSON.parse(localStorage.getItem('sinopsis'));
  var acalificacion = JSON.parse(localStorage.getItem('calificaciones'));
  var acomentario = JSON.parse(localStorage.getItem('comentarios'));

  var acantidad = atitulo.lenght;


    var fila = document.createElement('tr');

    var celdatitulo = document.createElement('td');
    var celdaanio = document.createElement('td');
    var celdaclasificacion = document.createElement('td');
    var celdasinopsis = document.createElement('td');
    var celdacalificacion = document.createElement('td');
    var celdacomentario = document.createElement('td');

    var nodotitulo = document.createTextNode(atitulo),
    nodoanio = document.createTextNode(aanio),
    nodoclasificacion = document.createTextNode(aclasificacion),
    nodosinopsis = document.createTextNode(asinopsis),
    nodocalificacion = document.createTextNode(acalificacion),
    nodocomentario = document.createTextNode(acomentario);

    celdatitulo.appendChild(nodotitulo);
    celdaanio.appendChild(nodoanio);
    celdaclasificacion.appendChild(nodoclasificacion);
    celdasinopsis.appendChild(nodosinopsis);
    celdacalificacion.appendChild(nodocalificacion);
    celdacomentario.appendChild(nodocomentario);

    fila.appendChild(celdatitulo);
    fila.appendChild(celdaanio);
    fila.appendChild(celdaclasificacion);
    fila.appendChild(celdasinopsis);
    fila.appendChild(celdacalificacion);
    fila.appendChild(celdacomentario);

    tbody.appendChild(fila);



}
