

package javaapplication12;

public class MyUtils {

    public static float ucgenCevre(float a, float b, float c) {
        System.out.println("Ucgenin Cevresi = " + (a + b + c));
        return a + b + c;

    }

    public static float ucgenAlan(float a, float b, float c, float cevre) {
        float u;
        double alan;
        float toplam;
        u = cevre / 2;
        toplam = (u * (u - a) * (u - b) * (u - c));
        alan = Math.sqrt(toplam);
        System.out.println("Ucgenin Alani = " + alan);
        // alan=Math.sqrt(toplam);

        return toplam;
    }

    public static float cokgenCevre(float s, float n) {
        // s = kenar uzunluÄŸu
        // n = kenar sayÄ±sÄ±

        System.out.println("Cokgenin Cevresi = " + s * n);
        return s * n;
    }

    public static double cokgenAlan(float s, float n) {
        double r = s / 2 * (Math.sqrt(3));

        // s = kenar uzunluÄŸu
        // n = kenar sayÄ±sÄ±
        // r = Ã§okgenin ortasÄ±na olan uzunluk "bu da kenarÄ±n 1/2*kÃ¶k(3)'Ã¼ne eÅŸittir"
        System.out.println("Cokgenin Alani = " + s * n * r / 2);
        return s * n * r / 2;
    }

    public static void main(String[] args) {
        float cevre = MyUtils.ucgenCevre(3, 4, 5);
        MyUtils.ucgenAlan(3, 4, 5, cevre);
        MyUtils.cokgenCevre(20, 6);
        MyUtils.cokgenAlan(20, 6);

    }

}
