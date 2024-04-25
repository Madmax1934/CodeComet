package org.example.Misc;

import java.util.Map;

public final class Immutableclass {

    private final int id;
    private final String name;


    public Immutableclass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
