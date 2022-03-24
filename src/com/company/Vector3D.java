package com.company;

public class Vector3D {
    private double x, y, z;
    private static final String INFO = "Это вектор для трехмерной системы координат.";

    public Vector3D(double x, double y, double z) { // конструктор
        this.x = x;
        this.y = y;
        this.z = z;
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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getLength() { // определение длины  вектора
        double result = Math.sqrt((x * x) + (y * y) + (z * z));
        return result;
    }

    public double getScalar(Vector3D e, Vector3D f) { // // скалярное * двух векторов
        double result = e.getX() * e.getX() * e.getZ() + f.getY() * f.getY() * f.getZ();
        return result;
    }

    public void getSum(Vector3D e, Vector3D f) { // сложение двух векторов
        Vector3D g = new Vector3D(e.getX() + f.getX(), e.getY() + f.getY(), e.getZ() + f.getZ()); // создание new вектора
        g.printInfo();
    }

    public void getDif(Vector3D e, Vector3D f) { // разность двух векторов
        Vector3D h = new Vector3D(e.getX() - f.getX(), e.getY() - f.getY(), e.getZ() - f.getZ()); // создание new вектора
        h.printInfo();
    }

    public void compare(Vector3D e, Vector3D f) {
        if (e.getLength() == f.getLength()) { // сравнение векторов
            System.out.println("Вектор e = f");
        } else if (e.getLength() > f.getLength()) {
            System.out.println("Вектор e > f");
        } else {
            System.out.println("Вектор e < f");
        }
    }

    public void printInfo() {
        System.out.println(INFO + " Его координаты " + "(" + getX() + " , " + getY() + " , " + getZ() + ")");
    }
}
