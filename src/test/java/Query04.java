import java.sql.*;

public class Query04 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/okul?serverTimezone=UTC","root","1234");

        //Statement st = con.createStatement();
        PreparedStatement ps= con.prepareStatement("select * from ogrenciler");

        ResultSet rs= ps.executeQuery();

        ResultSetMetaData rsmd= rs.getMetaData();

        System.out.println("Tablonun ismi: "+rsmd.getTableName(1));
                                                              // 4 tane sutun oldugu icin 4 ten fazla sayi kullanamayiz

        System.out.println("Toplam sutun sayisi: "+rsmd.getColumnCount());

        System.out.println("1. Sutunun ismi: "+rsmd.getColumnName(1));
        System.out.println("2. Sutunun ismi: "+rsmd.getColumnName(2));
        System.out.println("3. Sutunun ismi: "+rsmd.getColumnName(3));
        System.out.println("4. Sutunun ismi: "+rsmd.getColumnName(4));

        System.out.println("1. Sutunun data tipi: "+rsmd.getColumnTypeName(1));
        System.out.println("2. Sutunun data tipi: "+rsmd.getColumnTypeName(2));
        System.out.println("3. Sutunun data tipi: "+rsmd.getColumnTypeName(3));
        System.out.println("4. Sutunun data tipi: "+rsmd.getColumnTypeName(4));


    }
}
