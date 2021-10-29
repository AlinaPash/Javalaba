package com.company;//public class Main { public static void main(String[] args) {// write your code here}}
public class Map2D
{
    private int width;//ширина карты
    private int height;//высота карты
    private int[][] cells;//данные карты, необходимые алгоритму поиска пути для навигации
    private Location start;//начальное местоположение для выполнения поиска пути A*
    private Location finish;//конечное местоположение для выполнения поиска пути A*
    public Map2D(int width, int height)//создаём новую 2D-карту с заданными шириной и высотой
    {
        if (width <= 0 || height <= 0)
        {
            throw new IllegalArgumentException("ширина и высота должны быть положительными значениями; получено "
                    + width + "x" + height);
        }
        this.width = width;
        this.height = height;
        cells = new int[width][height];//составляем некоторые координаты для начала и конца
        start = new Location(0, height / 2);
        finish = new Location(width - 1, height / 2);
    }
private void checkCoords(int x, int y) {//этот вспомогательный метод проверяет указанные координаты,
// чтобы увидеть,находятся ли они в пределах границ карты
//если координаты не находятся на карте, то метод создает исключение <code>IllegalArgumentException</code>
    if (x < 0 || x > width) {
        throw new IllegalArgumentException("x must be in range [0, " +
                width + "), got " + x);
    }
    if (y < 0 || y > height) {
        throw new IllegalArgumentException("y must be in range [0, " +
                height + "), got " + y);
    }
}
    public int getWidth()//возвращает ширину карты
    {return width;}
    public int getHeight()//возвращает высоту карты
    {return height;}
    public boolean contains(int x, int y)//возвращает true, если указанные координаты содержатся в области карты
    {return (x >= 0 && x < width && y >= 0 && y < height);}
    public boolean contains(Location loc)//возвращает true, если Location содержится в области карты
    {return contains(loc.xCoord, loc.yCoord);}
    public int getCellValue(int x, int y)//возвращает сохраненное значение стоимости для указанной ячейки
    {
        checkCoords(x, y);
        return cells[x][y];
    }
    public int getCellValue(Location loc)//возвращает сохраненное значение стоимости для указанной ячейки
    {return getCellValue(loc.xCoord, loc.yCoord);}
    public void setCellValue(int x, int y, int value)//задаёт значение стоимости для указанной ячейки
    {
        checkCoords(x, y);
        cells[x][y] = value;
    }
    public Location getStart()//возвращает начальное Location для карты,отсюда будет начинаться сгенерированный путь
    {return start;}
    public void setStart(Location loc)//задаёт начальное Location для карты,отсюда будет начинаться сгенерированный путь
    {
        if (loc == null)
            throw new NullPointerException("loc не может быть нулевой");
        start = loc;
    }
    public Location getFinish()//возвращает конечное Location для карты,здесь будет заканчиваться сгенерированный путь
    {return finish;}
    public void setFinish(Location loc)//задаёт конечное Location для карты,здесь будет заканчиваться сгенерированный путь
    {
        if (loc == null)
            throw new NullPointerException("loc не может быть нулевой");
        finish = loc;
    }
}