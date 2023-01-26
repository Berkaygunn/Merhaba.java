package Gun30._01_StaticVariables.Ornek2;

public class Student {
    int id;
    String name;

    static  int sayac=1; // sen bitanesin
    // static olmadan herzaman 0 la başlıyordu
    // static olduğunda artık bir tane oladuğundan
    // değerini korudu ve hep 1 tane arttı
    // tüm nesnelere ait olan bilgileri veya
    // sayac gibi işlemler için static kullanılır.



    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student( String name) {
        this.id = sayac++; // önce var olan değer verilir
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
