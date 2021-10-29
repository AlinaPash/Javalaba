package com.company;
public class Point2d {
 /** координата X **/
    private double xCoord;
/** координата Y **/
    private double yCoord;
//** Конструктор инициализации **/
    public Point2d ( double x, double y) {
        xCoord = x;
        yCoord = y;
    }
/** Конструктор по умолчанию. **/
    public Point2d () {
//Вызовите конструктор с двумя параметрами и определите источник.
        this(0, 0);
    }

/** Установка значения координаты X. **/
    public void setxCoord ( double xCoord) {
        this.xCoord = xCoord;
    }
/** Установка значения координаты Y. **/
    public void setyCoord ( double yCoord) {
        this.yCoord = yCoord;
    }
    /** Возвращение координаты X **/
        public double getxCoord() {
            return xCoord;
        }
        /** Возвращение координаты Y **/
        public double getyCoord () {
            return yCoord;
        }
}
