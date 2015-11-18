-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-11-2015 a las 16:19:29
-- Versión del servidor: 5.6.17
-- Versión de PHP: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `agpcode`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `constancia`
--

CREATE TABLE IF NOT EXISTS `constancia` (
  `idconstancia` int(11) NOT NULL,
  `idusuario` int(11) NOT NULL,
  `idleccion` int(11) NOT NULL,
  `observacion` varchar(40) COLLATE latin1_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `leccion`
--

CREATE TABLE IF NOT EXISTS `leccion` (
  `idleccion` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(40) COLLATE latin1_spanish_ci NOT NULL,
  `actividad` text COLLATE latin1_spanish_ci NOT NULL,
  `respuesta` text COLLATE latin1_spanish_ci NOT NULL,
  `tituloteoria` varchar(40) COLLATE latin1_spanish_ci NOT NULL,
  `teoria` text COLLATE latin1_spanish_ci NOT NULL,
  `observacion` varchar(40) COLLATE latin1_spanish_ci NOT NULL,
  PRIMARY KEY (`idleccion`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci AUTO_INCREMENT=15 ;

--
-- Volcado de datos para la tabla `leccion`
--

INSERT INTO `leccion` (`idleccion`, `nombre`, `actividad`, `respuesta`, `tituloteoria`, `teoria`, `observacion`) VALUES
(1, 'conceptos html', '\r\n    A la derecha tenemos un archivo test.html\r\n    escribe lo siguiente \r\n    <strong>Hola<strong/>\r\n    También hay una pestaña de ''Resultados''. Funciona igual que un navegador.\r\n    Presiona Ejecutar, y verás como el archivo test.html se vería en un navegador. ¿Viste? ¡Las etiquetas <strong></strong> convirtieron nuestro texto en negrilla!\r\n\r\n', '<strong>Hola</strong>', '¿Por qué aprender HTML?', 'Cada página web que ves está escrita en un lenguaje llamado HTML. Imagina que HTML es el esqueleto que le da estructura a cada página web. En este curso, usaremos HTML para añadir párrafos, encabezados, imágenes y enlaces a una página web', 'Ingresa a Link para ver tu Clase:'),
(2, 'conceptos html', '\r\n    Coloca las tres etiquetas que mencionamos arriba en test.html.\r\n\r\n    En medio de la segunda y la última línea (en medio de <html> y </html>),Escribe "AGPcode"\r\n', '<!DOCTYPE html>\r\n<html>\r\nAGPcode\r\n</html>', 'HTML y CSS', 'HTML significa HyperText Markup Language (lenguaje de marcado de hipertexto). Hipertexto quiere decir "texto que contiene enlaces." ¡Cada vez que haces clic en una palabra que te lleva a una nueva página web, haz hecho clic en un hipertexto!\r\n\r\nUn lenguaje de marcado es un lenguaje de programación usado para que el texto haga más que solamente aparecer en una página; puede convertir el texto en imágenes, enlaces, tablas, listas, y mucho más. El lenguaje de marcado que aprenderemos es HTML.\r\n\r\n¿Qué es lo que hace bonita a una página web? Eso es CSS—Cascading Style Sheets (hojas de estilo en cascada). Imagina que es la piel y el maquillaje que cubre los huesos del HTML. Primero aprenderemos HTML, después, en cursos posteriores, nos ocuparemos del CSS.\r\n\r\nLa primera cosa que debemos hacer es configurar el esqueleto de la página.\r\n\r\na. Escribe siempre <!DOCTYPE html> en la primera línea. Esto le dice al navegador cuál es el lenguaje que está leyendo (en este caso, HTML).\r\nb. Escribe siempre <html> en la segunda línea. Esto comienza el documento de HTML.\r\nc. Escribe siempre </html> en la última línea. Esto finaliza el documento de HTML.\r\n', ''),
(3, 'conceptos html', '\r\n    Coloca la etiqueta !DOCTYPE HTML.\r\n    Coloca las etiquetas html de inicio y de cierre.\r\n    Escribe <H1>HOLA</H1> en medio de las etiquetas html.\r\n    ¡Presiona Guardar y continuar para ver tu trabajo!\r\n', '<!DOCTYPE HTML>\r\n<HTML>\r\n<H1>HOLA</H1>\r\n</HTML>', 'Terminología básica', 'Para aprender más HTML, debemos aprender cómo hablar sobre HTML. Ya viste que usamos mucho los símbolos <>.\r\n\r\n    Las cosas adentro de <> se llaman etiquetas.\r\n    Las etiquetas casi siempre vienen en pares: una etiqueta de inicio y una etiqueta de cierre.\r\n    Un ejemplo de una etiqueta de inicio: <html>\r\n    Un ejemplo de una etiqueta de cierre: </html>\r\n\r\nImagina que las etiquetas son como paréntesis; cuando abres uno, debes cerrarlo. Las etiquetas también pueden anidarse, así que debes cerrarlas en el orden correcto: la etiqueta abierta más recientemente debe ser la primera que se cierre, como en el ejemplo de abajo.\r\n\r\n\r\n<primera_etiqueta><segunda_etiqueta>ALGUN TEXTO</segunda_etiqueta></primera_etiqueta>', ''),
(4, 'conceptos html', '\r\n    Añade una etiqueta de cabecera de inicio y una de cierre. .\r\n    En medio de las etiquetas de cabecera, añade etiquetas de inicio y de cierre para el título.\r\n    En medio de las etiquetas de título, escribe "Mi pagina Web" \r\n', '<!DOCTYPE html>\r\n<html>\r\n<head>\r\n    <title>Mi pagina Web</title>\r\n</head>\r\n</html>', 'Haz la cabecera', '\r\n\r\nTodo dentro de nuestro archivo HTML irá en medio de las etiquetas de inicio <html> y de cierre </html>.\r\n\r\nEl archivo siempre consiste de dos partes: la cabecera y el cuerpo . Vamos a concentrarnos en la cabecera.\r\n\r\na. Tiene una etiqueta de inicio y una de cierre.\r\nb. La cabecera incluye información importante, como el título de la página web.\r\nc. El título son las palabras que vemos en la etiqueta (por ejemplo, el título de esta página es "Introducción a HTML").\r\n', ''),
(5, 'conceptos html', 'Debajo de la etiqueta </head> de cierre colocá una etiqueta <body> de inicio y una etiqueta </body> de cierre, como en el ejemplo de arriba.\r\n\r\nDentro del cuerpo creá dos párrafos. Cada párrafo empieza con una etiqueta <p> de inicio y termina con una etiqueta </p> de cierre.en el primer parrafo escribe "hello world" y en el segundo parrafo escribe "hola mundo"Podemos ingresar contenido entre las etiquetas, así:\r\n<body>\r\n<p>¡Hola mundo!</p>\r\n</body> ', '<!DOCTYPE html>\r\n<html>\r\n<head>\r\n<title\r\n</title>\r\n</head>\r\n<body>\r\n    <p>Hello world</p>\r\n    <p>Hola Mundo</p>\r\n</body>\r\n</html>', 'Párrafos del cuerpo delarchivo', '¡Muy bien! Para repasar, recordemos que un archivo HTML tiene un encabezado y un cuerpo. El encabezado es donde se ingresa la información sobre tu archivo HTML, como, por ejemplo, el título.\r\n\r\nEl cuerpo es donde ingresás el contenido, como textos, imágenes y enlaces. El contenido del cuerpo es lo que se verá en la página real.\r\n\r\nEl cuerpo va dentro de las etiquetas , inmediatamente después de las etiquetas de título, así:\r\n\r\n<html>\r\n  <head>\r\n    <title>Mi página web</title>\r\n  </head>\r\n  <body>\r\n  </body>\r\n</html>\r\n', ''),
(6, 'Conceptos html', 'en la parte del titulo escribe"parrafos y encabezados"\r\nEn la sección del cuerpo escribí un encabezado. Para esto, creá una etiqueta <h1>.\r\nAgregá "HOLA".\r\nCierrá ese elemento con una etiqueta de cierre de encabezado. El contenido que agregaste debe quedar entre <h1> y </h1>.)\r\nDebajo de las etiquetas de encabezado agregá dos párrafos, el primero que contenga "esto es una prueba!,y el segundo que contenga "esto es otra prueba" usando las etiquetas <p>.', '<!DOCTYPE html>\r\n<html>\r\n	<head>\r\n		<title>parrafos y encabezados</title>\r\n	</head>\r\n	<body>\r\n	<h1>Hola</h1>	\r\n	<p>esto es una prueba</p>	\r\n	<p>esto es otra prueba</p>\r\n	</body>\r\n</html> ', 'Párrafos y encabezados', '¡Definitivamente estamos avanzando mucho! Aprendimos cuándo y por qué usamos HTML. También aprendimos cómo:\r\na. Configurar un archivo HTML con etiquetas\r\nb. Ponerle un título a la página web (en el encabezado o <head>)\r\nc. Crear párrafos (en el cuerpo o <body> con etiquetas <p>)\r\nEn el siguiente paso pondremos encabezados a nuestros párrafos usando las etiquetas de encabezado. Vamos a comenzar con la etiqueta . Lo que aparece entre estas etiquetas tendrá la letra más grande.', ''),
(7, 'conceptos html', 'haz un parrafo que  contenga "esto es un parrafo"\r\n    Agregá un encabezado <h3> despues del párrafo. este debe contener "Esto es un h3"\r\n    Agregá un encabezado <h5> después del <h3> este debe contener "Esto es un h5"\r\n\r\n', '<!DOCTYPE html>\r\n<html>\r\n	<head>\r\n		<title>\r\n		</title>\r\n	</head>\r\n	<body>\r\n	<p>esto es un parrafo</p>	\r\n	<h3>Esto es un h3</h3>\r\n	<h5>Esto es un h5</h5>\r\n	</body>\r\n</html> ', 'Más sobre encabezados ', 'En realidad, HTML nos permite tener más de un tamaño de encabezados. Hay seis tamaños de encabezados: <h1> es el más grande, de mayor jerarquía y <h6> es el más chiquito, de menor jerarquía.\r\n• <h1> - El Presidente\r\n• <h2> - El Vicepresidente\r\n• <h3> - El Director\r\n• <h4> - El Vicedirector\r\n• <h5> - El Empleado\r\n• <h6> - El Cadete\r\nA continuación te pediremos que agregues encabezados de varios tamaños. ', ''),
(8, 'Conceptos html', '\r\n    Agregá un título que diga "AGPcode".\r\n    Creá un encabezado de tamaño <h3> en el cuerpo que contenga"He avanzado". quieras ( no te olvides de cerrarlo).\r\n    Creá tres párrafos usando las etiquetas <p> y llenalos con contenido\r\np1: "He Aprendido acerca de HTMl"\r\np2: "y seguire avanzando mucho mas"\r\np3: "gracias a AGPcode que me enseña"', '<!DOCTYPE html>\r\n<html>\r\n	<head>\r\n		<title> AGPcode</title>\r\n		\r\n	</head>\r\n	<body>\r\n	<h3>He avanzado</h3>\r\n	<p>He Aprendido acerca de HTMl</p>\r\n<p>y seguire avanzando mucho mas</p>\r\n<p>gracias a AGPcode que me enseña</p\r\n	    \r\n	</body>\r\n</html>', 'Repaso de Mitad de Leccion', 'Hiciste un trabajo impresionante. Este es un resumen de lo aprendido:\r\n01. HTML se usa para darle estructura a los sitios web.\r\n02. Abrimos los archivos HTML usando un navegador, y el navegador reproduce el archivo (nos lo muestra).\r\n03. Los archivos HTML tienen un encabezado <head> y un cuerpo <body> (Igual que nosotros, que tenemos cabeza y cuerpo).\r\n04. En el encabezado tenemos las etiquetas de título <title> y las usamos para especificar el nombre de la página web.\r\n05. Cómo hacer encabezados y párrafos.', ''),
(9, 'Conceptos html', 'En el titulo pon "mi primer enlace"\r\nen la sección del cuerpo, creá un enlace. Para hacerlo, agregá una etiqueta <a>. Indicale a tu enlace el siguiente enlace www.coreducacion.edu.co estableciendo el valor del atributo href.\r\nAgregá una descripción "Ir a COREDUACION"\r\nCerrá el elemento con una etiqueta </a> de cierre.', '<!DOCTYPE html>\r\n<html>\r\n	<head>\r\n		<title>mi primer enlace</title>\r\n	</head>\r\n	<body>\r\n	  <a href="http://www.coreducacion.edu.co">Ir a COREDUCACION</a>\r\n\r\n	</body>\r\n</html>', 'Visitar otros lugares ', '\r\n\r\n¿Qué pasaría si quisieras mandar al usuario a otra parte de tu sitio web o directamente a otro sitio web? Tenés que usar hipervínculos. También los podemos llamar vínculos, para abreviar.\r\n\r\n<a href="http://www.coreducacion.edu.co">Mi sitio web favorito</a>\r\n\r\n    Primero hay una etiqueta de apertura <a> y esa etiqueta tiene un atributo que se llama href. El valor href le dice a tu enlace adónde querés que vaya, en este caso http://www.coreducacion.edu.co\r\n    Después hay una descripción de tu enlace entre tu etiqueta <a> de apertura y tu etiqueta </a> de cierre. Ahí es donde podés hacer clic.\r\n    Finalmente aparece la etiqueta </a> de cierre.\r\n\r\n', ''),
(10, 'conceptos html', 'Agregá una imagen debajo del cuerpo (Asegurate de que sea antes de la etiqueta </body> de cierre del cuerpo).\r\nusa esta imagen.\r\nhttp://www.universitarios.co/wp-content/uploads/2013/11/logo-coreducacion.jpg\r\n\r\nRECUERDA HACER LA ESTRUCTURA BASICA DE UN HTML', '<!DOCTYPE html>\r\n<html>\r\n	<head>\r\n		<title></title>\r\n	</head>\r\n	<body>\r\n<img src="http://www.universitarios.co/wp-content/uploads/2013/11/logo-coreducacion.jpg"/>\r\n	</body>\r\n</html>', 'Agregar imágenes ', 'Podés agregar imágenes a tus sitios web para que queden más atractivos.\r\n\r\nUsamos una etiqueta de imagen, como: <img>. Esta etiqueta es un poco diferente de las demás. En vez de colocar el contenido en medio de las etiquetas, le indicás a la etiqueta dónde buscar la imagen, usando src. También es diferente porque no hay etiqueta de cierre. Tiene una barra / en la etiqueta para cerrarla: <img src="url" />.\r\nCada imagen en la web tiene su propio URL de imagen. Simplemente hacé clic con el botón derecho sobre una imagen y elegí "Copiar el URL de la imagen". Pegá ese URL entre comillas después de src= para insertarlo con tu etiqueta de imagen <img>', ''),
(11, '', '\r\n    Agregá los 6 tipos d encabezados al código, usando en orden ascendente cada uno debe decir "hola" Asegurate de cerrar todas tus etiquetas.\r\n    Agregá un párrafo corto al final antes de cerrar la etiqueta </body> que digas"he avanzado bastante en mi aprendizaje de html". No te olvides de que los párrafos necesitan etiquetas <p></p> de inicio y de cierre.\r\n\r\n', '<!DOCTYPE html>\r\n<html>\r\n	<head>\r\n		<title>\r\n		</title>\r\n	</head>\r\n	<body>\r\n	<h1>hola</h1>\r\n<h2>hola</h2>\r\n	<h3>hola</h3>\r\n<h4>hola</h4>\r\n	<h5>hola</h5>\r\n	<h6>hola</h6>\r\n	<p>he avanzado bastante en mi aprendizaje de html</p>\r\n	</body>\r\n</html> ', 'Usar todos los encabezados', '\r\n¡Buenísimo!\r\n\r\nComo en total hay seis tamaños de encabezados, deberíamos usarlos todos.\r\n', ''),
(12, '', 'En la sección del cuerpo creá una etiqueta <a>.\r\nEl sitio web adonde dirigir tu enlace, es <a href="http://www.google.com">.\r\nAhora creá tu etiqueta <img> entre tu etiqueta <a> de inicio y tu etiqueta </a> de cierre. ¡No te olvides del src!\r\nla ruta de la imagen es la siguiente https://pbs.twimg.com/profile_images/638751551457103872/KN-NzuRl.png \r\nFinalmente cerrá la etiqueta </a> después de la etiqueta <img>.', '<!DOCTYPE html>\r\n<html>\r\n	<head>\r\n		<title></title>\r\n	</head>\r\n	<body>\r\n	<a href="www.google.com">	<img src="https://pbs.twimg.com/profile_images/638751551457103872/KN-NzuRl.png " /></a> \r\n	</body>\r\n</html>', 'Hacé clic en esa imagen ', '\r\n\r\n¡Muy bien! Ahora ya sabés cómo agregar enlaces e imágenes a tu sitio web. Pero, ¿qué tal si quisieras convertir esa imagen en un enlace? Por ejemplo:\r\n\r\n<a href=" http://www.coreducacion.edu.co">\r\n    <img src="http://www.universitarios.co/wp-content/uploads/2013/11/logo-coreducacion.jpg"/>\r\n</a>\r\n\r\n    Primero abrimos nuestra etiqueta <a> e dirigimos href a http://www.coreducacion.edu.co/ otra vez.\r\n\r\n    Pero esta vez, en lugar de usar texto dentro de la etiqueta <a>, usamos una etiqueta de imagen <img>.\r\n\r\n    Finalmente colocamos la etiqueta de cierre </a>.\r\n    Ahora, cuando hagas clic en la imagen iras a http://www.coreducacion.edu.co\r\n    colocar una etiqueta HTML dentro de otra se denomina anidado.\r\n\r\n', ''),
(13, 'Conceptos html', '\r\n    Entre las etiquetas <body> del cuerpo agregá dos imágenes utilizando la etiqueta <img>. Una debe ser un enlace; \r\nimagen:https://s1.yimg.com/rz/d/yahoo_en-US_f_p_bestfit_2x.png\r\nweb:www.yahoo.com\r\nla otra no.\r\nimagen:http://ayudawp.com/wp-content/uploads/2012/08/aprender-html.jpg\r\n    Después de tus dos imágenes, creá un enlace que simplemente sea una línea de texto.\r\ndebe llevar como texto "ir a facebook"\r\nurl web:facebook.com\r\n\r\n', '<!DOCTYPE html>\r\n<html>\r\n	<head>\r\n		<title></title>\r\n	</head>\r\n	<body>\r\n	<a href src="www.yahoo.com"><img src="https://s1.yimg.com/rz/d/yahoo_en-US_f_p_bestfit_2x.png"></a>	\r\n	<img src="http://ayudawp.com/wp-content/uploads/2012/08/aprender-html.jpg">\r\n	<a href src="www.facebook.com">ir a facebook</a>\r\n	</body>\r\n</html>', 'Imágenes y enlaces', '¡Muy bien! Asegurate de que entendés las imágenes y los enlaces antes de empezar con el repaso.\r\n', ''),
(14, 'Conceptos html', '', '', ' ¡Felicitaciones!', '\r\n¡Muy bien! Ahora que ya sabés lo básico para crear una página web puedes empezar a explorar .\r\n', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `leccion_js`
--

CREATE TABLE IF NOT EXISTS `leccion_js` (
  `idleccion` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(40) NOT NULL,
  `actividad` text NOT NULL,
  `respuesta` text NOT NULL,
  `tituloteoria` varchar(40) NOT NULL,
  `teoria` text NOT NULL,
  `observacion` varchar(80) NOT NULL,
  PRIMARY KEY (`idleccion`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=15 ;

--
-- Volcado de datos para la tabla `leccion_js`
--

INSERT INTO `leccion_js` (`idleccion`, `nombre`, `actividad`, `respuesta`, `tituloteoria`, `teoria`, `observacion`) VALUES
(1, 'conceptos JavaScript ', 'Escribí AGPCODE entre comillas, así: "AGPCODE". Después hacé clic en Guardar y continuar', '"AGPCODE"', 'Introduccion', '¡Hola! Bienvenido al Curso de JavaScript Vamos a conocernos mejor.\r\nsoy agpcode y tratare de enseñarte al maximos', ''),
(2, 'conceptos JavaScript ', '\r\nPara descubrir el largo de un nombre escribilo entre comillas. Después poné un punto final y la palabra largo (length en inglés), así:\r\n“agpcode”.length\r\n\r\nDespués hacé clic en Guardar y continuar\r\n', 'agpcode.length', ' Descubrí el largo', '¡Muy Bien! ¿Cuantas letras tiene tu nombre?\r\n', ''),
(3, 'conceptos JavaScript', 'Suma dos números de esta forma 3 + 4. ', '3 + 4', ' Matemática básica', '¡Buen trabajo! Ahora vamos a hacer algunas operaciones matemáticas. ¡Podés hacerlas con la programación!\r\n', ''),
(4, 'conceptos JavaScript ', 'Podés usar * para hacer multiplicaciones y / para hacer divisiones. Ingresá estas ecuacion en este orden\r\n12/3\r\n9*2\r\n9+2\r\n', '12/3\r\n9*2\r\n9+2\r\n', 'Números y más', '¿Ves lo que pasó? Podés usar la línea de comandos para hacer operaciones matemáticas básicas. Tratá de practicar un poco más. ', ''),
(5, 'conceptos JavaScript', 'Tratá de engañar al intérprete usando una palabra que no conozca, como berenjena. Te mostrará un ReferenceError (Error de referencia).al ejecutar en el navegador', 'berenjena', 'Error: ¡no calcula!', '\r\nHay algunas cosas que no podés hacer . Las computadoras hablan únicamente ciertos idiomas, como el que estuviste usando hoy: ¡JavaScript!\r\n\r\nSi usás palabras que no forman parte del lenguaje JavaScript, la computadora se va a confundir y te mostrará un mensaje de error.\r\n', ''),
(6, 'conceptos javascript', 'haz estos dos comentarios\r\n//hola soy un comentario\r\n//yo tambien soy un comentario\r\nLa computadora ignorará el código de las líneas 1 y 2, porque aparece como comentario.\r\nEn la línea 3, esribe la palabra "torta".length para determinar cuantas letras tiene', '//hola soy un comentario\r\n//yo tambien soy un comentario\r\n"torta".length', 'Editor y comentarios', '\r\n\r\nHasta ahora, estuvimos escribiendo líneas de código en el editor. Ahora vemos dos líneas que empiezan con //.\r\n\r\nEl signo // es para comentarios. Un comentario es una línea de texto que JavaScript no va a tratar de ejecutar como código. Solamente es para que las personas lo lean.\r\n\r\nLos comentarios hacen que tu programa sea más fácil de entender. Cuando volvés a mirar tu código u otros quieren colaborar con vos, pueden leer tu comentario y entender fácilmente lo que hace tu código.\r\n', ''),
(7, 'conceptos JavaScript', 'haz esto en la consola\r\nconfirm(''Esto es un ejemplo de cómo usar JS para crear una interaccion en un sitio web. Hacé clic en ver para continuar'');\r\n¡Hacé clic en “Guardar y continuar” para ver un ejemplo de cómo JavaScript puede ser interactivo!', 'confirm(''Esto es un ejemplo de cómo usar JS para crear una interaccion en un sitio web. Hacé clic en OK para continuar'');', '¿Qué estoy aprendiendo?', 'Esto es JavaScript (JS), un lenguaje de programación. Existen muchos lenguajes, pero JS tiene muchos usos y es fácil de aprender.\r\n¿Para qué podemos usar JavaScript?\r\n\r\n• para crear sitios web que respondan a la interacción del usuario\r\n\r\n• para crear aplicaciones y juegos (por ejemplo, el blackjack)\r\n\r\n• para acceder a información en Internet (por ejemplo, encontrar las palabras más populares en Twitter según el tema)\r\n\r\n• para organizar y presentar datos (por ejemplo, automatizar el trabajo de las hojas de cálculo o para visualización de datos)', ''),
(8, 'conceptos javascript', 'Escribí el siguiente  mensaje para que el usuario confirme\r\nconfirm("¡Me siento re bien!");\r\nconfirm("¡estoy usando agpcode!");', 'confirm("¡Me siento re bien!");\r\nconfirm("¡estoy usando agpcode!");', 'JavaScript interactivo', 'Lo que acabamos de ver es un ejemplo de cómo JavaScript puede ser interactivo. ¡Ahora intentalo vos!\r\nEjemplos:\r\n\r\nconfirm("¡Me siento re bien!");\r\nconfirm("Estoy listo para continuar.");\r\n\r\nEstas cajas de diálogos pueden usarse en los sitios web para que los usuarios confirmen acciones. Probablemente las viste aparecer cuando intentás borrar cosas importantes o cuando salís de un sitio web sin guardar los cambios. ', ''),
(9, 'conceptos JavaScript', 'Usá el comando indicador (prompt) para preguntarle al usuario de dónde es. Mirá los ejemplos anteriores para ver cómo hacerlo.', 'prompt("¿de donde eres?");', '¿Qué es programar?', '\r\n\r\nProgramar es como escribirle a la computadora una lista de instrucciones, de forma tal que pueda hacer cosas geniales con la información que le das.\r\n\r\nLos programas no pueden hacerte la cama pero sí pueden hacer operaciones matemáticas, llevar un registro de tu cuenta bancaria o enviarle un mensaje a alguno de tus amigos.\r\n\r\nPara realizar cualquiera de estas acciones, el programa necesita que se le ingresen datos. Podés pedirle al usuario que ingrese datos mediante un prompt.\r\n\r\nEjemplos:\r\n\r\n    prompt("¿Cuál es tu nombre?");\r\n    prompt("¿Qué es Ubuntu?");\r\n\r\n', ''),
(10, 'conceptos javascript', 'Escribí una cadena de al menos 3 palabras.\r\n"hola estoy usando agpcode"\r\nMirá los ejemplos de cadenas anteriores.\r\nAveriguá el largo de la cadena poniendo un punto final y la palabra .length de esta forma: "cadena".length\r\nLength cuenta todos los caracteres en una cadena, incluidos los espacios.', '\r\n"hola estoy usando agpcode".length', 'Tipos de datos I & II: Números y cadenas', '\r\n\r\nExisten varios tipos de datos. ¡Y ya usaste dos!\r\n\r\na. numbers (números) son cantidades, tal como los que conocés. Podés hacer operaciones matemáticas con ellos.\r\n\r\nb. strings (cadenas) son secuencias de caracteres, como las letras a-z, los espacios, e incluso los números. Todos estos son cadenas: "Juan", "4", "¿Cómo te llamás?" Las cadenas son muy útiles como etiquetas, nombres y contenido para tus programas.\r\n\r\nPara generar un número en tu código, simplemente escribilo como un numeral sin comillas: 42, 190.12334.\r\n\r\nPara escribir una cadena, tenés que ponerlo entre comillas: "¿Cómo te llamás?"\r\n', ''),
(11, 'conceptos JavaScript', 'Comparemos dos números que nos devuelvan un resultado true:\r\n\r\n    Primero, escribí la cadena "Estoy haciendo códigos como un genio"\r\n\r\n    Después, averiguá el largo de la cadena usando .length\r\n\r\n    Luego, compará el largo de la cadena para ver si es mayor a 10\r\n\r\nSi querés controlar tu código hacé clic en “ver” a continuación.\r\n\r\n', '"Estoy haciendo códigos como un genio".length >10', 'Tipos de datos III: booleanos', '\r\n\r\nEl tercer tipo de dato es un booleano (que se pronuncia "bu-lea-no"; se nombró así en honor a George Boole). Un booleano puede tener dos valores, true (verdadero) o false (falso).\r\n\r\nPodés usarlos en tu código haciendo sentencias que sean iguales a true o a false.\r\n\r\nPor ejemplo, el comparar dos números nos da un resultado true o false:\r\n\r\n    23 > 10 es true\r\n    5 < 4 es false\r\n\r\nLos booleanos son bastante útiles porque más adelante nos permitirán ejecutar ciertas partes de nuestro código solamente si ciertas condiciones son verdaderas. Por ejemplo, los cajeros automáticos calculan si [la cantidad de dinero de tu cuenta bancaria] > 0 y solamente te darán dinero si la respuesta es true.\r\n', ''),
(12, 'conceptos javascript', 'Mostrá en pantalla (print) las siguientes dos sentencias console.log al mismo tiempo. Escribí una en la línea 1 y la otra en la línea 2. Luego presiona “Guardar y enviar”.', 'console.log(2 * 5)\r\nconsole.log("Hola")', 'Usemos "console.log"', '\r\n\r\nPosiblemente te hayas dado cuenta de que el intérprete no muestra mensajes de todas las acciones que ejecuta. Así que si queremos saber qué está pensando, a veces tenemos que preguntárselo.\r\n\r\nEl comando console.log() toma lo que está entre paréntesis y lo registra en la pantalla debajo de tu código; ¡por eso es que se llama console.log() (registro de pantalla)!\r\n\r\nA esta acción se le conoce comúnmente como printing out (mostrar en pantalla).\r\n', ''),
(13, 'conceptos JavaScript', 'inserta 1 operadores usando console.log\r\nde manera que compares si la cadena "agpcode" es mayor que 10\r\nrecuerda el ;', 'console.log("agpcode".length>10);', 'Comparaciones', '\r\n\r\nHasta ahora, aprendimos acerca de tres tipos de datos:\r\n\r\n• Strings (cadenas) (por ej. "los perros hacen guau")\r\n\r\n• numbers (números) (por ej. 4, 10)\r\n\r\n• booleans (booleanos) (por ej. false, 5 > 4)\r\n\r\nVamos a aprender más sobre los operadores de comparación\r\n\r\nLista de operadores de comparación:\r\n\r\n• > Mayor que\r\n• < Menor que\r\n• <= Menor o igual que\r\n• >= Mayor o igual que\r\n• === Igual que\r\n• !== Distinto de\r\n', ''),
(14, 'conceptos javascript', 'Mirá la sentencia if del ejemplo\r\nhaz un if en la consola, agregá una condición dentro de los paréntesis ( ).\r\nsi "agpcode" es mayor de 5 caracteres muestre "he avanzado un poquito mas"\r\n\r\n Si la respuesta a la condición es sí, se ejecutará el código que está dentro de las llaves. Entonces, en la línea 2 del if, usá console.log para imprimir una cadena.\r\n', 'if ("agpcode".length>5) {\r\n    console.log("he aprendido un poquito mas");\r\n}	', 'Decisiones, decisiones...', 'Buen trabajo con las comparaciones! Ahora vamos a ver cómo podemos usar las comparaciones para preguntas que se puedan responder con sí o con no.\r\n\r\nDigamos que queremos escribir un programa que pregunta si tu nombre es más largo que 7 letras. Si la respuesta es sí, podemos responder "Tenés un nombre largo" Podemos hacer eso con una sentencia if:\r\n\r\nif( "miNombre".length >= 7 ) {\r\n    console.log("Tenés un nombre largo");\r\n}\r\n\r\nUna sentencia if se forma con la palabra clave if, como vimos antes, y un par de llaves { }. Si la respuesta a la condición es sí, se ejecutará el código que está dentro de las llaves.', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `leccion_rb`
--

CREATE TABLE IF NOT EXISTS `leccion_rb` (
  `idleccion` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(80) COLLATE utf8_spanish_ci NOT NULL,
  `actividad` text COLLATE utf8_spanish_ci NOT NULL,
  `respuesta` text COLLATE utf8_spanish_ci NOT NULL,
  `tituloteoria` varchar(80) COLLATE utf8_spanish_ci NOT NULL,
  `teoria` text COLLATE utf8_spanish_ci NOT NULL,
  `observacion` varchar(80) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`idleccion`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `leccion_rb`
--

INSERT INTO `leccion_rb` (`idleccion`, `nombre`, `actividad`, `respuesta`, `tituloteoria`, `teoria`, `observacion`) VALUES
(1, 'a', 'a', 'a', 'a', 'a', ''),
(2, 'b', 'b', 'b', 'b', 'b', ''),
(3, 'c', 'c', 'c', 'c', 'c', ''),
(4, 'd', 'd', 'd', 'd', 'd', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lenguaje`
--

CREATE TABLE IF NOT EXISTS `lenguaje` (
  `idlenguaje` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(40) COLLATE latin1_spanish_ci NOT NULL,
  `observacion` text COLLATE latin1_spanish_ci NOT NULL,
  PRIMARY KEY (`idlenguaje`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `idusuario` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(40) COLLATE latin1_spanish_ci NOT NULL,
  `apellido` varchar(40) COLLATE latin1_spanish_ci NOT NULL,
  `nombreusuario` varchar(40) COLLATE latin1_spanish_ci NOT NULL,
  `contraseña` varchar(20) COLLATE latin1_spanish_ci NOT NULL,
  `id_leccion` int(11) NOT NULL,
  `id_leccionjs` int(11) NOT NULL,
  `id_leccionruby` int(11) NOT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci AUTO_INCREMENT=9 ;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idusuario`, `nombre`, `apellido`, `nombreusuario`, `contraseña`, `id_leccion`, `id_leccionjs`, `id_leccionruby`) VALUES
(7, 'Douglas', 'Poveda', 'dgls', 'dgls', 2, 4, 4),
(8, 'd', 'd', 'd', 'd', 0, 2, 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
