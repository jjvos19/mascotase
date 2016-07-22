/**
 * Proyecto de mascotas - EGPP 2016-07-14
 * 
 * @author Juan Jose Valencia Oropeza
 * 
 */
/**
 * Ejercicio de desarrollo (Enunciado)
 * Objetivo
 * ========
 * Este es un ejercicio para verificar la calidad en el dise�o y la escritura de c�digo. Entonces, el ejercicio no consiste solamente en encontrar una soluci�n al problema sino tambi�n que el c�digo de la soluci�n evidencie dominio de buenas pr�cticas de programaci�n y la aplicaci�n adecuada de principio y patrones de dise�o orientado a objeto. Se espera, por los tanto, que el c�digo vaya incrementando su calidad a medida que se avance en el desarrollo del diplomado incorporando en cada nueva entrega los conceptos que hayan sido presentados.
 * Requerimientos del proyecto
 * ===========================
 * Desarrollar un sistema para gestionar mascotas, el sistema podr�a ser empleado por refugios de animales o cl�nicas veterinarias, por ejemplo.
 * El sistema debe permitir:
 * * Guardar mascotas
 * * Crear nuevas mascotas
 * * Eliminar una mascota
 * * Buscar mascotas en maneras �tiles para el usuario del sistema:
 * - Por nombre, ordenados alfab�ticamente
 * - Por tipo de mascota (gato, perro, etc) ordenado por fecha con los registros m�s recientes al principio.
 * - Por g�nero y tipo (gato hembra) ordenado por fecha con los registros m�s recientes al principio
 * Inicialmente, las solicitudes se enviar�n desde la l�nea de comandos, los resultados se mostrar�n en pantalla y los datos de guardar�n en un archivo CSV. Gradualmente se podr�n incorporar mecanismos de entrada/salida m�s sofisticados como p�ginas web, servicios web o almacenamiento en una BD.
 * Ejemplos de comandos para ejecutar el programa:
 *      java sistemaMascotas nombre = princesa
 *      java sistemaMascotas tipo = gato
 *      java sistemaMascotas tipo= dog genero =femenino
 *      java sistemaMascotas guardar=GATO,Perla,F,20131231-145934
 *      java sistemaMascotas eliminar=GATO,Perla
 * Ejemplo de archivo CSV:
 *      GATO,Perla,F,20131231-145934
 *      PERRO,Doki,M,20130129-080903
 *      Cada l�nea tiene:
 * - Tipo de animal, nombre, g�nero, fecha de actualizaci�n en el sistema.
 *      La fecha de actualizaci�n tiene el siguiente formato �<a�o><mes><d�a>-<hora><minuto><segundo>�,
 * Ejemplo:
 *      Diciembre 31 de 2013 horas 14:59:34 ser� "20131231-145934".
 */
package pro;