package Gun06;

public class _07_StringConcat {
    public static void main(String[] args) {
        // concat : bir string diğerine birleştiriyor

        String s1="merhaba";
        String s2="dünya";

        System.out.println("birleşik hali = "+s1+s2);
        System.out.println("birleşik hali = "+ s1.concat(s2));
        System.out.println("birleşik hali = "+s1.concat(" ").concat(s2));
        System.out.println("birleşik hali = "+s1.concat(" "+s2));
        System.out.println("birleştirme = "+s1.concat(" venüs"));
    }
}
