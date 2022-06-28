package com.company.boots.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.lang.annotation.Inherited;

import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

import com.company.boots.enums.BootType;

@Entity
@Table(name = "BOOTS")
public class Boot {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "TYPE")
    @Enumerated(EnumType.STRING)
    private BootType type;

    @Column(name = "SIZE")
    private Float size;

    @Column(name = "QUANTITY")
    private Integer quantity;

    @Column(name = "MATERIAL")
    private String material;

    // getter and setter methods for ID
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // getter and setter methods for TYPE
    public BootType getType() {
        return this.type;
    }

    public void setType(BootType type) {
        this.type = type;
    }

    // getter and setter methods for SIZE
    public Float getSize() {
        return this.size;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    // getter and setter methods for QUANTITY
    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    // getter and setter methods for MATERIAL
    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
