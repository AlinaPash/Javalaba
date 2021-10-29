package com.company;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.*;
public class Point3d {//объект с тремя значениями с плавающей точкой
    private double x;
    private double y;
    private double z;
    public Point3d() //нулевая точка
    {
        x = y = z = 0.0;
    }
    public Point3d(double x, double y, double z) {//возможность получения всех 3 значений по отдельности
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void setX(double x) { this.x = x; }//возможность изменять все 3 значения по отдельности
    public void setY(double y) {
        this.y = y;
    }
    public void setZ(double z) {
        this.z = z;
    }
    public boolean isEqual(Point3d p) {// сравнение точек (на идентичность)
        if (this.x == p.getX()) {
            if (this.y == p.getY()) {
                if (this.z == p.getZ()) {
                    return true;
                }
            }
        }
        return false;
    }
    public double getX() {
        return x;
    }//возврат значений
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }
    public double distanceTo(Point3d p) {//расстояние между двумя точками
        return sqrt(pow(p.getX() - this.x, 2) + pow(p.getY() - this.y, 2) + pow(p.getZ() - this.z, 2));
    }
}