package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Vector2D a = new Vector2D(3, 5);
        Vector2D b = new Vector2D(4, 6);
        Vector3D e = new Vector3D(5, 6, 7);
        Vector3D f = new Vector3D(6, 7, 8);

        System.out.println("Length a = " + a.getLength());  // получ длину
        System.out.println("Length e = " + e.getLength());  // получ длину
        System.out.println("Scalar* ab = " + a.getScalar(b)); // получ скалярн*
        System.out.println("Scalar* ef = " + e.getScalar(f)); // получ скалярн*
        System.out.println("Sum = " + a.getSum(b)); // получ сумму веторов
        System.out.println("Sum = " + e.getSum(f)); // получ сумму веторов
        System.out.println("Diff = " + a.getDif(b)); // получ разность векторов
        System.out.println("Diff = " + e.getDif(f)); // получ разность векторов
        System.out.println("Compar = " + a.compare(b)); // сравнение
        System.out.println("Compar = " + e.compare(f)); // сравнение
        System.out.println(Arrays.toString(Vector2D.returnsVectors(5)));
        System.out.println(Arrays.toString(Vector3D.returnsVectors(4)));
    }
}





