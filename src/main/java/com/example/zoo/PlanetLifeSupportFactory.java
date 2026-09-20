package com.example.zoo;

// Abstract Factory interface
public interface PlanetLifeSupportFactory {
    IAtmosphereController createAtmosphereController();
    IGravityStabilizer createGravityStabilizer();
}

// Concrete Factory 1: Mars Family
class MarsSystemFactory implements PlanetLifeSupportFactory {
    @Override
    public IAtmosphereController createAtmosphereController() {
        return new MarsAtmosphereController();
    }
    @Override
    public IGravityStabilizer createGravityStabilizer() {
        return new MarsGravityStabilizer();
    }
}

// Concrete Factory 2: Venus Family
class VenusSystemFactory implements PlanetLifeSupportFactory {
    @Override
    public IAtmosphereController createAtmosphereController() {
        return new VenusAtmosphereController();
    }
    @Override
    public IGravityStabilizer createGravityStabilizer() {
        return new VenusGravityStabilizer();
    }
}