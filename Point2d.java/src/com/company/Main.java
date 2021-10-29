package com.company;
import static java.lang.Math.*;
public class Main {
        public static void main(String[] args) {
            Point3d p1 = new Point3d();//нулевая точка
            Point3d p2 = new Point3d(1,3,5);//точка с координатами (1,3,5)
            Point3d p3 = new Point3d(2,4,6);//точка с координатами (2,4,6)
            System.out.println("Площадь треугольника: " + computeArea(p1, p2, p3));
        }
        public static double computeArea(Point3d p1, Point3d p2, Point3d p3) {
            //метод, который  вычисляет площадь треугольника,
            if (p1.isEqual(p2) || p2.isEqual(p3) || p3.isEqual(p1)) {
                // Если одна из точек равна другой то площадь не вычисляется
                return -1;
            } else {
                double a = p1.distanceTo(p2);//расстояние между двумя точками
                double b = p2.distanceTo(p3);
                double c = p3.distanceTo(p1);
                double p = (a+b+c)/2; //периметр треугольника
                return (Math.sqrt(p*(p-a)*(p-b)*(p-c)));//площадь треугольника
            }
        }
    }
