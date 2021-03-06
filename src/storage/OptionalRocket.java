package storage;

import nuclear.Rocket;
import nuclear.RocketLaunchApp;

import java.util.NoSuchElementException;

public class OptionalRocket {
    private final Rocket value;

    public OptionalRocket(Rocket value) {
        this.value = value;
    }

    public Rocket get() {
        if (value==null){
            throw new NoSuchElementException();
        }
        return value;
    }
    public Rocket getOrThrow(RocketNotFoundException e)throws RocketNotFoundException{
        if (value==null){
            throw e;
        }
        return value;
    }
    public boolean isPresent(){
        return value !=null;
    }

}
