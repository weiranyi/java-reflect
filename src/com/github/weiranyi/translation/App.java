package com.github.weiranyi.translation;

import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class App {
    public static void say() {
        Properties properties = new Properties();
        // 获取详细路径
        String configPath = App.class.getResource("/config.properties").getPath();
        try {
            // 不包括特殊字符
            configPath = new URLDecoder().decode(configPath, "UTF-8");
            properties.load(new FileInputStream(configPath));
            String language = properties.getProperty("language");
            Weiran weiran = (Weiran) Class.forName(language).newInstance();
            System.out.println(weiran.say());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        App.say();
    }
}
