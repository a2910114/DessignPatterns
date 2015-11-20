package com.mykhaylenko.dessign.simple;

import java.util.Comparator;

/**
 * Created by pavlo.mykhaylenko on 10/30/2015.
 */
public class Number implements Comparable{

    private String id;
    private boolean isMain;

    public Number(String id, boolean yes) {
        this.id = id;
        this.isMain = yes;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Number) {
            Number n = (Number) o;
            if (this.isMain == n.isMain()) {
                return 0;
            } else if (this.isMain && !n.isMain) {
                return -1;
            } else {
                return 1;
            }
        }
        return -1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isMain() {
        return isMain;
    }

    public void setIsMain(boolean isMain) {
        this.isMain = isMain;
    }
}
