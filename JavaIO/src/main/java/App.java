import java.io.*;

public class App {
    public static void buildFileAndDirSchema(File file, int deep, PrintStream out) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                String DeepSpace = "";
                for (int j = 0; j < deep; j++){
                    DeepSpace += " | ";
                }
                out.println( DeepSpace + files[i].getAbsolutePath());
                if (files[i].isDirectory())
                    buildFileAndDirSchema(files[i], deep + 1, out);
            }
        }
    }

    public static void main(String[] args) {

        if (args.length == 0) return;

        File file;
        File output = new File("D:/3k1sem/Epam/output.txt");
        PrintStream ps;

        if (!output.exists()) {
            try {
                output.createNewFile();
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
                return;
            }
        }

        if (args != null) {
            file = new File(args[0]);
        } else {
            System.out.println("No File");
            return;
        }

        if (file.isDirectory()) {
            try {
                ps = new PrintStream(output);
                buildFileAndDirSchema(file, 0, ps);

            } catch (FileNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
                return;
            }
        }
        if (file.getName().endsWith(".txt")) {

            int numberOfDirectories = 0;
            int numberOfFiles = 0;
            int numberOfSymbols = 0;
            try {

                FileReader is = new FileReader(file.getAbsolutePath());
                File buf;
                StringBuilder sb = new StringBuilder();

                int c = 0;
                while ((c = is.read()) != -1) {
                    if (c == '\r') continue;
                    if (c == '\n') {
                        String rowFileString = sb.toString();
                        rowFileString = rowFileString.replaceAll("\\s\\|\\s","");
                        buf = new File(rowFileString);
                        if (buf.exists()) {
                            if (buf.isDirectory())
                                numberOfDirectories++;
                            if (buf.isFile())
                                numberOfFiles++;
                        }
                        sb.delete(0, sb.length());
                        continue;
                    }
                    sb.append((char) c);
                    numberOfSymbols++;
                }

            } catch (FileNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println("Files: " + numberOfFiles);
            System.out.println("Directories:" + numberOfDirectories);
            System.out.println("Average files number: " + (float) numberOfFiles / numberOfDirectories);
            System.out.println("Average length of files: " + (float) numberOfSymbols / numberOfFiles);
        }
    }
}
