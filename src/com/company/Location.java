package com.company;
import java.util.Objects;
public class Location {//класс представляет определенное Location на 2D-карте, координаты - это целочисленные значения
    public int xCoord;//координата х этого местоположения
    public int yCoord;//координата y этого местоположения
    public Location(int x, int y)//создаёт новое местоположение с указанными целочисленными координатами
    {
        xCoord = x;
        yCoord = y;
    }
    public Location()//создаёт новое местоположение с координатами (0, 0)
    {this(0, 0);}
    @Override//переопределение метода
    public boolean equals(Object obj) {//метод сравнение классов
        if (obj == this)//нулевая точка
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Location location = (Location) obj;
        return xCoord == location.xCoord && yCoord == location.yCoord;
    }
    @Override//переопределение метода
    public int hashCode() {//хеш-код
        int result = 5; // Простое число
        result = 7 * result + xCoord;// используется другое простое число для перемножения
        result = 7 * result + yCoord;
        return result;
    }
}
