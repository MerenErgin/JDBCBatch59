import java.sql.*;

public class Query01 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1) Driver yukle
        Class.forName("com.mysql.jdbc.Driver");

        //2) Baglanti olustur
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/okul?serverTimezone=UTC","root","BURAYA SİFRE");
        // okul: baglanti yapilan database'in ismi
        //serverTimezone=UTC: hata varsa yazilir yoksa gerek yok

        //3) Statement: SQL kodlarimizi yazmak icin br nesne olustur
        Statement st = con.createStatement();

        //4) ResultSet: verileri saklamaya yarar
        ResultSet veri = st.executeQuery("select * from ogrenciler");

        //5) sonuclari al
        while (veri.next()){
            //index kullanarak
            //System.out.println(veri.getInt(1)+ veri.getString(2)
            //      +veri.getString(3)+ veri.getString(4));

            //sutun ismi kullanarak
            //System.out.println(veri.getInt("okul_no")+ veri.getString("ogrenci_ismi")
            //      +veri.getString("sinif")+ veri.getString("cinsiyet"));

            System.out.printf("%-6d %-15.15s %-8s %-8s\n", veri.getInt(1), veri.getString(2), veri.getString(3), veri.getString(4));
        }

        //6) kapatma
        con.close();
        st.close();
        veri.close();

    }

}
