package com.lin.design_patterns.dediator;

public class Main {
    public static void main(String[] args) {
        MediatorStructure mediatorStructure = new MediatorStructure();

        Tenant tenant = new Tenant("李四", mediatorStructure);

        HouseOwner houseOwner = new HouseOwner("张三", mediatorStructure);

        mediatorStructure.setTenant(tenant);
        mediatorStructure.setHouseOwner(houseOwner);

        tenant.contact("我要租房子");
        houseOwner.contact("我这里有房子，你要租吗？");


    }
}
