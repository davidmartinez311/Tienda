NOMBRE DEL PROYECTO:

Tienda de Electrodomésticos

INTEGRANTES:

Adrián de Jesús Jacinto Vega    25-4552-2024
Abner Danilo Morales Fuentes    27-1354-2025
David Enrique Gil Martínez      27-1352-2025

ENTIDAD ELEGIDA:

Producto

INSTRUCCIONES PARA EJECUCION:

Utilizando el IDE IntelliJ IDEA, abra la carpeta del proyecto y presione las teclas SHIFT + F10 para iniciar la ejecucion

USO DE INTELIGENCIA ARTIFICIAL:

El uso de inteligencia artificial en la aplicacion se llevo a cabo en 3 puntos, el primero de ellos es en el metodo de listar los productos
de una manera en la cual orientarnos para saber como devolver una coleecion de objetos sin imprimir o retornar nada
por ello fue necesario importar las siguientes librerias
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
De esta manera se cumplia lo que mencionaba el enunciado de hacer una lista aplicando lo que necesita el ejercicio del patro Dao que va a
la bd, extrae y lo empaqueta por ello tiene un tipo de List<Producto> porque al finalizar la ejecucion tendra una lista de este tipo.
La otra parte que se utilizo ia siempre fue de manera para orientar los comando de sql para eliminar y actualizar ademas de saber el
que porcion de codigo permite que identifique si una fila sufrio una modificacion, en el caso de eliminar se hizo en base al id.
Donde es el metodo de crear y de insertar se realizo en base al ejemplo dado en el video del aula y aunque la ia sugeria utilizar metodos
booleanos se opto por aplicar lo mostrado en el video a diferencia del metodo de la lista ese para fines de cumplir lo que se pedia de
hacer la lista se utilizo esa herramienta. Por ultimo el main contiene ia solo para imprimir la lista que viene a relacion con lo anterior como devuelve en una coleccion se utilizo % para reservar una medida, para el for que va a la base de datos y devuelve la lista por esa razon tiene p.getId.. porque en cada recorrido guardara el producto en una variable p ya que recorrera toda la lista con los registros que se encuentre a su paso. En pocas palabras se uso Ia para la cuestion de la listar y poder mostrarlo en el main y un poco de ia para esquematizar los demas metodos siguiendo la logica que se nos dio en los materiales de apoyo.