import java.sql.*;

public class ConnectMySQL
{
  public static void main(String args[])
  {
    try
    {

      Class.forName("com.mysql.jdbc.Driver");

      Connection conn = DriverManager.getConnection(
      "jdbc:mysql://localhost:3306/bdd-api-tp1", "root", "");

      Statement stmt = conn.createStatement();
      ResultSet res = stmt.executeQuery("SELECT * FROM pokemon");

      while(res.next())
        System.out.println(res.getInt(1)+"  "+res.getString(2)
        +"  "+res.getString(3)+"  "+res.getInt(4)+"  "+res.getInt(5)+"  "+res.getString(6));

        conn.close();
    }
    catch(Exception e){ 
      System.out.println(e);
    }
  }
}