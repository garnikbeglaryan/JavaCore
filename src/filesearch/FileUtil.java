package filesearch;

import java.io.*;

public class FileUtil {


    public void findLines(String txtPath, String keyword) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(txtPath))) {

            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public void printSizeOfPackage(String path) {
        File file = new File(path);
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getName() + " " + file1.length());
        }
    }

    public void createFileWithContent(String path, String filename, String content) throws IOException {
        File file = new File(path, filename);
        if (!file.exists()) {
            if (file.createNewFile()) {
                System.out.println("File is created");
            }
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

