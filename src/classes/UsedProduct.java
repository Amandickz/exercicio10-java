package classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

    Date manufactureDate;

    public UsedProduct(String name, double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String priceTag(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return getName() + " (usado): R$ " + getPrice() + " (Data de Produção: " + dateFormat.format(manufactureDate) + ")";
    }
}
