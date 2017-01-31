
public class Producto {
	public static final double IVA = 20;
	
	private static int codigoAnterior = 0;
	private int codigoArticulo;
	private String descripcionArticulo;
	private double precio;

	public Producto(String descripcion, double precio) throws ArticuloException {
		setDescripcionArticulo(descripcion);
		setPrecio(precio);
		setCodigoArticulo();

	}

	public void setCodigoArticulo() {
		codigoAnterior++;
		codigoArticulo = codigoAnterior;
	}

	public int getCodigoArticulo() {
		return codigoArticulo;
	}

	public String getDescripcionArticulo() {
		return descripcionArticulo;
	}

	public void setDescripcionArticulo(String descripcionArticulo) {
		this.descripcionArticulo = descripcionArticulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) throws ArticuloException {
		if (precio <= 0)
			throw new ArticuloException("Error. No puede ser negativo.");
		this.precio = precio;
	}

	public double calcularPrecio() {
		return (precio + precio * IVA / 100);
	}

	@Override
	public String toString() {
		return "Producto [codigoArticulo=" + codigoArticulo + ", descripcionArticulo=" + descripcionArticulo
				+ ", precio+IVA=" + calcularPrecio() + "]";
	}

}
