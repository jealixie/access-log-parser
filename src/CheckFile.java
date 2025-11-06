import java.io.File;
import java.util.Scanner;
public class CheckFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fileCount = 0;
        while (true) {
            System.out.print("Введите путь к файлу: ");
            String path = scanner.nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (!fileExists || isDirectory) {
                System.out.println("Файл не найден или путь ведёт к папке");
                continue;
            }
            fileCount++;
            System.out.println("Путь указан верно");
            System.out.println("Это файл номер " + fileCount);
        }
    }
}