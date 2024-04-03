package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Bıcak","Kasatura",200.99,35,"Siyah");



        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        productManager.Add2(1, "Bıcak", "Kasatura", 2, 300);
        System.out.println(product.getKod());


    }
}