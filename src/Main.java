/**
 * Created by Миша on 06.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        int[] a = new int[15];
        // int[] a1 = new int[]{1, 2,6,8,9,9};
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.round(Math.random() * 100);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        Sorter sort = new Sorter(a);
        a = sort.tosort(a);

        //int[] a2 = new int[a.length + a1.length];
//        for (int i = 0; i < a.length; i++) {
//            a1[i] = a[i] + 24;
//        }


        for (int i = 0; i < a.length; i++) System.out.print(a[i] + " ");

    }

}
