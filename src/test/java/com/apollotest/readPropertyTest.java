package com.apollotest;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import com.apollo.common.utils.propertyHandler;
/**
 * Created by rao on 16-4-6.
 */
public class readPropertyTest {
    public static void main(String[] args) {
        String text = propertyHandler.read("LinuxRoot");
        System.out.println(text);
    }

}