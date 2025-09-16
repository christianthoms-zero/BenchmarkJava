package org.owasp.benchmark;

import javax.net.ssl.SSLContext;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class Foo {
    public void getSSLContext() throws NoSuchAlgorithmException {
        SSLContext.getInstance("TLSv1.1");
        javax.crypto.SecretKey key = javax.crypto.KeyGenerator.getInstance("DES").generateKey();
    }
    public static byte[] getRandBytes() {
        Random random = new Random();
        byte[] randomBytes = new byte[16];
        random.nextBytes(randomBytes);
        return randomBytes;
    }
    public SSLContext getSSLContext2() throws NoSuchAlgorithmException {
        return SSLContext.getInstance("TLSv1.1");
    }
}
