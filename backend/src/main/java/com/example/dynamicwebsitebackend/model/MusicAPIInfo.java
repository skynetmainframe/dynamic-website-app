package com.example.dynamicwebsitebackend.model;

public class MusicAPIInfo {
    private String name;
    private String description;

    // RULE 1: A no-argument constructor is required for Jackson to create a new instance.
    // If you have any other constructors, you must explicitly add this one.
    public MusicAPIInfo() {
    }

    // A parameterized constructor is still useful for creating objects in your code.
    public MusicAPIInfo(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // RULE 2: Public getters are required for Jackson to read the property values.
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Public setters are not strictly required for serialization, but they are
    // needed if you ever need to deserialize a JSON request body into this object.
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
