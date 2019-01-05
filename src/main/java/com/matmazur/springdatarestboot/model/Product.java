package com.matmazur.springdatarestboot.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Objects;

@Entity
@XmlRootElement
public class Product implements Serializable {
    private static final long serialVersionUID = 656787675743L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    @ManyToOne
    private Producer producer;

    public Product(String name, double price, Producer producer) {
        this.name = name;
        this.price = price;
        this.producer = producer;
    }

    public Product() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(id, product.id) &&
                Objects.equals(name, product.name) &&
                Objects.equals(producer, product.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, producer);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", producer=" + producer +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }
}

