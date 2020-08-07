package com.zhss.maven;

public class HelloWorld {

    private String name;
    private int gae;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGae() {
        return gae;
    }

    public void setGae(int gae) {
        this.gae = gae;
    }

    public static void main(String[] args) {
        System.out.println("hello world  !!!! ");

    }

    public String sayHello(String name) {
        return "hello, " + name;

    }


}
