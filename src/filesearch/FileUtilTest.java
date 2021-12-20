package filesearch;

import java.io.IOException;

public class FileUtilTest {

    public static void main(String[] args) throws IOException {


        FileUtil fu = new FileUtil();

        fu.findLines("C:\\Users\\Dell\\Desktop\\Example\\text.txt", "kancni");
        fu.printSizeOfPackage("C:\\Users\\Dell\\Desktop\\Example");
        fu.createFileWithContent("C:\\Users\\Dell\\Desktop\\Example", "java2.txt", "is a good language");

    }
}
