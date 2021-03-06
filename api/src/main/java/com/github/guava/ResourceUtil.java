package com.github.guava;

import com.google.common.base.Charsets;
import com.google.common.io.LineProcessor;
import com.google.common.io.Resources;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * @author hangs.zhang
 * @date 2018/6/13
 * *********************
 * function: 读取项目资源的工具类
 */
public class ResourceUtil {

    /**
     * 获取URL
     */
    public static URL getResource(String path) {
        return Thread.currentThread().getContextClassLoader().getResource(path);
    }

    /**
     * 遍历文件的每一行数据
     */
    @SuppressWarnings("all")
    public static void readLine(URL resource) {
        try {
            Resources.readLines(resource, StandardCharsets.UTF_8, new LineProcessor<Object>() {
                @Override
                public boolean processLine(String line) throws IOException {
                    System.out.println(line);
                    // 是否继续读取下一行
                    return true;
                }

                @Override
                public Object getResult() {
                    // 结果集
                    return null;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
