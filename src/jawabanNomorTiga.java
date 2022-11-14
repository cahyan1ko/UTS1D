import java.util.Scanner;

public class jawabanNomorTiga {
    //    public static String[] infoPlat = {{"K-Kudus", "B-Jakarta", "AB-Jogja", "T-Karawang", "AD-Solo"};
    static String[] Kudus = new String[100];
    static String[] Jakarta = new String[100];
    static String[] Jogja = new String[100];
    static String[] Karawang = new String[100];
    static String[] Solo = new String[100];

    static int jumlahPlat = Kudus.length + Jakarta.length + Jogja.length + Karawang.length + Solo.length;

    public static void main(String[] args) {
        inputPlat();
    }
    public static void PrintDataPlat() {
        int platKudus = 0;
        for (int i = 0; i < Kudus.length; i++) {
            if(Kudus[i] !=null) {
                platKudus++;
            }
        }
        int platJakarta = 0;
        for (int i = 0; i < Jakarta.length; i++) {
            if(Jakarta[i] !=null) {
                platJakarta++;
            }
        }
        int platJogja = 0;
        for (int i = 0; i < Jogja.length; i++) {
            if(Jogja[i] !=null) {
                platJogja++;
            }
        }
        int platKarawang = 0;
        for (int i = 0; i < Karawang.length; i++) {
            if(Karawang[i] !=null) {
                platKarawang++;
            }
        }
        int platSolo = 0;
        for (int i = 0; i < Solo.length; i++) {
            if(Solo[i] !=null) {
                platSolo++;
            }
        }
        jumlahPlat = platKudus + platJakarta + platJogja + platKarawang + platSolo;
        System.out.println("Plat Kudus : " + platKudus + " | Plat Jakarta : " + platJakarta + " | Plat Jogja " + platJogja + " | Plat Karawang : " + platKarawang + " | Plat Solo : " + platSolo);
        System.out.println("Jumlah Semua Plat Nomor : " + jumlahPlat);
    };

    public static void CheckIndexArray(String[] huruf, int plat) {

        for (int i = 0; i < huruf.length; i++) {
            if (huruf[i] != null) {
                break;
            }
        }
    };

    public static void dataPlat(String hurufPlat, int plat){
        switch (hurufPlat){
            case "K" :
                CheckIndexArray(Kudus,plat);
                System.out.println("Ini Plat Kudus");
                break;
            case "B" :
                CheckIndexArray(Jakarta,plat);
                System.out.println("Ini Plat Jakarta");
                break;
            case "AB" :
                CheckIndexArray(Jogja,plat);
                System.out.println("Ini Plat Jogja");
                break;
            case "T" :
                CheckIndexArray(Karawang,plat);
                System.out.println("Ini Plat Karawang");
                break;
            case "AD" :
                CheckIndexArray(Solo,plat);
                System.out.println("Ini Plat Solo");
                break;
        }
        PrintDataPlat();
    }

    static void inputPlat(){
        try(Scanner userInputHuruf = new Scanner(System.in)){
            while (true) {
                System.out.print("\nMasukkan Huruf Plat : ");
                String hurufPlat = userInputHuruf.nextLine();
                if (hurufPlat.isBlank()) {
                    System.out.println("Huruf Plat harus diisi");
                    inputPlat();
                } else {
                    Scanner userInputNomor = new Scanner(System.in);
                    System.out.print("\nMasukkan Angka Plat : ");
                    int angkaPlat = userInputNomor.nextInt();
                    if (angkaPlat %2==0){
                        System.out.println("Plat Genap");
                    } else {
                        System.out.println("Plat Ganjil");
                    }
                    dataPlat(hurufPlat, angkaPlat);
                }
            }
        }
    }

}
