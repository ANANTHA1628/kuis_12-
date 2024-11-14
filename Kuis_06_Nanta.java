public class Kuis_06_Nanta {
    public static void main(String[] args) {

        int[][] penjualanTiket06 = {
            {15, 7, 16, 7, 9, 20, 16},   
            {8, 10, 14, 9, 12, 16, 14},  
            {9, 4, 13, 11, 8, 9, 29},    
            {8, 14, 10, 6, 15, 12, 10}   
        };

        int[] hargaWeekday06 = {30000, 50000, 50000, 60000};
        int[] hargaWeekend06 = {40000, 50000, 75000, 150000};

        String[] hari06 = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        String[] tipeStudio06 = {"Reguler", "Dolby Atmos", "IMAX", "Premiere"};

        int[] totalTiketPerHari06 = new int[7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                totalTiketPerHari06[i] += penjualanTiket06[j][i];
            }
            System.out.println("Total tiket terjual pada hari " + hari06[i] + ": " + totalTiketPerHari06[i]);
        }
        int totalTiketMinggu06 = 0;
        for (int i = 0; i < 4; i++) {
            totalTiketMinggu06 += penjualanTiket06[i][6];
        }
        double rataRataMinggu06 = totalTiketMinggu06 / 4.0;
        System.out.println("\nRata-rata penjualan tiket pada hari Minggu: " + rataRataMinggu06);

        int totalPemasukan06 = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                int harga06 = (i < 5) ? hargaWeekday06[j] : hargaWeekend06[j];
                totalPemasukan06 += penjualanTiket06[j][i] * harga06;
            }
        }
        System.out.println("\nTotal pemasukan bioskop selama satu minggu: Rp " + totalPemasukan06);
      
       int Maxpenjualan06 = 06;
       String Studioterlaris06 = "";
       String hariterlaris06 = "";
       for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (penjualanTiket06[i][j]> Maxpenjualan06) {
                     Maxpenjualan06 = penjualanTiket06[i][j];
                     Studioterlaris06 = tipeStudio06 [i];
                     hariterlaris06 = hari06 [j];
                }       
            }    
       }
        System.out.println("\nPenjualan tiket tertinggi pada studio: " + Studioterlaris06 + " pada hari " + hariterlaris06 + " dengan tiket terjual sebanyak " + Maxpenjualan06 + " tiket.");
        System.out.println("");
    }
}





