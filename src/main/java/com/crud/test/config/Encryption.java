package com.crud.test.config;

import org.springframework.stereotype.Component;

import java.security.MessageDigest;

@Component("Encryption")
public class Encryption {

    public String md5(String string) throws Exception{
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(string.getBytes());

        byte byteData[] = md.digest();

        //convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }
}
