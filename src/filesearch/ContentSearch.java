package filesearch;

import java.io.File;
import java.util.Scanner;

public class ContentSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please input path");
        String path = scanner.nextLine();
        File file = new File(path);
        if (file.isDirectory()) {
            System.out.println("please input name");
            String name = scanner.nextLine();
            File[] files = file.listFiles();
            for (File file1 : files) {
                if (file1.getName().contains(name)) {
                    System.out.println(file1.getName());

                }
            }
        }
    }
}

