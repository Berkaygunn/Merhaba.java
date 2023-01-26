package Gun42;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {

        String cumle="";
        cumle=cumle+"bugün";
        cumle=cumle+"hava";
        cumle+="çok soğuk";

        System.out.println("cumle = " + cumle);
        System.out.println("cumle.concat() = " + cumle.concat("fakat dün sıcaktı"));
        System.out.println("cumle = " + cumle);

        cumle=cumle.concat("fakat dün sıcaktı");
        System.out.println("cumle = " + cumle);

        /******** StringBuilder *********/
        StringBuilder cumle2=new StringBuilder();
        cumle2.append("bugün");
        cumle2.append("hava");
        cumle2.append("soğuk");

        System.out.println("cumle2 = " + cumle2);

        /***** +,concat,StringBuilder 3 model için hız testi yapalım ******/

        long startTime=System.currentTimeMillis();
        String test1="";
        for (int i = 0; i < 10000; i++) {
            test1=test1 + "merhaba";
        }
        System.out.println("+ için süre = " + (System.currentTimeMillis()-startTime));


         startTime=System.currentTimeMillis();
        String test2="";
        for (int i = 0; i < 10000; i++) {
            test2=test2.concat("merhaba") ;
        }
        System.out.println("concat için süre = " + (System.currentTimeMillis()-startTime));


         startTime=System.currentTimeMillis();
         StringBuilder test3=new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            test3=test3.append("merhaba");
        }
        System.out.println("StringBuilder için süre = " + (System.currentTimeMillis()-startTime));




        StringBuilder sb=new StringBuilder();
        sb.append("bugün ");
        sb.append("hava ");
        sb.append("güzel");
        System.out.println("sb = " + sb);

        System.out.println("sb.length() = " + sb.length());
        sb.append(4);  // eklenen her şeyi toString hali var ise çevirerek ekler
        System.out.println("sb = " + sb);

        sb.reverse();  // Stringi tersine çevirir
        System.out.println("sb = " + sb);
        sb.reverse();
        System.out.println("sb = " + sb);

        sb.delete(0,5);  // (index)0 dahil, 5 hariç olmak üzere siler.
        System.out.println("sb = " + sb);

        sb.deleteCharAt(3);  // sadece belirtilen index deki karakteri siler
        System.out.println("sb = " + sb);

        sb.insert(5,"kelime");  // 5 nolu index e kelimeyi ekle : araya ekleme
        System.out.println("sb = " + sb);

        sb=new StringBuilder("bugün hava çok soğuk");  // sıfırlandı ve ilk değer atandı
        System.out.println("sb = " + sb);

        sb.replace(3,8,"bu");  // verilen aralığı bu stringle değiştirir.
        System.out.println("sb = " + sb);

        String strsb=sb.toString();

        StringBuffer sBuffer=new StringBuffer();   // tamamen StringBuilder ile aynı
        // tek farkı, paralel çalışan yazılımlarda, StringBuffer kullanılır.
















    }
}
