/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package otro; //refactor de silvia

public class Pedido { //lo pongo private y lo pongo con la primera en mayúscula; 
    private int codigo;
	private int cantidad;
    private double precio;//cambio a precio y total
	private double total;
    
    public Pedido(int c,int ca,double pr){ //hago los inline porque al cambiar a private salen en todo el código en lugar de las variables
        this.codigo = c;
        this.cantidad = ca;
        this.precio = pr;
        this.total = precio*cantidad;
    }
    
    public double rebajar(double descuento){//cambio a porcentaje de descuento
        this.total = total-(total*descuento)/100;
        return total;
    }

    public double getTotal() { //los pongo públicos para que la clase pueda acceder
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
    
}
