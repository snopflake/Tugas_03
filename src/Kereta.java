public class Kereta {

    //Deklarai variabel dan array
    private String namaKereta;
    private int jumlahTiket;
    private Ticket[] daftarTiket;

    // Default constructor = Kereta Komuter
    public Kereta() {
        this.namaKereta = "Kereta Komuter";
        this.jumlahTiket = 1000;
        this.daftarTiket = new Ticket[jumlahTiket]; 
    }

    // Overloaded constructor = Kereta Api Jarak Jauh (KAJJ) - Penambahan parameter namaKereta dan jumlahTiket
    public Kereta(String namaKereta, int jumlahTiket) {
        this.namaKereta = namaKereta;
        this.jumlahTiket = jumlahTiket;
        this.daftarTiket = new Ticket[jumlahTiket]; 
    }

    // Menambahkan tiket untuk Kereta Komuter
    public void tambahTiket(String namaPenumpang) {

        //Jika tiket lebih dari nol pesan tiket berhasil
        if (jumlahTiket > 0) {
            daftarTiket[jumlahTiket - 1] = new Ticket();
            daftarTiket[jumlahTiket - 1].setNamaPenumpang(new String[]{namaPenumpang});
            jumlahTiket--;
            System.out.println("=================================================");
            System.out.println("Tiket berhasil dipesan");

            //Print sisa tiket jika jumlah tiket kurang dari 30
            if (jumlahTiket < 30) {
                System.out.println(" Sisa tiket tersedia: " + jumlahTiket);
            }
        } else {
            //Jika tiket = nol pesan tiket gagal
            System.out.println("\"=================================================\"");
            System.out.println("Kereta telah habis dipesan, silahkan cari jadwal keberangkatan lainnya");
        }

    }

    // Menambahkan tiket untuk KAJJ (Memakai overloaded method)
    public void tambahTiket(String namaPenumpang, String asal, String tujuan) {
        if (jumlahTiket > 0) {
            daftarTiket[jumlahTiket - 1] = new Ticket();
            daftarTiket[jumlahTiket - 1].setNamaPenumpang(new String[]{namaPenumpang});
            daftarTiket[jumlahTiket - 1].setAsal(new String[]{asal});
            daftarTiket[jumlahTiket - 1].setTujuan(new String[]{tujuan});
            jumlahTiket--;
            System.out.println("=================================================");
            System.out.print("Tiket berhasil dipesan");

            //Print sisa jika jumlah tiket kurang dari 30
            if (jumlahTiket < 30) {
                System.out.println(" Sisa tiket tersedia: " + jumlahTiket);
            }
        } else {
            System.out.println("=================================================");
            System.out.println("Kereta telah habis dipesan, silahkan cari jadwal keberangkatan lainnya");
        }


    }

    // Menampilkan daftar tiket
    public void tampilkanTiket() {
        System.out.println("=================================================");
        System.out.println("Daftar penumpang kereta api " + namaKereta);
        System.out.println("----------------------------------");
        for (int i = 0; i < daftarTiket.length; i++) {
            if (daftarTiket[i] != null) {
                if (namaKereta.equals("Kereta Komuter")) {
                    System.out.println("Nama: " + daftarTiket[i].getNamaPenumpang()[0]);
                } else {
                    System.out.println("Nama: " + daftarTiket[i].getNamaPenumpang()[0]);
                    System.out.println("Asal: " + daftarTiket[i].getAsal()[0]);
                    System.out.println("Tujuan: " + daftarTiket[i].getTujuan()[0]);
                    System.out.println("----------------------------------");
                }
            }
        }
    }
}