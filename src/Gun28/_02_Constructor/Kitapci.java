package Gun28._02_Constructor;

public class Kitapci {
    // Book class yazınız.fields: name,publishYear,author.
    // 3 adet Consructor ekleyiniz.
    // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
    // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.

    public static void main(String[] args) {

        Book ktp=new Book();
        ktp.name="Harry Poter";
        ktp.author="Jk Rowling";
        ktp.publishYear=1997;

        Book ktp2=new Book("yüzükler",1954,"JRR Tolkien");
        Book ktp3=new Book("üzüm ve çay");

        System.out.println("ktp = " + ktp);
        System.out.println("ktp2 = " + ktp2);
        System.out.println("ktp3 = " + ktp3);

    }
}
