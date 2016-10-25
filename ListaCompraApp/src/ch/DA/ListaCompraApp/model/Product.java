package ch.DA.ListaCompraApp.model;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class Product {

	private final StringProperty marca;
	private final StringProperty pulgadas;
	private final StringProperty cantidad;
	private final StringProperty precio;
	


		public Product(String marca, String pulgadas, String cantidad,  String precio) {
	        this.marca = new SimpleStringProperty(marca);
	        this.pulgadas = new SimpleStringProperty(pulgadas);
	        this.cantidad = new SimpleStringProperty(cantidad);
	        this.precio = new SimpleStringProperty(precio);
	 
	    }



		public StringProperty getMarca() {
			return marca;
		}



		public StringProperty getPulgadas() {
			return pulgadas;
		}



		public StringProperty getCantidad() {
			return cantidad;
		}



		public StringProperty getPrecio() {
			return precio;
		}
		
		
		
		

	    
		
		


	
}
