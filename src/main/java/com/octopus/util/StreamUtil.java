package com.octopus.util;

import java.io.IOException;
import java.io.InputStream;

/**
 * @FileName: StreamUtil
 * @Author: yeyang
 * @Date: 2020/1/16 15:39
 */
public class StreamUtil {
    public static String readStream(InputStream stream) throws IOException {
        byte[] buff = new byte[1024];
        int len = 0;
        StringBuffer stringBuffer = new StringBuffer();
        while ((len = stream.read(buff)) > 0){
            stringBuffer.append(new String(buff,0,len));
        }
        return stringBuffer.toString();
    }
}
