package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Vector2D a = new Vector2D(3, 5);
        Vector2D b = new Vector2D(4, 6);
        Vector3D e = new Vector3D(5, 6, 7);
        Vector3D f = new Vector3D(6, 7, 8);

        a.printInfo();
        b.printInfo();

        System.out.println("Length a = " + a.getLength());  // получ длину вектора
        System.out.println("Length b = " + b.getLength());  // получ длину вектора
        System.out.println("Length e = " + e.getLength());  // получ длину вектора
        System.out.println("Length f = " + f.getLength());  // получ длину вектора

        System.out.println("Scalar* ab = " + a.getScalar(a, b)); // получ скалярн*
        System.out.println("Scalar* ef = " + e.getScalar(e, f)); // получ скалярн*

        a.getSum(a, b); // получ. new вектор при сложении a+b
        a.getDif(a, b); // получ. new вектор из разности a-b
        e.getSum(e, f); // получ. new вектор при сложении e+f
        f.getDif(e, f); // получ. new вектор из разности e-f

        a.compare(a, b); // сравнение длин векторов a, b
        e.compare(e, f); // сревнение длин векторов e, f
        System.out.println(Arrays.toString(Vector2D.returnsVectors(5)));
    }
}





