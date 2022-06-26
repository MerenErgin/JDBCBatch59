import java.sql.*;

public class Query02 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/okul?serverTimezone=UTC","root","1234");

        Statement st = con.createStatement();

        // Soru1: Ogrenciler tablosundaki erkek ogrenci bilgileri getir
        ResultSet veri= st.executeQuery("select * from ogrenciler where cinsiyet= 'E'");

        while (veri.next()){
            /*
            System.out.println(veri.getInt(1)+ veri.getString(2)
                + veri.getString(3) + veri.getString(4));
             */

            System.out.printf("%-6d %-15.15s %-8s %-8s\n", veri.getInt(1), veri.getString(2), veri.getString(3), veri.getString(4));

        }

        //Soru2: ogrenciler tablosundaki 9. sinif ve kiz ogrencilerin bilgilerini getir

        System.out.println("==========================================================================");

    }

}
