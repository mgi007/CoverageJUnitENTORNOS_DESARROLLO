ALUMNOS: Elia Dotor y Miguel García
-----------------------------------


Depuración con `IntelliJ Idea`:
============================

* La primera diferencia la he encontrado a la hora de elegir los puntos de ruptura; ya que este IDE tiene 4 tipos diferentes de puntos de ruptura y uno de estos tipos (punto de ruptura por línea) equivale a los puntos de ruptura que habiamos generado con `Eclipse`.  


![Punto_de_ruptura_1](imagenes/punto_ruptura1.png)
  
![Punto_de_ruptura_2](imagenes/punto_ruptura2.png)

* A continuación comenzaremos primero por probar introduciendo un número par y pulsando el botón de `Step Into` y así podremos revisar el funcionamiento del metodo `esPar()`  

![Prueba_par](imagenes/prueba_par_into_1.png)

![Prueba_par](imagenes/prueba_par_into_2.png)

* Ahora probaré el mismo procedimiento pero introduciendo un número impar.

![Prueba_impar](imagenes/prueba_impar_into_1.png)

![Punto_impar](imagenes/prueba_impar_into_2.png)

![Punto_impar](imagenes/prueba_impar_into_3.png)
 
![Punto_impar](imagenes/prueba_impar_into_4.png)

 
* Ahora voy a cambiar el valor que ha tomado la variable `i` en este momento de la depuración

![Cambiar_valor](imagenes/cambiar_variable_1.png)

![Cambiar_valor](imagenes/cambiar_variable_2.png)

![Cambiar_valor](imagenes/cambiar_variable_3.png)


* Ahora voy a depurar el programa pero a la hora de llamar al método `esPar()` voy a pulsar el botón `Step Out` para no entrar a depurar el propio método sino que solo se evaluará el flujo principal del programa.

![Prueba_step_out](imagenes/prueba_step_out.png)

* Si pulsamos el botón `Step Into` en una línea en la que se llama a algún método de Java podremos ver el código de este método y como nuestro programa va recorriendo el código de este método.

![Ver_ejecucion_scanner](imagenes/metodo_scanner_1.png)

![Ver_ejecucion_scanner](imagenes/metodo_scanner_2.png)

![Ver_ejecucion_scanner](imagenes/metodo_scanner_3.png)


* Como conclusión final hemos observado que el depurador de `IntelliJ Idea` trae por defecto unas configuraciones muy parecidas al de `Eclipse`, pero `IntelliJ Idea` además de que tenga más tipos de puntos de ruptura (no nos hemos metido mucho ahi porque es algo que no hemos dado) tambíen tiene una mayor versatilidad que `Eclipse` ya que tiene una gran cantidad de herramientas y configuraciones para cambiar el funcionamiento de nuestro depurador de `IntelliJ Idea` según como sea nuestro programa y el objetivo de la depuración de nuestro programa.
