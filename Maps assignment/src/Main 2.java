import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Cipher cipher = new Cipher(2);
        String encrypted = cipher.encrypt("test");
        System.out.println(encrypted);
        String decrypted = cipher.decrypt(encrypted);
        System.out.println(decrypted);
    }
}
