package shoppingcart;
public class Item {
	private String name;
	private String unit;
	private double unitQuantity;
	private double unitPrice;

	// Constructor, Getter and Setter and tostring()
	Item(String name, String unit,  double quantity, double unitPrice) {
		setName(name);
		setUnit(unit);
		setUnitQuantity(quantity);
		setUnitPrice(unitPrice);
	}
	@Override
	public String toString() {  //this is needed for ComboBox
		return name;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getUnit() {
		return unit;
	}
	public final void setUnit(String unit) {
		this.unit = unit;
	}
	public final double getUnitQuantity() {
		return unitQuantity;
	}
	public final void setUnitQuantity(double unitQuantity) {
		this.unitQuantity = unitQuantity;
	}
	public final double getUnitPrice() {
		return unitPrice;
	}
	public final void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
}
