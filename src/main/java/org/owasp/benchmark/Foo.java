package org.owasp.benchmark;

import javax.net.ssl.SSLContext;
import java.security.NoSuchAlgorithmException;

public class Foo {
    public void getSSLContext() throws NoSuchAlgorithmException {
        SSLContext.getInstance("TLSv1.1");
        javax.crypto.SecretKey key = javax.crypto.KeyGenerator.getInstance("DES").generateKey();
    }
}
