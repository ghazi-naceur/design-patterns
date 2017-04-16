package patterns.builder.vehiculeTypes;

import patterns.builder.Vehicule;
import patterns.builder.VehiculeBuilder;

/**
 * Created by Ghazi Ennacer on 16/04/2017.
 */
public class Motocycle implements VehiculeBuilder {

    Vehicule motocycle = new Vehicule("Motocycle");

    public Motocycle() {
    }

    @Override
    public void createCarcass() {
        motocycle.setCarcass("The carcass of the motocycle.");
    }

    @Override
    public void createForce() {
        motocycle.setForce("The power of the motocycle.");
    }

    @Override
    public void createEngine() {
        motocycle.setEngine("The engine of the motocycle.");
    }

    @Override
    public void createBreaks() {
        motocycle.setBreaks("The breaks of the motocycle.");
    }

    @Override
    public void createSeats() {
        motocycle.setSeats("The seats of the motocycle.");
    }

    @Override
    public void createWindows() {
        motocycle.setWindows("No windows.");
    }

    @Override
    public void createFuel() {
        motocycle.setFuel("The fuel of the motocycle.");
    }

    @Override
    public Vehicule getVehicule() {
        return motocycle;
    }
}
