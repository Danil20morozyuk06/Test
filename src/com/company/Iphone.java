package com.company;

public class Iphone extends Phone{
    @Override
    public void call(){
        System.out.println("звонят с айфона");
    }
    @Override
    public void recaiveCall(){
        System.out.println("звонят на айфон");
    }
}
