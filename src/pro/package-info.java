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
 * Este es un ejercicio para verificar la calidad en el diseño y la escritura de código. Entonces, el ejercicio no consiste solamente en encontrar una solución al problema sino también que el código de la solución evidencie dominio de buenas prácticas de programación y la aplicación adecuada de principio y patrones de diseño orientado a objeto. Se espera, por los tanto, que el código vaya incrementando su calidad a medida que se avance en el desarrollo del diplomado incorporando en cada nueva entrega los conceptos que hayan sido presentados.
 * Requerimientos del proyecto
 * ===========================
 * Desarrollar un sistema para gestionar mascotas, el sistema podría ser empleado por refugios de animales o clínicas veterinarias, por ejemplo.
 * El sistema debe permitir:
 * * Guardar mascotas
 * * Crear nuevas mascotas
 * * Eliminar una mascota
 * * Buscar mascotas en maneras útiles para el usuario del sistema:
 * - Por nombre, ordenados alfabéticamente
 * - Por tipo de mascota (gato, perro, etc) ordenado por fecha con los registros más recientes al principio.
 * - Por género y tipo (gato hembra) ordenado por fecha con los registros más recientes al principio
 * Inicialmente, las solicitudes se enviarán desde la línea de comandos, los resultados se mostrarán en pantalla y los datos de guardarán en un archivo CSV. Gradualmente se podrán incorporar mecanismos de entrada/salida más sofisticados como páginas web, servicios web o almacenamiento en una BD.
 * Ejemplos de comandos para ejecutar el programa:
 *      java sistemaMascotas nombre = princesa
 *      java sistemaMascotas tipo = gato
 *      java sistemaMascotas tipo= dog genero =femenino
 *      java sistemaMascotas guardar=GATO,Perla,F,20131231-145934
 *      java sistemaMascotas eliminar=GATO,Perla
 * Ejemplo de archivo CSV:
 *      GATO,Perla,F,20131231-145934
 *      PERRO,Doki,M,20130129-080903
 *      Cada línea tiene:
 * - Tipo de animal, nombre, género, fecha de actualización en el sistema.
 *      La fecha de actualización tiene el siguiente formato “<año><mes><día>-<hora><minuto><segundo>”,
 * Ejemplo:
 *      Diciembre 31 de 2013 horas 14:59:34 será "20131231-145934".
 */
package pro;