/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Models;

import java.io.InputStream;
import java.util.Date;

/**
 *
 * @author MaulanaKevinPradana
 */
public class M_Animal {

    private int id, id_animal_type, id_user, id_type_pet;
    private String animal_name, gender, skin_color, ear_type, animal_owner, animal_type, type_pet, updated_at, created_at, birthdate1, path;
    private Date updated_at1, created_at1, birthdate;
    private InputStream fileFromDB;
    

    public M_Animal() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public InputStream getFileFromDB() {
        return fileFromDB;
    }

    public void setFileFromDB(InputStream fileFromDB) {
        this.fileFromDB = fileFromDB;
    }
    
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getId_animal_type() {
        return id_animal_type;
    }

    public void setId_animal_type(int id_animal_type) {
        this.id_animal_type = id_animal_type;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_type_pet() {
        return id_type_pet;
    }

    public void setId_type_pet(int id_type_pet) {
        this.id_type_pet = id_type_pet;
    }

    public String getAnimal_name() {
        return animal_name;
    }

    public void setAnimal_name(String animal_name) {
        this.animal_name = animal_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSkin_color() {
        return skin_color;
    }

    public void setSkin_color(String skin_color) {
        this.skin_color = skin_color;
    }

    public String getEar_type() {
        return ear_type;
    }

    public void setEar_type(String ear_type) {
        this.ear_type = ear_type;
    }

    public String getAnimal_owner() {
        return animal_owner;
    }

    public void setAnimal_owner(String animal_owner) {
        this.animal_owner = animal_owner;
    }

    public String getAnimal_type() {
        return animal_type;
    }

    public void setAnimal_type(String animal_type) {
        this.animal_type = animal_type;
    }

    public String getType_pet() {
        return type_pet;
    }

    public void setType_pet(String type_pet) {
        this.type_pet = type_pet;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getBirthdate1() {
        return birthdate1;
    }

    public void setBirthdate1(String birthdate1) {
        this.birthdate1 = birthdate1;
    }

    public Date getUpdated_at1() {
        Date date = new Date();
        return date;
    }

    public void setUpdated_at1(Date updated_at1) {
        this.updated_at1 = updated_at1;
    }

    public Date getCreated_at1() {
        Date date = new Date();
        return date;
    }

    public void setCreated_at1(Date created_at1) {
        this.created_at1 = created_at1;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
