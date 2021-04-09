package com.company;

public class Android extends Phone{
    @Override
    public void call(){
        System.out.println("Звонят с андроида");
    }
    @Override
    public void recaiveCall(){
        System.out.println("на андроид звонят");
    }
}
