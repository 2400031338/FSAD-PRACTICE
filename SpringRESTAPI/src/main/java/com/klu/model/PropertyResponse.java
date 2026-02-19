package com.klu.model;

public class PropertyResponse {

    private String location;
    private int rooms;
    private int age;
    private String suggestions;

    public PropertyResponse(String location, int rooms, int age, String suggestions) {
        this.location = location;
        this.rooms = rooms;
        this.age = age;
        this.suggestions = suggestions;
    }

    public String getLocation() {
        return location;
    }

    public int getRooms() {
        return rooms;
    }

    public int getAge() {
        return age;
    }

    public String getSuggestions() {
        return suggestions;
    }
}
