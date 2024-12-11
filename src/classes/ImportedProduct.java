package classes;

public class ImportedProduct extends Product {

    private double customsFee;

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    public String priceTag(){
        return getName() + ": R$ " + totalPrice() + " (Customs fee: R$ " + customsFee + ")";
    }

    public double totalPrice() {
        return getPrice() + getCustomsFee();
    }
}
