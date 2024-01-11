package com.spring.pojoClass;

public class Engine {

    private int engNo;
    private String engType;

    //setter dependency injection
    public void setEngNo(int engNo) {
        this.engNo = engNo;
    }

    public void setEngType(String engType) {
        this.engType = engType;
    }

    @Override
    public String toString() {

        return +engNo + "," +engType;
    }

    //constructor dependency injection
    public Engine(int engNo, String engType) {
        this.engNo = engNo;
        this.engType = engType;
    }
}
