
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

// Generic class untuk berbagai jenis data
class DataRecord<T, U, V> {
    private T field1;
    private U field2;
    private V field3;

    public DataRecord(T field1, U field2, V field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public String toString() {
        return field1 + "," + field2 + "," + field3;
    }
}

public class ProdukWriterNew {

    public static <T, U, V> void simpanDanBacaData(
            List<DataRecord<T, U, V>> dataList, String namaFile) {

        Path filePath = Paths.get(namaFile);

        try {
            List<String> lines = new ArrayList<>();

            for (DataRecord<T, U, V> item : dataList) {
                lines.add(item.toString());
            }

            // Menulis data ke file
            Files.write(filePath, lines);

            System.out.println("Data berhasil disimpan ke " + namaFile);

            // Membaca kembali isi file
            System.out.println("Isi file " + namaFile + ":");

            List<String> readLines = Files.readAllLines(filePath);

            for (String line : readLines) {
                System.out.println("  -> " + line);
            }

            System.out.println();

        } catch (IOException e) {
            System.out.println("Gagal memproses file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        // 1. Data Produk
        List<DataRecord<String, Double, Integer>> produkList =
                new ArrayList<>();

        produkList.add(new DataRecord<>("Laptop", 15000000.0, 10));
        produkList.add(new DataRecord<>("Mouse", 150000.0, 50));
        produkList.add(new DataRecord<>("Keyboard", 350000.0, 25));

        simpanDanBacaData(produkList, "produk_output.txt");

        // 2. Data Pelanggan
        List<DataRecord<Integer, String, String>> pelangganList =
                new ArrayList<>();

        pelangganList.add(new DataRecord<>(101, "Andi", "Makassar"));
        pelangganList.add(new DataRecord<>(102, "Rina", "Jakarta"));

        simpanDanBacaData(pelangganList, "pelanggan_output.txt");

        // 3. Data Transaksi
        List<DataRecord<String, Double, Boolean>> transaksiList =
                new ArrayList<>();

        transaksiList.add(new DataRecord<>("TRX-01", 450000.0, true));
        transaksiList.add(new DataRecord<>("TRX-02", 120000.0, false));

        simpanDanBacaData(transaksiList, "transaksi_output.txt");
    }
}
