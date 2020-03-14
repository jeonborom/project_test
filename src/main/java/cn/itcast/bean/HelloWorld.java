package cn.itcast.bean;

import java.io.FileInputStream;
import java.util.ArrayList;

/**
 * @author jiangbo
 * @create 2020-03-13 22:57
 */
public class HelloWorld {

    private static int age;
    private int num;

    public static void main(String[] args) {
        System.out.println("hello world!");
        //region Description
        String user = "jack";
        //endregion
        ArrayList list = new ArrayList();
        age = 10;
        System.out.println(user);
        System.out.println(age);
        //method();
    }

    public static void method() {
        int num = 10;
        try {
            FileInputStream fis = new FileInputStream("hello world!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
