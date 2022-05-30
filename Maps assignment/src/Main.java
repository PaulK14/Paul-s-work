import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String alphabit = "abcdefghijklmnopqrstuvwxyz";
        String[] alphaArray = alphabit.split("");
        int shift = 5;
        String Message = "pocket";
        HashMap<String, String> Encrypt = new HashMap<>();
        for(int i = 0; i < 26; i++) {
            int index = (i + shift) % 26;
            int index2 = (i - shift) % 26;
            Encrypt.put(alphaArray[index],alphaArray[index2]);
        }
        System.out.println("test");
    }
}
