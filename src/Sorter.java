/**
 * Created by Миша on 13.09.2016.
 */
public class Sorter {
    private int[] a;

    public Sorter(int[] a) {
        this.a = a;
    }

    public int[] sli(int[] mas1, int[] mas2) {
        int[] resMas = new int[mas1.length + mas2.length];
        int k = 0, i = 0, j = 0;


        while (k != resMas.length) {

            if (mas1[i] > mas2[j]) {
                resMas[k] = mas2[j];
                j++;
                k++;
            } else {
                if (mas1[i] < mas2[j]) {

                    resMas[k] = mas1[i];
                    i++;
                    k++;
                } else if (mas1[i] == mas2[j]) {
                    resMas[k] = mas2[j];
                    resMas[k + 1] = mas2[j];
                    i++;
                    j++;
                    k += 2;
                }
            }
            if (i == mas1.length) {
                for (int q = k; q < resMas.length; q++) resMas[q] = mas2[j + q - k];
                k=resMas.length;
            }
            if (j == mas2.length) {
                for (int q = k; q < resMas.length; q++) resMas[q] = mas1[i + q - k];
                k=resMas.length;
            }

        }


        return resMas;
    }

    public int[] tosort(int[] mas) {
        if (mas.length > 2) {
            int[] p1 = new int[mas.length / 2];
            int[] p2 = new int[(mas.length + (mas.length % 2)) / 2];
            for (int i = 0; i < mas.length / 2; i++) {
                p1[i] = mas[i];
            }

            for (int i = mas.length / 2; i < mas.length; i++) {
                p2[i - mas.length / 2] = mas[i];
            }

            int[] s1 = tosort(p1);
            int[] s2 = tosort(p2);
            mas = sli(s1, s2);

        } else if (mas.length == 2) {
            if (mas[1] < mas[0]) {
                int k = mas[1];
                mas[1] = mas[0];
                mas[0] = k;
            }
        }

        return mas;
    }
}
