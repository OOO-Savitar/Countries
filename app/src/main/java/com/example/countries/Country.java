package com.example.countries;

public class Country {
    private final String name;
    private final int flagId;

    public Country(String name, int flagId) {
        this.name = name;
        this.flagId = flagId;
    }

    public String getName() {
        return name;
    }

    public int getFlagId() {
        return flagId;
    }
}
