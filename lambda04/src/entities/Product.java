package entities;

public class Product {

	private String name;
	private Double price;
	
	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	//EXEMPLO 2 REFERENCE METHOD COM M�TODO EST�TICO
	public static String staticUpperCaseName(Product p) {
		return p.getName().toUpperCase();
	}
	
	//EXEMPLO 3 REFERENCE METHOD COM M�TODO N�O EST�TICO
	public String nonStaticUpperCaseName() {
		return name.toUpperCase();
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
}
