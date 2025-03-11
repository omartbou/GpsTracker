package com.omar.gpstracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "arch_1004901")
public class GpsCoordinate {

    @Id
    private int idDevice;

    private LocalDateTime date;
    private double latitude;
    private double longitude;
    private int speed;
    private int fuel;
    private String temp;
    private int X;
    private int Y;
    private int Z;
    private boolean ignition;
    private int rpm;
    private double fuelRate;
    private double tfu;
    private double odo;
    private int satInView;
    private int signal;
    private int heading;
    private boolean charger;
    private Integer state;
    private Integer tramId;
    private Boolean validity;
    private Integer tempEngine;
    private Float accumOdo;

    // No-argument constructor
    public GpsCoordinate() {
    }

    // Getters and Setters
    public int getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(int idDevice) {
        this.idDevice = idDevice;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public int getZ() {
        return Z;
    }

    public void setZ(int z) {
        Z = z;
    }

    public boolean isIgnition() {
        return ignition;
    }

    public void setIgnition(boolean ignition) {
        this.ignition = ignition;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public void setFuelRate(double fuelRate) {
        this.fuelRate = fuelRate;
    }

    public double getTfu() {
        return tfu;
    }

    public void setTfu(double tfu) {
        this.tfu = tfu;
    }

    public double getOdo() {
        return odo;
    }

    public void setOdo(double odo) {
        this.odo = odo;
    }

    public int getSatInView() {
        return satInView;
    }

    public void setSatInView(int satInView) {
        this.satInView = satInView;
    }

    public int getSignal() {
        return signal;
    }

    public void setSignal(int signal) {
        this.signal = signal;
    }

    public int getHeading() {
        return heading;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }

    public boolean isCharger() {
        return charger;
    }

    public void setCharger(boolean charger) {
        this.charger = charger;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getTramId() {
        return tramId;
    }

    public void setTramId(Integer tramId) {
        this.tramId = tramId;
    }

    public Boolean getValidity() {
        return validity;
    }

    public void setValidity(Boolean validity) {
        this.validity = validity;
    }

    public Integer getTempEngine() {
        return tempEngine;
    }

    public void setTempEngine(Integer tempEngine) {
        this.tempEngine = tempEngine;
    }

    public Float getAccumOdo() {
        return accumOdo;
    }

    public void setAccumOdo(Float accumOdo) {
        this.accumOdo = accumOdo;
    }
}
