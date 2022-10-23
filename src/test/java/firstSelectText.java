import org.apache.phoenix.jdbc.PhoenixDriver;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class firstSelectText {



  @Test
  public void  query() throws Exception{

      Class.forName(PhoenixDriver.class.getName());
      //映射 jdbc 驱动文件 类似 MySQL的 德鲁伊

     Connection connection= DriverManager.getConnection("jdbc:phoenix:hadoop01:2181");


     String sql="SELECT * FROM DATAS";

    Statement statement=connection.createStatement();

     ResultSet resultSet=statement.executeQuery(sql);

     while (resultSet.next()!=false){

         System.out.println(resultSet.getInt("id"));
         System.out.println(resultSet.getString("content"));
         System.out.println(resultSet.getString("crawlTime"));
         System.out.println(resultSet.getString("createTime"));
         System.out.println(resultSet.getString("score"));
         System.out.println(resultSet.getString("menberLeve"));
         System.out.println(resultSet.getString("color"));
         System.out.println(resultSet.getString("productSiz"));
         System.out.println(resultSet.getString("saleValue"));



     }


     resultSet.close();
     statement.close();
     connection.close();
  }



}
