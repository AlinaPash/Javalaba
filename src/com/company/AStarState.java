package com.company;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ForkJoinWorkerThread;
/**
 * This class stores the basic state necessary for the A* algorithm to compute a
 * path across a map. This state includes a collection of "open waypoints" and
 * another collection of "closed waypoints." In addition, this class provides
 * the basic operations that the A* pathfinding algorithm needs to perform its
 * processing.
 **/
public class AStarState {

        /** This is a reference to the map that the A* algorithm is navigating. **/
        private Map2D map;

        private HashMap<Location, Waypoint> openWaypoints = new HashMap<>();
        private HashMap<Location, Waypoint> closeWaypoints = new HashMap<>();

        /**
         * Initialize a new state object for the A* pathfinding algorithm to use.
         **/
        public AStarState(Map2D map)
        {
            if (map == null)
                throw new NullPointerException("map cannot be null");

            this.map = map;
        }

        /** Returns the map that the A* pathfinder is navigating. **/
        public Map2D getMap()
        {
            return map;
        }

        /**
         * This method scans through all open waypoints, and returns the waypoint
         * with the minimum total cost. If there are no open waypoints, this method
         * returns <code>null</code>.
         **/
        public Waypoint getMinOpenWaypoint()//метод, который проверяет все вершины в наборе открытых вершин,
        // и после этого возвращает ссылку на вершину с наименьшей общей стоимостью

        {
            if (numOpenWaypoints() == 0) {
            // Если в "открытом" наборе нет вершин, функция возвращает NULL
                return null;
            }

            Waypoint minWaypoint = null;
            float min = Float.MAX_VALUE;

            for (Waypoint waypoint : openWaypoints.values()) {
                float cost = waypoint.getTotalCost();
                if (cost < min) {// сравнение стоимости с минимумом
                    min = cost;
                    minWaypoint = waypoint;
                }
            }
            return minWaypoint;//возвращает ссылку на вершину с наименьшей общей стоимостью
        }

        /**
         * This method adds a waypoint to (or potentially updates a waypoint already
         * in) the "open waypoints" collection. If there is not already an open
         * waypoint at the new waypoint's location then the new waypoint is simply
         * added to the collection. However, if there is already a waypoint at the
         * new waypoint's location, the new waypoint replaces the old one <em>only
         * if</em> the new waypoint's "previous cost" value is less than the current
         * waypoint's "previous cost" value.
         **/
        public boolean addOpenWaypoint(Waypoint newWP)//метод добавляет указанную вершину только в том
        // случае, если существующая вершина хуже новой
        {
            Waypoint openWP = openWaypoints.get(newWP.loc);
            if (openWP == null || newWP.getPreviousCost() < openWP.getPreviousCost()) {
            // Если в наборе "открытых вершин" в настоящее время нет вершины для данного местоположения,
            // или
            // если стоимость пути до новой вершины меньше стоимости пути до текущей
                openWaypoints.put(newWP.loc, newWP);//добавить новую вершину
                return true;//если новая вершина была успешно добавлена в набор
            }
            return false;
        }

        public int numOpenWaypoints()
        {//метод, который возвращает количество точек в наборе "открытых вершин"
            return openWaypoints.size();
        }

        public void closeWaypoint(Location loc)//метод, который перемещает вершину из набора"открытых вершин" в набор"закрытых вершин"
        {
            Waypoint waypoint = openWaypoints.remove(loc);//удаляет вершину, соответствующую указанному местоположению
            //из набора "открытых вершин"
            if (openWaypoints != null) {//если "открытая вершина" существует
                closeWaypoints.put(loc, waypoint);//добавляет удалённую вершину в набор "закрытых вершин"
            }
        }

        public boolean isLocationClosed(Location loc)//метод, проверяющий указанное местоположение,
        // встречается ли оно в наборе "закрытых вершин"
        {
            return closeWaypoints.containsKey(loc);//указанное местоположение, встречается в наборе "закрытых вершин"
        }
}

