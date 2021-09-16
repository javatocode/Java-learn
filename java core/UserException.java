import java.util.Scanner;

class Encrypter extends Validator {

    static String encryptMessage(String name) throws InvalidMessageException {
        StringBuffer sb = new StringBuffer(name);
        if (Validator.validate(name)) {
            String j = sb.reverse().toString();
            String m = j.toLowerCase();
            return m;
        } else {
            throw new InvalidMessageException("Try again with valid message");
        }
    }
}

class InvalidMessageException extends Exception {

    InvalidMessageException(String message) {
        super(message);
    }

}

class Validator {
    public static boolean validate(String message) {
        return message.matches("[A-Za-z0-9 ]+");
    }
}

public class UserException {
    private static final Scanner INPUT_READER = new Scanner(System.in);

    public static void main(String[] args) {
        String message = INPUT_READER.nextLine();
        try {
            String encrypted_message = Encrypter.encryptMessage(message);
            if (!encrypted_message.startsWith("InvalidMessageException"))
                System.out.println(encrypted_message);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}