package com.CrudApplication.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.CrudApplication.Connection.Connection;
import com.CrudApplication.Entity.Product;

@Repository
public class ProductDAO {

   public void insertProduct(Product product) {
      String sql = "INSERT INTO produtos (nome, preco) VALUES (?, ?)";

      PreparedStatement ps = null;

      try {
         ps = Connection.getConnection().prepareStatement(sql);
         ps.setString(1, product.getNome());
         ps.setDouble(2, product.getPreco());

         ps.execute();
         ps.close();
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }

}
