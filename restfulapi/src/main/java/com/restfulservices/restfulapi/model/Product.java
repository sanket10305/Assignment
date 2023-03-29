package com.restfulservices.restfulapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Product {
    private String name;
    @Id
    private String id;
    private String language;
    private String framework;

    public Product(String name, String id, String language, String framework) {
        this.name = name;
        this.id = id;
        this.language = language;
        this.framework = framework;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getLanguage() {
        return language;
    }

    public String getFramework() {
        return framework;
    }

}

