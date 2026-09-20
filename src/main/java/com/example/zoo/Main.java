package com.example.zoo;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. Testing Factory Method (Multiple Products & Creators) ====");

        ModuleCreator oxygenCreator = new OxygenFactory();
        SpacesuitModule oxygenModule = oxygenCreator.createModule();
        oxygenModule.activate();

        ModuleCreator thermalCreator = new ThermalFactory();
        SpacesuitModule thermalModule = thermalCreator.createModule();
        thermalModule.activate();

        System.out.println("\n=== 2. Testing Abstract Factory (Multiple Families: Mars & Venus) ====");

        String targetPlanet = "Venus";
        PlanetLifeSupportFactory factory;

        if (targetPlanet.equalsIgnoreCase("Mars")) {
            factory = new MarsSystemFactory();
        } else if (targetPlanet.equalsIgnoreCase("Venus")) {
            factory = new VenusSystemFactory();
        } else {
            throw new IllegalArgumentException("Unknown or unsupported planet type: " + targetPlanet);
        }

        IAtmosphereController atmosphere = factory.createAtmosphereController();
        IGravityStabilizer gravity = factory.createGravityStabilizer();

        atmosphere.regulateGas();
        gravity.calibrateGravity();

        System.out.println("\n[Clean Code]: Validated construction & Small methods applied successfully!");
    }
}