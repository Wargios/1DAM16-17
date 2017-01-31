/**
 * 3. Crear una clase que represente Producto con las siguientes
 * características:
 * 
 *  Tienen un código que los identifica de manera única y que se asigna
 * automáticamente en el momento de la creación.
 * 
 *  Guardan la descripción y el precio sin IVA.
 * 
 *  Todos los productos comparten el mismo IVA (supongamos el 20%), que puede
 * variar en función de las decisiones del gobierno.
 * 
 * La clase Producto debe proporcionar los métodos adecuados:
 * 
 *  Constructor.
 * 
 *  Métodos para consulta y modificación de los atributos.
 * 
 *  Método para calcular el precio de venta del producto que se obtiene
 * sumándole al precio el IVA correspondiente.
 * 
 * Realizar un programa principal que pruebe la clase anterior
 * 
 * @author alumnodiurno
 *
 */
public class Principal {
	public static void main(String[] args) {
		Producto p1;
		Producto p2;
		try {
			p1 = new Producto("pipas", 0.20);
			p2 = new Producto("patatas", 0.30);
			
			System.out.println(p1);
			System.out.println(p2);

		} catch (ArticuloException e) {
			e.getMessage();
		}
	}

}
