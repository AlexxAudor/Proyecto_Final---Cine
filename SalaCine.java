public class SalaCine {
 
	String tituloPelicula;
	int Asientos;
	int clientes;
 
	// metodo constructor
	public SalaCine() {
		clientes = 20;
		tituloPelicula =  "";
	}
 
	public String getTituloPelicula() {
		return tituloPelicula;
	}
 
	public void setTituloPelicula(String tituloPelicula) {
		this.tituloPelicula = tituloPelicula;
	}
 
	public int getAsientos() {
		return Asientos;
	}
 
	public void setAsientos(int asientos) {
		Asientos = asientos;
	}
 
	public int getClientes() {
		return clientes;
	}
 
	public void setClientes(int clientes) {
		this.clientes = clientes;
	}
 
}
