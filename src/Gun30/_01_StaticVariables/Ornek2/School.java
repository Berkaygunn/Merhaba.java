package Gun30._01_StaticVariables.Ornek2;

public class School {
    public static void main(String[] args) {

        Student ogr1=new Student(1,"İsmet temur");
        Student ogr2=new Student(2,"İsmet temur");
        Student ogr3=new Student(3,"İsmet temur");
        // Problem: hem ıd yi takip etmek zorundayım,
        // hem de hata olasılığı yüksek


        Student ogr10=new Student("İsmet temur");
        Student ogr11=new Student("Mehmet yılmaz");
        Student ogr12=new Student("beyza demir");
        System.out.println("ogr10 = " + ogr10);
        System.out.println("ogr11 = " + ogr11);
        System.out.println("ogr12 = " + ogr12);
    }
}
