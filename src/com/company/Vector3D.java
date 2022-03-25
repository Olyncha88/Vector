package com.company;

import java.util.Random;

public class Vector3D {
    private double x, y, z;
    private static final String INFO = "Это вектор для трехмерной системы координат.";

    public Vector3D(double x, double y, double z) { // конструктор
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public double getLength() { // определение длины  вектора
        double result = Math.sqrt((x * x) + (y * y) + (z * z));
        return result;
    }

    public double getScalar(Vector3D vector3D) { // // скалярное * двух векторов
        return x * vector3D.getX() + y * vector3D.getY() + z * vector3D.getZ();
    }

    public Vector3D getSum(Vector3D vector3D) { // сложение двух векторов
        return new Vector3D(x + vector3D.getX(), y + vector3D.getY(), z + vector3D.getZ());
    }

    public Vector3D getDif(Vector3D vector3D) { // разность двух векторов
        return new Vector3D(x + vector3D.getX(), y + vector3D.getY(), z + vector3D.getZ());
    }

    public int compare(Vector3D vector3D) {
        return (int) (this.getLength() - vector3D.getLength());
    }


    public java.lang.String toString() {
        return INFO + ": Vector3D (" +
                x + "," + y + "," + z +')';

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

    public static Vector3D[] returnsVectors(int n) {
        Random random = new Random();
        Vector3D[] vectorN = new Vector3D[n];
        for (int i = 0; i < n; i++) {
            vectorN[i] = new Vector3D(random.nextInt(), random.nextInt(), random.nextInt());
        }
        return vectorN;
    }
}
