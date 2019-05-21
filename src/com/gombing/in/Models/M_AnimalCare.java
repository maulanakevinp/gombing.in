/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Models;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author MaulanaKevinPradana
 */
public class M_AnimalCare {

    private int id, id_animal, id_user;
    private double weight, body_length, chest_size, height;
    private String comment, animal_name, animal_owner;
    private Timestamp timestamp;

    public M_AnimalCare() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_animal() {
        return id_animal;
    }

    public void setId_animal(int id_animal) {
        this.id_animal = id_animal;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBody_length() {
        return body_length;
    }

    public void setBody_length(double body_length) {
        this.body_length = body_length;
    }

    public double getChest_size() {
        return chest_size;
    }

    public void setChest_size(double chest_size) {
        this.chest_size = chest_size;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAnimal_name() {
        return animal_name;
    }

    public void setAnimal_name(String animal_name) {
        this.animal_name = animal_name;
    }

    public String getAnimal_owner() {
        return animal_owner;
    }

    public void setAnimal_owner(String animal_owner) {
        this.animal_owner = animal_owner;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
    
    public Timestamp getTimestamp1() {
        Date date = new Date();
        timestamp = new Timestamp(date.getYear(), date.getMonth(), date.getDate(), date.getHours(), date.getMinutes(), date.getSeconds(), date.getTimezoneOffset());
        return timestamp;
    }
    
}
