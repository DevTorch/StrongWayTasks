package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Task2 {
    private static final int FLATS_ON_THE_FLOOR = 4;

    public static void main(String[] args) {

        System.out.println(getFlatLocation(10, 3, 40));
        System.out.println(getFlatLocation(-10, -3, 40));
        System.out.println(getFlatLocation(10, 3, 121));
    }

    static int getFloor(int floorAmount, int flatNumber) {

        int setFloor = floorAmount;
        int maxFlat = getEntrance(floorAmount, flatNumber) * floorAmount * FLATS_ON_THE_FLOOR;

        while (maxFlat - 3 > flatNumber) {
            setFloor = setFloor - 1;
            maxFlat = maxFlat - FLATS_ON_THE_FLOOR;
        }
        return setFloor;
    }

    static int getEntrance(int floorAmount, int flatNumber) {
        int setEntrance = 1;

        while ((setEntrance * floorAmount * FLATS_ON_THE_FLOOR) < flatNumber) {
            setEntrance++;
        }
        return setEntrance;
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {

        if (floorAmount <= 0 || entranceAmount <= 0 || flatNumber <= 0) return "Такой квартиры не существует";

        int totalFlatQty = floorAmount * FLATS_ON_THE_FLOOR * entranceAmount;

        if (flatNumber > totalFlatQty || flatNumber <= 0) {
            return "Такой квартиры не существует";
        }
        String leftOrRight = "";
        switch (flatNumber % FLATS_ON_THE_FLOOR) {
            case 1 -> leftOrRight = ", слева от лифта, влево";
            case 2 -> leftOrRight = ", слева от лифта, вправо";
            case 3 -> leftOrRight = ", справа от лифта, влево";
            case 0 -> leftOrRight = ", справа от лифта, вправо";
        }

        return flatNumber + " кв - " + getEntrance(floorAmount, flatNumber) + " подъезд, "
                + getFloor(floorAmount, flatNumber) + " этаж" + leftOrRight;
    }
}