package year2025;

import java.io.*;
import java.nio.file.*;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class TestFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("📂 Iltimos, test fayli joylashgan papka yo‘lini kiriting: ");
        String folderPath = scanner.nextLine().trim();

        Path inputFile = Paths.get(folderPath, "input.txt");
        Path outputFile = Paths.get(folderPath, "output.txt");

        if (!Files.exists(inputFile)) {
            System.out.println("❌ Xatolik: " + inputFile + " fayl topilmadi!");
            return;
        }

        try (BufferedReader reader = Files.newBufferedReader(inputFile);
             BufferedWriter writer = Files.newBufferedWriter(outputFile)) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Agar qatorda '#' bo‘lsa, olib tashlaymiz va '+' belgisini qo‘shamiz
                if (line.contains("#")) {
                    line = line.replace("#", "").trim() + " + ";
                }
                writer.write(line);
                writer.newLine();
            }

            System.out.println("✅ Tayyor! Yangi fayl yaratildi: " + outputFile.toAbsolutePath());

        } catch (IOException e) {
            System.err.println("⚠️ Xatolik: " + e.getMessage());
        }
    }
}
