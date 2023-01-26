package Gun19;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        int[][] tablo={
                {3,4,55},
                {234,22,33}
        };

        System.out.println("satır uzunluğu =" + tablo.length);  // 2 // satır sayısı
        System.out.println("0.satırın uzunluğu =" + tablo[0].length); // 3, sutün uzuluğu
        System.out.println("1.satırın uzunluğu =" + tablo[1].length); // 3, sutün uzuluğu

        for (int i = 0; i < 2; i++) {  // satır sayısı

            // ilgili satırdaki sütun uzunluğu
            for (int j = 0; j < 3; j++) {
                System.out.print(tablo[i][j]+"\t");
            }

            System.out.println();
        }
    }
}
