package Metodos;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
public class EncriptarPassword {
    public static String getHash(String pass) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = messageDigest.digest(pass.getBytes());
            String base64Hash = Base64.getEncoder().encodeToString(hashBytes);
            return base64Hash;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}