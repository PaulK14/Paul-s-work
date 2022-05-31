import java.util.HashMap;

public class Cipher {

        String alphabit = "abcdefghijklmnopqrstuvwxyz";
        String[] alphaArray = alphabit.split("");
        int shift;
        HashMap<String, String> encrypt;
        HashMap<String, String> decrypt;

        public Cipher(int shift) {
                encrypt = new HashMap<>();
                decrypt = new HashMap<>();
                this.shift = shift;
                for (int i = 0; i < 26; i++) {
                        int index = (i + shift) % 26;
                        encrypt.put(alphaArray[i], alphaArray[index]);
                }
                for (int i = 0; i < 26; i++) {
                        decrypt.put(encrypt.get(alphaArray[i]), alphaArray[i]);
                }
        }

        public String encrypt(String message) {
                String builder = "";
                if (message.indexOf(" ") > 0) {
                        builder = "error0";
                } else {
                        for (int i = 0; i < message.length(); i++) {
                                builder += encrypt.get(message.substring(i, i + 1));
                        }

                }
                return builder;
        }

        public String decrypt(String message) {
                String builder = "";
                for (int i = 0; i < message.length(); i++) {
                        builder += decrypt.get(message.substring(i, i + 1));
                }
                return builder;
        }

}



