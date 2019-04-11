package org.umssdiplo.automationv01.core.utils;

public final class Machinery {
    private String name;
    private String description;
    private String stock;
    private String modelo;
    private String marca;
    private String type;
    private String image;
    private String category;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getStock() {
        return stock;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }

    public String getImage() {
        return image;
    }

    public Machinery(String name, String description, String stock, String modelo, String marca, String type, String image, String category) {
        this.name = name;
        this.description = description;
        this.stock = stock;
        this.modelo = modelo;
        this.marca = marca;
        this.type = type;
        this.category = category;
        this.image = image;
    }
}
