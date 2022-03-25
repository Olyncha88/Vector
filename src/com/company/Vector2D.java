package com.company;

import java.util.Random;

public class Vector2D {
    private double x, y;
    private static final String INFO = "Это вектор для двумерной системы координат.";

    public Vector2D(double x, double y) { // конструктор
        this.x = x;
        this.y = y;
    }

    public Vector2D() {
        this.x = 0;
        this.y = 0;
    }

    public double getLength(){ // определение длины  вектора
        double result = Math.sqrt((x*x)+(y*y));
        return result;
    }
    public double getScalar(Vector2D vector2D){ // // скалярное * двух векторов
        return x * vector2D.getX() + y * vector2D.getY();
    }
    public Vector2D getSum(Vector2D vector2D) { // сложение двух векторов
        return new Vector2D(x + vector2D.getX(), y + vector2D.getY()); // создание new вектора
    }

    public Vector2D getDif(Vector2D vector2D){ // разность двух векторов
        return new Vector2D(x - vector2D.getX(), y - vector2D.getY()); // создание new вектора
    }

    public int compare(Vector2D vector2D) {
        return (int) (this.getLength() - vector2D.getLength());
    }

    public java.lang.String toString() {
        return INFO + ": Vector2D (" +
                x + "," + y +')';
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

    public static Vector2D[] returnsVectors(int n) {
        Random random = new Random();
        Vector2D[] vectorN = new Vector2D[n];
        for (int i = 0; i < n; i++) {
            vectorN[i] = new Vector2D(random.nextInt(), random.nextInt());
        }
        return vectorN;
        }
}


