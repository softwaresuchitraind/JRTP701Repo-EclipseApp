package com.sukla.Main;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("DEV code");
        System.out.println("DEV code123");
    }

    public String reverse(String name)
    {
    	StringBuffer sb = new StringBuffer(name);
    	return sb.reverse().toString();
    }

    public int  findNameLength()
    {
    	System.out.println("App.findNameLength()");
    	return 1;
    }


}
