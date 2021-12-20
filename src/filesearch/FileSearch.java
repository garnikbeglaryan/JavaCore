package filesearch;

import java.io.File;
import java.util.Scanner;

public class FileSearch {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please input path");
        String path = scanner.nextLine();
        File file = new File(path);
        if (file.isDirectory()) {
            System.out.println("please input search fileName");
            String fileName = scanner.nextLine();
            File file1 = new File(path, fileName);
            System.out.println(file1.isFile());
        }else {
            System.err.println("There is no such package");

        }
    }
}

