package com.myblog2.demo.myblog;

public class SimpleTest {
    public static int simple() {
        System.out.println("Simple Test Class");
        int returnotp = SimpleTest.returnotp();
        return returnotp;
    }
    public static int returnotp(){
        System.out.println("Return Otp Class");
        return 12345;
    }
}
