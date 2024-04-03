package org.example;

public class ProductManager {
    public void Add(Product product){
        System.out.println("Ürün eklendi.." + product.getName() +"Fiyatı: "+ product.getPrice());
    }
    public void Add2(int id, String name, String description, int stockAmount,double price){

    }
}
