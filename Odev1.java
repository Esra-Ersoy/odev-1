public class Odev1 {
    public static String veriler[][] = {{"Kadir","341"},{"Gökhan","273"},{"Hakan","278"},{"Suzan","329"},{"Pınar","445"},{"Mehmet","402"},{"Ali","388"},{"Emel","270"},{"Fırat","243"},{"James","334"},{"Jale","412"},{"Ersin","393"},{"Deniz","299"},{"Gözde","343"},{"Anıl","317"},{"Burak","265"}};
    public static int sonuclar[] = new int[16];

    public static int birinci,ikinci,ucuncu;
    public static int bir,iki,uc = 0; //değişken sıralaması

    public static int a,b,c;

    public static void main(String[] args) {
        Sonuclar();

        Birinci();
        Ikinci();
        Ucuncu();
        System.out.println("A -> " + a);
        System.out.println("B -> " + b);
        System.out.println("C -> " + c);
    }


    public static void Sonuclar() {
        int deger;
        for (int i = 0; i < veriler.length; i++) {
            deger = Integer.parseInt(veriler[i][1]);
            sonuclar[i] = deger;
        }

        for (int i = 0; i < sonuclar.length; i++) {
            if (sonuclar[i] < 300) {
                a += 1;
            } else if (sonuclar[i] < 400) {
                b += 1;
            } else {
                c += 1;
            }
        }
    }

    public static void Birinci() {
        int sinir = 1000;

        for (int i = 0; i < sonuclar.length; i++) {
            if (sonuclar[i] < sinir) {
                sinir = sonuclar[i];
                bir = i;
            }
        }

        birinci = sinir;
        System.out.println("Birinci: " + veriler[bir][0] + " " + birinci + "'");
    }

    public static void Ikinci() {
        int sinir = 1000;
        int temp;
        for (int i = 0; i < sonuclar.length; i++) {
            if (sonuclar[i] < sinir && sonuclar[i] > birinci) {
                sinir = sonuclar[i];
                iki = i;
            }
        }

        ikinci = sinir;
        System.out.println("İkinci: " + veriler[iki][0] + " " + ikinci + "'");
    }

    public static void Ucuncu() {
        int sinir = 1000;
        int temp;
        for (int i = 0; i < sonuclar.length; i++) {
            if (sonuclar[i] < sinir && sonuclar[i] > ikinci) {
                sinir = sonuclar[i];
                uc = i;
            }
        }

        ucuncu = sinir;
        System.out.println("Üçüncü: " + veriler[uc][0] + " " + ucuncu + "'");
    }
}