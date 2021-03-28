package com.cheekin;

public class Main {

    public static void main(String[] args) {

        Triangle1 Equilateral = new Triangle1();
        System.out.println("Name of triangle: " + Equilateral.Name);
        System.out.println("Internal angel: " + Equilateral.InternalAngles);
        System.out.println("Lenght: " + Equilateral.Length);
        System.out.println("Other: " + Equilateral.Other);
        System.out.println();

        Triangle2 Isosceles = new Triangle2();
        System.out.println("Name of triangle: " + Isosceles.Name);
        System.out.println("Internal angel: " + Isosceles.InternalAngles);
        System.out.println("Lenght: " + Isosceles.Length);
        System.out.println("Other: " + Isosceles.Other);
        System.out.println();

        Triangle3 Scalene = new Triangle3();
        System.out.println("Name of triangle: " + Scalene.Name);
        System.out.println("Internal angel: " + Scalene.InternalAngles);
        System.out.println("Lenght: " + Scalene.Length);
        System.out.println("Other: " + Scalene.Other);
    }
}
