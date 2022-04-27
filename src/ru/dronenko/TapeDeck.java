package ru.dronenko;

import java.util.Objects;

public class TapeDeck {
    public  int x;
    public  String y;
    public String z;


    public TapeDeck ()
    {
        System.out.println("xx");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TapeDeck tapeDeck = (TapeDeck) o;
        return x == tapeDeck.x && y.equals(tapeDeck.y) && z.equals(tapeDeck.z);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
