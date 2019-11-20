/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Ankit Patro
 */
public class Car {

    private boolean isAvailable;
    private String model;
    private int manufacturedYear;
    private int minSeats;
    private int maxSeats;
    private int serialNumber;
    private String modelNumber;
    private String availableCity;
    private boolean hasMaintenanceCertificateExpired;

    public Car(boolean available, String model, int manufacturedYear, int minSeats, int maxSeats, int serialNumber, String modelNumber, String availbleCity, boolean maintenance_certificate) {
        this.isAvailable = available;
        this.model = model;
        this.manufacturedYear = manufacturedYear;
        this.minSeats = minSeats;
        this.maxSeats = maxSeats;
        this.serialNumber = serialNumber;
        this.modelNumber = modelNumber;
        this.availableCity = availbleCity;
        this.hasMaintenanceCertificateExpired = maintenance_certificate;
    }
    
    public Car()
    {
        
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String brand) {
        this.model = brand;
    }

    public int getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(int manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    public int getMinSeats() {
        return minSeats;
    }

    public void setMinSeats(int minSeats) {
        this.minSeats = minSeats;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public int getSerial_num() {
        return serialNumber;
    }

    public void setSerial_num(int serial_num) {
        this.serialNumber = serial_num;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getAvailableCity() {
        return availableCity;
    }

    public void setAvailableCity(String availableCity) {
        this.availableCity = availableCity;
    }

    public boolean hasMaintenanceCertificateExpired() {
        return hasMaintenanceCertificateExpired;
    }

    public void setHasMaintenanceCertificateExpired(boolean hasMaintenanceCertificateExpired) {
        this.hasMaintenanceCertificateExpired = hasMaintenanceCertificateExpired;
    }

    @Override
    public String toString() {
        return this.model;
    }

}
