package com.chap09;

import java.net.MalformedURLException;
import java.net.URL;

public class MalformedURLExceptionExample {
    public static void main(String[] args) {
        URL url = null;
        try {
            url = new URL("http://www.example.com");
            System.out.println("프로토콜 : "+url.getProtocol());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }
}
