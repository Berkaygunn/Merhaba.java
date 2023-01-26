package Gun07;

public class _08_StringEndsWith {
    public static void main(String[] args) {
        // EndsWith : verilen karakterler ile bitiyor mu
        // sonuç true veya false yani boolean döner
        
        String text="merhaba dünya";

        System.out.println("text.endsWith(ya) = " + text.endsWith("ya")); // true
        System.out.println("text.endsWith(n) = " + text.endsWith("n")); // false
        System.out.println("text.endsWith(dünya) = " + text.endsWith("dünya")); // true
    }
}
