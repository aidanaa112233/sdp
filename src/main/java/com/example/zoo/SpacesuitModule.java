package com.example.zoo;

// Product interface
public interface SpacesuitModule {
    void activate();
}

// Concrete Product 1
class OxygenTank implements SpacesuitModule {
    @Override
    public void activate() {
        System.out.println("[Factory Method] Oxygen tank initialized: Pressure normal.");
    }
}

// Concrete Product 2
class ThermalRegulator implements SpacesuitModule {
    @Override
    public void activate() {
        System.out.println("[Factory Method] Thermal regulator active: Temperature stabilizing.");
    }
}

// Creator abstract class
abstract class ModuleCreator {
    public abstract SpacesuitModule createModule();
}

// Concrete Creator 1
class OxygenFactory extends ModuleCreator {
    @Override
    public SpacesuitModule createModule() {
        return new OxygenTank();
    }
}

// Concrete Creator 2
class ThermalFactory extends ModuleCreator {
    @Override
    public SpacesuitModule createModule() {
        return new ThermalRegulator();
    }
}