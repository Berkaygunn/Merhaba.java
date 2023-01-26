package Gun46;

public class S17 {
    public static void main(String[] args) {

        int[][] arr=new int[2][4];  // 2. boyut yani sutun aşağıda yeniden boyutlandırılıyor

        arr[0]=new int[]{1,3,5,7};   // satır 0 -> bu satırı yeniden oluşturuyor
        arr[1]=new int[]{1,3};      // satır 1  -> bu satırı yeniden oluşturuyor

//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//
//            System.out.println();
//        }

        for (int[] satir: arr) // arr SATIRLARDAN oluşuyor arr[0],arr[1]
        {
            for (int eleman:satir) {
                System.out.print(eleman + " ");
            }
            System.out.println();
        }

    }
}
