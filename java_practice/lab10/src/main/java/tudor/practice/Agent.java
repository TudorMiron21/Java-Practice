package tudor.practice;

import java.math.BigDecimal;

public class Agent {
    private int id;
    private String name;
    private String workingArea;
    private BigDecimal commission;
    private String phoneNo;
    private String country;

    // Default constructor
    public Agent() {
    }

    // Explicit constructor
    public Agent(int id, String name, String workingArea, BigDecimal commission, String phoneNo, String country) {
        this.id = id;
        this.name = name;
        this.workingArea = workingArea;
        this.commission = commission;
        this.phoneNo = phoneNo;
        this.country = country;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getWorkingArea() {
        return workingArea;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getCountry() {
        return country;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkingArea(String workingArea) {
        this.workingArea = workingArea;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}