/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.DBUtils;

import com.gombing.in.Services.AnimalCareService;
import com.gombing.in.Services.AnimalService;
import com.gombing.in.Services.AnimalTypeService;
import com.gombing.in.Services.LevelService;
import com.gombing.in.Services.TypePetService;
import com.gombing.in.Services.UsersService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MaulanaKevinPradana
 */
public class config {

    private Connection con;
    private final UsersService user;
    private final AnimalService animal;
    private final AnimalCareService animalCare;
    private final AnimalTypeService animalType;
    private final TypePetService typePet;
    private final LevelService level;

    public config() {
        this.user = new UsersService();
        this.animal = new AnimalService();
        this.animalCare = new AnimalCareService();
        this.animalType = new AnimalTypeService();
        this.typePet = new TypePetService();
        this.level = new LevelService();
    }

    public Connection getConnection() {
        try {
            if (con == null || con.isClosed()) {
                String database = "d9ek16mludg78a";
                String username = "ttmzwvmtinzjlp";
                String password = "03d8bbf4fe174f1f3eb76ed041fc241cf90e4d1d9b158f49169c8e4295042f41";
                String url = "jdbc:postgresql://ec2-23-23-92-204.compute-1.amazonaws.com:5432/" + database + "?sslmode=require";
                try {
                    con = (Connection) DriverManager.getConnection(url, username, password);
                    System.out.println("Connection Successful");
                } catch (SQLException e) {
                    System.out.println("Connection Failed. Error : " + e);
                    e.getMessage();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public UsersService getUsers() {
        return user;
    }

    public AnimalService getAnimal() {
        return animal;
    }

    public AnimalCareService getAnimalCare() {
        return animalCare;
    }

    public AnimalTypeService getAnimalType() {
        return animalType;
    }

    public TypePetService getTypePet() {
        return typePet;
    }
        
    public LevelService getLevel() {
        return level;
    }
}
