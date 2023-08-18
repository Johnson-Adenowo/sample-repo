package org.interswitch;
public class Calculator {
    int a,b;
    public Calculator() {
    }
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public int add(int a, int b){
        int result;
        this.a = a;
        this.b = b;
        result =  a+b;
        System.out.println(result);
        return result;
    }
    public int sub(int a, int b){
        int result;
        this.a = a;
        this.b = b;
        result =  a-b;
        System.out.println(result);
        return result;
    }
    public int div(int a, int b){
        int result;
        this.a = a;
        this.b = b;
        result =  a/b;
        System.out.println(result);
        return result;
    }
    public int mult(int a, int b){
        int result;
        this.a = a;
        this.b = b;
        result =  a*b;
        System.out.println(result);
        return result;
    }

}
