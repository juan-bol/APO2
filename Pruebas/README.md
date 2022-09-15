1. Modifique el método agregar carro de manera que este valide que:
   - La placa debe tener seis caracteres y empezar con una letra del abecedario
   - El color debe ser ser alguno de tres posibles valores que deben ser definidos previamente como constantes
   - El número de asientos debe ser mayor a 2
2. Implemente una nueva excepción que se dispare cuando se intente crear un carro con alguno de sus campos vacíos o que no cumpla alguna de las condiciones anteriores. Recuerde que las excepciones deben ir en un paquete distinto.
2. Implemente los métodos que hacen falta para que las pruebas unitarias logren ejecutarse con éxito
3. Cree pruebas unitarias que permitan validar las siguientes especificaciones
   - Cuando el consecionario se inicialice, el número de carros debe ser cero
   - Cuando se elimime un carro, el número total de carros debe disminuir
   - Cuando se agrege un carro, el número total de carros debe aumentar
   - Cuando se eliminen todos los carros, teniendo previamente por lo menos un carro, el número total de carros debe ser cero
