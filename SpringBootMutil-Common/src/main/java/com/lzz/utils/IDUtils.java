package com.lzz.utils;

import java.util.UUID;

/**
 * Author lzz
 * Date   2018/5/23
 */
public class IDUtils {

    public static String uuid() {
        return UUID.randomUUID().toString().
                replace("-", "").toUpperCase();
    }
}
