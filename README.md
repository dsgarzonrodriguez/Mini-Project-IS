# Mini-Project-IS


## Relaciones entre clases

Dependencia -> MAIN usa CALCULADORATARIFA para calcular el total a pagar por ticket

Asociación -> TICKET esta asociado a un VEHICULO

Agregación -> USUARIO agrega un VEHICULO, el vehiculo existe independientemente

Composición -> MAIN compone las listas de USUARIO y TICKET no tienen sentido fuera de el

## Encapsulamiento y control de acceso

El encapsulamiento se ve en las clases con los atributos PRIVATE y en sus obtención mediante
Getters y Setters haciendo que estos atributos solo sean accesibles desde su misma clase

## Heriencia y Polimorfismo

Se aprecia facilmente en las clases CARRO y MOTO, estas heredan de la clase Vehiculo la cual es abstracta, por otro lado el Polimorfismo tambien se aprecia por ejemplo en el metodo de CALCULARTARIFA donde se recibe un vehiculo y dependiendo de si es moto o si es carro la funcion retornara la tarifa según el vehiculo.

## Clases abstractas e Interfaces

La clase abstracta se ve en VEHICULO esta define atributos y comportamientos comunes para las clases MOTO y CARRO como tarifa, con la cual cada una define su precio de estacionamiento por hora, La interface seria Clase ESTACIONABLE la cual obliga a VEHICULO a implementar los metodos de ingresar(), salir() y estaEstacionado().

## Uso de static

Se uso Static en el tema de los IDs para cada usuario y cada ticket, esto para que cada uno tuviera un ID unico y nunca repetible, tambien se usó el Final para el tema de las tarifas tanto de carro como de moto, ya que estas son valores definidos y no cambiantes.


/// LOS EJEMPLOS/EVIDENCIAS SE ENCUENTRAN EN LA CARPETA DOCS.

  




