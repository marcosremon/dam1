public class Enunciados {

//    Ejercicio 1: 1,25 puntos

//    Desarrolla un programa que se conecte con el SGBD MySQL instalado en la máquina, debe usar el usuario root,
//    a pesar de que como se ha explicado es una mala práctica. Este programa deberá ver si en el SGDB existe la base
//    de datos: “supernivel” y si no existe debe crearla. Si al contrario la base de datos existe, el programa deberá
//    indicarnos que no se ha creado la BBDD ya que existía previamente.
//    Ejemplo de ejecución:
//    En la primera ejecución:
//    Se ha creado la BBDD “supernivel”
//    En ejecuciones posteriores:
//    No se ha creado la base de datos “supernivel” ya que existía previamente.

//----------------------------------------------------------------------------------------------------------------------

//    Ejercicio 2: 2 puntos

//    En este segundo ejercicio deberás deserializar un archivo json e incluir todo su contenido en una base de datos
//    que debes crear. Instrucciones:
//    Como sabes, un json se asemeja a una clase java, el contenido entre llaves va unido a los atributos de la clase:
//    descomprime y encontrarás un archivo Json (Uz.json) con datos de las carreras universitarias de la Universidad
//    de Zaragoza y un archivo java (Estudios.java), analiza el json y el archivo java, verás que el archivo java tiene
//    todos los atributos creados para la clase Estudios Abre la consola de administración de Mysql y manualmente,
//    no desde java, crea la base de datos “openData” y la tabla “datos”. Guarda en un script sql los comandos
//    necesarios para crear la BBDD y la tabla. Realiza un pequeño programa Java que deserialice el json e inserta
//    los datos en la base de datos “openData”, creada manualmente. Las inserciones las debes realizar usado
//    PreparedStatement. Para corregir este ejercicio, se lanzará el script SQL facilitado, y se ejecutará el programa.
//    Después se verificarán las inserciones realizadas en la BBDD:
//    use openData;
//    select * from datos;

//----------------------------------------------------------------------------------------------------------------------

//    Ejercicio 3: 6,75 puntos

//    En el zip encontrarás un archivo sql y programa funcional que debes modificar. Ejecuta y entiende dicho programa.
//    Crea la base datos supermercado, e importa el script sql.
//    Se desea modificar dicho programa para que cuando arranque cargue desde la base de datos
//    los datos existentes, y acabe guardando en la misma, para ello se pide:
//           Cargar la lista de Clientes (tabla clientes) (0,5 puntos)
//           Cargar la lista de Productos (tabla productos) (0,25 puntos)
//           Incorporar una opción al programa principal que solicite un importe al usuario y que muestre los
//              productos que tienen un importe superior al introducido (1 punto)
//           Cargar la lista de Carros. Para ello, tenéis la tabla carro en la BBDD que asocia un cliente con los
//              productos que tiene en su carro. Vamos a suponer que un cliente no
//              puede tener más de un carro. (3 puntos)
//           Implementa la opción de añadir un producto, guardando el producto dado de alta en la BBDD. (0.25 puntos)
//           Implementa la opción añadir un cliente, guardando el producto dado de alta en la BBDD. (0.25 puntos)
//           Implementa la opción “Realiza una compra” guardando los datos en la base de datos. (1,5 puntos)

}