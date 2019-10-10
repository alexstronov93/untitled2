package storage;

import nuclear.Rocket;

import java.util.Optional;

public class UndegroundRocketStorage implements RocketStorage {
    private final Rocket[] rockets;

    @Override
    public Rocket get(int index)throws RocketNotFoundException {
        OptionalRocket rocket= tryToGet(index);
        if (rocket.isPresent()){
            return rocket.get();
        }else {
            throw new  RocketNotFoundException(index);
        }

    }

    @Override
    public OptionalRocket tryToGet(int index) {
        Rocket rocket;
        if (index<0 || index>= rockets.length){
            rocket=null;
        }else {
            rocket=rockets[index];
        }
        rockets[index]=null;
        return new OptionalRocket(rocket);
    }

    public UndegroundRocketStorage (Rocket...rockets){
        this.rockets=rockets;
    }
}
