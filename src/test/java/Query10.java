public class Query10 extends DatabaseUtilty{

    public static void main(String[] args) {

        createConnection();

        String query= "select * from ogrenciler";

        System.out.println("Sutun isimleri: "+ getColumnNames(query));

        System.out.println("Okul no: "+getColumnData(query, "okul_no"));
        System.out.println("Ogrenci imi: "+getColumnData(query, "ogrenci_ismi"));
        System.out.println("Sinif: "+getColumnData(query, "sinif"));
        System.out.println("Cinsiyet: "+getColumnData(query, "cinsiyet"));

    }
}
