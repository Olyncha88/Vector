package com.company;

import java.util.Random;

public class Vector2D {
    private double x, y;
    private static final String INFO = "Это вектор для двумерной системы координат.";

    public Vector2D(double x, double y) { // конструктор
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double getLength(){ // определение длины  вектора
        double result = Math.sqrt((x*x)+(y*y));
        return result;
    }
    public double getScalar(Vector2D a, Vector2D b){ // // скалярное * двух векторов
        double result = a.getX() * b.getX() + a.getY() * b.getY();
        return result;
    }
    public void getSum(Vector2D a, Vector2D b) { // сложение двух векторов
        Vector2D c = new Vector2D(a.getX() + b.getX(), a.getY() + b.getY()); // создание new вектора
        c.printInfo();
    }

    public void getDif(Vector2D a, Vector2D b){ // разность двух векторов
        Vector2D d = new Vector2D(a.getX() - b.getX(), a.getY() - b.getY()); // создание new вектора
        d.printInfo();
    }

    public void compare(Vector2D a, Vector2D b) {
        if (a.getLength() == b.getLength()) { // сравнение векторов
            System.out.println("Вектор a = b");
        } else if (a.getLength() > b.getLength()) {
            System.out.println("Вектор a > b");
        } else {
            System.out.println("Вектор a < b");
        }
    }

    public void printInfo(){
        System.out.println(INFO + " Его координаты " + "(" + getX() + " , " + getY() + ")");
    }
    public static Vector2D[] returnsVectors(int n) {
        Random random = new Random();
        Vector2D[] vectorN = new Vector2D[n];
        for (int i = 0; i < n; i++) {
            vectorN[i] = new Vector2D(random.nextInt(), random.nextInt());
        }
        return vectorN;
        }
}


