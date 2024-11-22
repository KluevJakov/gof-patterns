package ru.jafix.creational.singleton;

public class DbConnection {
    private static DbConnection instance;
    private String url;

    private DbConnection() {}

    public static DbConnection getInstance() {
        if (instance == null) {
            instance = new DbConnection();
        }
        return instance;
    }

    public void createTable() {
        System.out.println("СОЗДАТЬ ТАБИЛЦУ");
    }

    public void insertData() {
        System.out.println("ВСТАВИТЬ ДАННЫЕ");
    }
}
