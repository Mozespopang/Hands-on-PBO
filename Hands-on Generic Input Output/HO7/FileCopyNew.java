
import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.List;

public class FileCopyNew {
    public static void main(String[] args) {

        Path source = Paths.get("report.txt");
        Path backup = Paths.get("backup/report.txt");
        Path logFile = Paths.get("log.txt");

        try {
            // Membuat file sumber
            Files.write(source, List.of("Report Generated", "Status: OK"));

            // Pengecekan file sebelum menyalin
            if (Files.exists(source)) {

                if (Files.notExists(backup.getParent())) {
                    Files.createDirectories(backup.getParent());
                }

                Files.copy(source, backup, StandardCopyOption.REPLACE_EXISTING);

                String logMessage = "[" + LocalDateTime.now()
                        + "] SUCCESS: File " + source
                        + " berhasil disalin ke " + backup + "\n";

                Files.writeString(logFile, logMessage,
                        StandardOpenOption.CREATE,
                        StandardOpenOption.APPEND);

                System.out.println("Backup dan pencatatan log berhasil!");

            } else {
                String logMessage = "[" + LocalDateTime.now()
                        + "] FAILED: File sumber tidak ditemukan.\n";

                Files.writeString(logFile, logMessage,
                        StandardOpenOption.CREATE,
                        StandardOpenOption.APPEND);

                System.out.println("File sumber tidak ditemukan.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
