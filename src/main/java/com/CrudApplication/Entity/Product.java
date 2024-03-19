package com.CrudApplication.Entity;

public class Product {

   private String name;

   private double preco;

   public void setName(String name) {
      this.name = name;
   }

   public String getNome() {
      return name;
   }

   public void setPreco(double preco) {
      this.preco = preco;
   }

   public double getPreco() {
      return preco;
   }

}
