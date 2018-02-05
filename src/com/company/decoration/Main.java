package com.company.decoration;

public class Main extends A{
    public static void main(String[] args) {
        Main.a();
        A.a();
    }
}
class A {
    public static void a(){
        System.out.println("ab");
    }
}