package clase;

public class Equipo {
	/*Dada la clase Equipo con los atributos privados: código (int), marca (String), precio unitario (double)
	 *  y unidades (int); un constructor que inicialice los atributos privados, los métodos de acceso público 
	 *  set/get y el método aPagar (precio * unidades). 
 
Implemente la clase ArregloEquipos con el atributo privado equi (ArrayList de tipo Equipo) e implemente: 
*/
	
	private int codigo,unidades;
	private String marca;
	private double precioUnitario;
	public Equipo(int codigo, int unidades, String marca, double precioUnitario) {
		this.codigo = codigo;
		this.unidades = unidades;
		this.marca = marca;
		this.precioUnitario = precioUnitario;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	public double métodoPagar(){
		return(precioUnitario * unidades);
	}

}
