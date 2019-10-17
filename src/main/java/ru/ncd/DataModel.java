package ru.ncd;

public class DataModel {

    private String number;

    private int a;

    private int b;

    private String result;

    DataModel(String number, int a, int b, String result) {
        this.number = number;
        this.a = a;
        this.b = b;
        this.result = result;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
