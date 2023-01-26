package Gun29._02_PrivateErisim;

public class Calisan {
    int id;        // default
    String name;   // default
    String surname; // default

    private String password;  // private

    public void sifreAta(String sifre)
    //sadece bulunduğu class dan erişim izni var
    {
        // şifreyi kontrol ederek atayacağım
        if (sifre.length() < 8){
            System.out.println("zayıf şifre");
        }
        else {
            this.password=sifre;
            System.out.println("şifre başarıyla atandı");
        }
    }

    public void sifreGoster()
    {
        System.out.println("****"+password.substring(4));
    }
}
