package produtos;

public class ImportedProduct  extends Product{

	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	// Método para calcular  o preço total
	public double totalPrice() {
		return getPrice() + customsFee;
	}
	@Override
	public String priceTag() {
		return getName() + " $ " + String.format("%.2f", totalPrice()) + "(Taxa alfandegária: $" + customsFee + ")";
	}
}
