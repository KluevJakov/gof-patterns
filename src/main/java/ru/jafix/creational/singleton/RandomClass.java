package ru.jafix.creational.singleton;

public class RandomClass {
    public void rndMethod(){
        DbConnection.getInstance().insertData();
    }
}
