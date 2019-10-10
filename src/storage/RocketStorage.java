package storage;

import nuclear.Rocket;

import java.util.Optional;

public interface RocketStorage {
    Rocket get(int index) throws RocketNotFoundException;

    OptionalRocket tryToGet(int index);
}
