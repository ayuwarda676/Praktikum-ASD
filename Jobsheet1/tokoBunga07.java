package Jobsheet1;

public class tokoBunga07 {

    public static int hitungPendapatanCabang(int aglonema, int keladi, int alocasia, int mawar) {
        int hargaAglonema = 75000;
        int hargaKeladi = 50000;
        int hargaAlocasia = 60000;
        int hargaMawar = 10000;

        int pendapatan = (aglonema * hargaAglonema)
                       + (keladi * hargaKeladi)
                       + (alocasia * hargaAlocasia)
                       + (mawar * hargaMawar);

        return pendapatan;
    }
    
    public static String cekStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    public static void main(String[] args) {
        int[][] stok = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        String[] namaCabang = {
            "RoyalGarden 1",
            "RoyalGarden 2",
            "RoyalGarden 3",
            "RoyalGarden 4"
        };

        System.out.println("=== PENDAPATAN SETIAP CABANG (JIKA HABIS TERJUAL) ===");
        System.out.println("====================================================");

        for (int i = 0; i < stok.length; i++) {

            int aglonema = stok[i][0];
            int keladi = stok[i][1];
            int alocasia = stok[i][2];
            int mawar = stok[i][3];

            int pendapatan = hitungPendapatanCabang(aglonema, keladi, alocasia, mawar);
            String status = cekStatus(pendapatan);

            System.out.println(namaCabang[i]);
            System.out.println("Pendapatan : Rp" + pendapatan);
            System.out.println("Status     : " + status);
            System.out.println("----------------------------------");
        }
    }
}

