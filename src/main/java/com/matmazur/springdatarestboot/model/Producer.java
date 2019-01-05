package com.matmazur.springdatarestboot.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Producer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_producer")
    private Long id;
    private String name;
    private String country;
    @OneToMany(mappedBy = "producer")
    private List<Product> products;

    public Producer(String name, String country, List<Product> products) {
        this.name = name;
        this.country = country;
        this.products = products;
    }

    public Producer() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producer producer = (Producer) o;
        return Objects.equals(id, producer.id) &&
                Objects.equals(name, producer.name) &&
                Objects.equals(country, producer.country) &&
                Objects.equals(products, producer.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, country, products);
    }

    @Override
    public String toString() {
        return "Producer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", products=" + products +
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
