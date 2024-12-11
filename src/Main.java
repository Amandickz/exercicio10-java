import classes.ImportedProduct;
import classes.Product;
import classes.UsedProduct;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner scan = new Scanner(System.in);
        int quantity;
        char type;
        String name, manufactureDate;
        double price, customsFee;

        List<Product> listProducts = new ArrayList<>();

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com a quantidade de Produtos: ");
        quantity = scan.nextInt();

        for (int i = 0; i < quantity; i++) {

            System.out.print("Produto #" + (i+1) + ":");
            System.out.print("Novo, usado ou importado (c/u/i)? ");
            type = scan.next().charAt(0);
            System.out.print("Nome: ");
            scan.nextLine();
            name = scan.nextLine();
            System.out.print("Preço: ");
            price = scan.nextDouble();

            if(type == 'u') {
                System.out.print("Data da Fabricação: ");
                scan.nextLine();
                manufactureDate = scan.nextLine();

                Date manDate = new Date();
                manDate = dateFormat.parse(manufactureDate);

                listProducts.add(new UsedProduct(name, price, manDate));
            } else if (type == 'i') {
                System.out.print("Taxa de Importação: ");
                customsFee = scan.nextDouble();

                listProducts.add(new ImportedProduct(name, price, customsFee));
            } else {
                listProducts.add(new Product(name, price));
            }

        }

        System.out.println("\nTags dos Preços: ");

        for (Product product : listProducts) {
            System.out.println(product.priceTag());
        }

    }
}