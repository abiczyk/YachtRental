package com.javasda.YachtProject.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
public class StorageProperties {

    private String location = "C:\\Użytkownicy\\Andrzej\\IdeaProjects\\YachtProject\\src\\main\\webapp\\yachtPhoto";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}