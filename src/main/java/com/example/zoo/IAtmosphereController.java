package com.example.zoo;

// Abstract Products
public interface IAtmosphereController {
    void regulateGas();
}

interface IGravityStabilizer {
    void calibrateGravity();
}

// Family 1: Mars Products
class MarsAtmosphereController implements IAtmosphereController {
    @Override
    public void regulateGas() { System.out.println("-> [Mars] Regulating CO2-rich atmosphere."); }
}

class MarsGravityStabilizer implements IGravityStabilizer {
    @Override
    public void calibrateGravity() { System.out.println("-> [Mars] Calibrating for low gravity (0.38g)."); }
}

// Family 2: Venus Products
class VenusAtmosphereController implements IAtmosphereController {
    @Override
    public void regulateGas() { System.out.println("-> [Venus] Filtering dense sulfuric acid atmosphere."); }
}

class VenusGravityStabilizer implements IGravityStabilizer {
    @Override
    public void calibrateGravity() { System.out.println("-> [Venus] Calibrating for near-Earth gravity (0.90g)."); }
}