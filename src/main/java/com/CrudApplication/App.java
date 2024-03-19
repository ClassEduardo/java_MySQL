package com.CrudApplication;

import com.CrudApplication.DAO.ProductDAO;
import com.CrudApplication.Entity.Product;

public class App {
   public static void main(String[] args) throws Exception {
      Product product = new Product();
      product.setName("Arroz");
      product.setPreco(29.99);

      new ProductDAO().insertProduct(product);
   }
}
