
import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
// Write your code below.
//

class EncryptDecryptFile {
    public void writeDecryptionFile(String message) {
        try {
            FileWriter myWriter = new FileWriter("DecryptionFile.txt");
            myWriter.write(message);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public String readEncryptionFile() {
        StringBuffer sb = new StringBuffer();
        try {
            File myObj = new File("EncryptionFile.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                sb.append(myReader.nextLine());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return sb.toString();
    }

    void writeDecryptionfile(String message) {

    }

}

public class FileLife {
    public static String filepath = System.getenv("OUTPUT_PATH").substring(0,
            System.getenv("OUTPUT_PATH").lastIndexOf("\\") + 1);

    private static String generateString() {
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
        StringBuilder generatedString = new StringBuilder(20);
        Random random = new Random();
        for (int i = 0; i < 40; i++) {
            char c = chars[random.nextInt(chars.length)];
            generatedString.append(c);
        }
        return generatedString.toString();
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();

        try {
            EncryptDecryptFile f = new EncryptDecryptFile();

            String encryptFilename = FileLife.filepath + "EncryptionFile.txt";
            String generatedString = generateString();
            BufferedWriter writer = new BufferedWriter(new FileWriter(encryptFilename));
            writer.write(generatedString);
            writer.close();

            if (f.readEncryptionFile().equals(generatedString)) {
                f.writeDecryptionFile(message);

                String decryptFilename = FileLife.filepath + "DecryptionFile.txt";
                BufferedReader reader = new BufferedReader(new FileReader(decryptFilename));
                String messageFromFile = reader.readLine();
                reader.close();

                System.out.println(messageFromFile);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

}