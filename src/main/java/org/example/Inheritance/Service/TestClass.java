package org.example.Inheritance.Service;

public class TestClass {
    public static void main(String[] args) {
        HelloWorldService helloWorldService = new HelloWorldService();
      String result=  helloWorldService.sayHi();
        System.out.println(result);
        ChanduHelloWorldService  chanduHelloWorldService = new ChanduHelloWorldService();
        String name = chanduHelloWorldService.sayHi();
        System.out.println(name);
    }
}
