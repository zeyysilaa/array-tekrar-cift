import java.util.Arrays;

public class TekrarCift {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int liste[] = {5, 4, 2, 9, 4, 8, 7, 3, 6, 2, 35, 75, 6};
        int ciftsayi[] = new int[liste.length];
        int a = 0;
        for (int i = 0; i < liste.length; i++) {
            for (int k = 0; k < liste.length; k++) {
                if ((i != k) && (liste[i] == liste[k])) {
                    if (!isFind(ciftsayi, liste[i])) {
                        ciftsayi[a++] = liste[i];
                        break;
                    }
                    ciftsayi[a++] = liste[i];
                    break;
                }
            }
        }
        for (int i : ciftsayi) {
            if ((i != 0)  && (i % 2 != 1)) {
                System.out.println(i);
            }
        }

    }
}
