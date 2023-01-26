package Gun46;

public class S71 {
    public static void main(String[] args) {
        int[][] arr=new int[2][4];

        arr[0]=new int[]{1,3,5,7};
        arr[1]=new int[]{1,3};

        // 2 boyutlu dizilerin eleman sayısı diye incelediğimizde satır sayısı karşımıza çıkar.
        System.out.println("arr.length = " + arr.length);
        System.out.println("arr[0].length = " + arr[0].length);
        System.out.println("arr[1].length = " + arr[1].length);

        for (int[] a: arr){  // a burada arr im elelamnları yani satırlarını temsil ediyor sırasıyla

            // arr.length satır sayısını, a.length ise her satırın elelamn sarısını temsil eder
            for (int i = 0; i < arr.length; i++) {  // a.length  : satırın bütün elemanlarını yazması için
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }

    }
}
