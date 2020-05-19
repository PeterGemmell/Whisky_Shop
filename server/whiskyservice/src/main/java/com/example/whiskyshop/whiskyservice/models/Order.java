package com.example.whiskyshop.whiskyservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="date")
    private LocalDate date;

    @Column(name="is_completed")
    private String isCompleted;

    @JsonIgnoreProperties(value="orders")
    @ManyToOne
    @JoinColumn(name= "customer_id", nullable = false)
    private Customer customer;

    @ManyToMany
    @JoinTable(
            name = "orders_whiskies",
            joinColumns = {@JoinColumn(name="order_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name="whisky_id", nullable = false, updatable = false)}
    )

    private List<Whisky> whiskies;


    public Order(Customer customer, String isCompleted){
        this.date = LocalDate.now();
        this.customer = customer;
        this.isCompleted = isCompleted;
        this.whiskies = new ArrayList<>();
    }

    public Order(){

    }

    public void addWhisky(Whisky whisky){
        this.whiskies.add(whisky);
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(String isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Whisky> getWhiskies() {
        return whiskies;
    }

    public void setWhiskies(List<Whisky> whiskies) {
        this.whiskies = whiskies;
    }
}
