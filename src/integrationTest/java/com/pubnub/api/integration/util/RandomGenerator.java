package com.pubnub.api.integration.util;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {

    private static final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String newValue(int length) {
        final Random random = new SecureRandom();
        if (length <= 0) {
            throw new IllegalArgumentException("String length must be a positive integer");
        }

        final StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }

        return sb.toString();
    }

    public static String emoji() {
        final Random random = new SecureRandom();
        final List<String> emojiSet = new ArrayList<>();
        emojiSet.add("๐");
        emojiSet.add("๐");
        emojiSet.add("๐");
        emojiSet.add("๐คฃ");
        emojiSet.add("๐");
        emojiSet.add("๐");
        emojiSet.add("๐");
        emojiSet.add("๐");
        emojiSet.add("๐");
        emojiSet.add("๐");
        emojiSet.add("๐");
        emojiSet.add("๐");
        emojiSet.add("๐");
        emojiSet.add("๐");
        emojiSet.add("๐ฅฐ");
        emojiSet.add("๐");
        emojiSet.add("๐");
        emojiSet.add("๐");
        emojiSet.add("โบ๏ธ");
        emojiSet.add("๐");
        emojiSet.add("๐ค");
        emojiSet.add("๐คฉ");
        emojiSet.add("๐ค");
        emojiSet.add("๐คจ");
        emojiSet.add("๐");
        emojiSet.add("๐");
        emojiSet.add("๐ถ");
        emojiSet.add("๐");
        emojiSet.add("๐");
        emojiSet.add("๐ฃ");
        emojiSet.add("๐ฅ");
        emojiSet.add("๐ฎ");
        emojiSet.add("๐ค");
        emojiSet.add("๐ฏ");
        emojiSet.add("๐ช");
        emojiSet.add("๐ซ");
        emojiSet.add("๐ด");
        emojiSet.add("๐");
        emojiSet.add("๐");
        emojiSet.add("๐");
        emojiSet.add("๐");
        emojiSet.add("๐คค");
        emojiSet.add("๐");
        emojiSet.add("๐");
        emojiSet.add("๐");
        emojiSet.add("๐");
        emojiSet.add("๐");
        emojiSet.add("๐ค");
        emojiSet.add("๐ฒ");
        emojiSet.add("โน๏ธ");
        emojiSet.add("๐");
        emojiSet.add("๐");
        emojiSet.add("๐");
        emojiSet.add("๐");
        emojiSet.add("๐ค");
        emojiSet.add("๐ข");
        emojiSet.add("๐ญ");
        emojiSet.add("๐ฆ");
        emojiSet.add("๐ง");
        emojiSet.add("๐จ");
        emojiSet.add("๐ฉ");
        emojiSet.add("๐คฏ");
        emojiSet.add("๐ฌ");
        emojiSet.add("๐ฐ");
        emojiSet.add("๐ฑ");
        emojiSet.add("๐ฅต");
        emojiSet.add("๐ฅถ");
        emojiSet.add("๐ณ");
        emojiSet.add("๐คช");
        emojiSet.add("๐ต");
        emojiSet.add("๐ก");
        emojiSet.add("๐?");
        emojiSet.add("๐คฌ");
        emojiSet.add("๐ท");
        emojiSet.add("๐ค");
        emojiSet.add("๐ค");
        emojiSet.add("๐คข");
        emojiSet.add("๐คฎ");
        emojiSet.add("๐คง");
        emojiSet.add("๐");
        emojiSet.add("๐ค?");
        emojiSet.add("๐คก");
        emojiSet.add("๐ฅณ");
        emojiSet.add("๐ฅด");
        emojiSet.add("๐ฅบ");
        emojiSet.add("๐คฅ");
        emojiSet.add("๐คซ");
        emojiSet.add("๐คญ");
        emojiSet.add("๐ง");
        emojiSet.add("๐ค");
        emojiSet.add("๐");
        emojiSet.add("๐ฟ");
        emojiSet.add("๐น");
        emojiSet.add("๐บ");
        emojiSet.add("๐");
        emojiSet.add("๐ป");
        emojiSet.add("๐ฝ");
        emojiSet.add("๐ค");
        emojiSet.add("๐ฉ");
        emojiSet.add("๐บ");
        emojiSet.add("๐ธ");
        emojiSet.add("๐น");
        emojiSet.add("๐ป");
        emojiSet.add("๐ผ");
        emojiSet.add("๐ฝ");
        emojiSet.add("๐");
        emojiSet.add("๐ฟ");
        emojiSet.add("๐พ");
        return emojiSet.get(random.nextInt(emojiSet.size())) + "";
    }

    public static String unicode(int length) {
        final String unicodeChars = "!?+-=";

        final Random random = new SecureRandom();

        if (length <= 0) {
            length = unicodeChars.length();
        }

        final StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(unicodeChars.charAt(random.nextInt(unicodeChars.length())));
        }

        return sb.toString();
    }

    public static String get() {
        return newValue(5).concat(unicode(5)).concat(newValue(5));
    }

    public static int randomNumber(int min, int max) {
        final Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
