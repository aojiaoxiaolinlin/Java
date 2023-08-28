package com.lin.design_patterns.dediator;

public class MediatorStructure implements Mediator {
    private HouseOwner houseOwner;
    private Tenant tenant;


    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }


    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
    @Override
    public void contact(String message, Person person) {
        if (person == houseOwner) {
            tenant.getMessage(message);
        } else {
            houseOwner.getMessage(message);
        }
    }
}
