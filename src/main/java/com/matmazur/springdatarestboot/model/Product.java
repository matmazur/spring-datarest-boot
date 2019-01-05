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
    @Column(name = "id_product")
    private Long id;
    private String name;
    private double price;
    private int quantity;
    @ManyToOne
    private Producer producer;


    public Product() {
    }

    public Product(String name, double price, int quantity, Producer producer) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.producer = producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                quantity == product.quantity &&
                Objects.equals(id, product.id) &&
                Objects.equals(name, product.name) &&
                Objects.equals(producer, product.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, quantity, producer);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }
}
