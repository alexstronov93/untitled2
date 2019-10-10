package nuclear;


import launch.Launch;
import launch.LaunchPlatform;
import launch.Silo;
import storage.OptionalRocket;
import storage.RocketStorage;
import storage.UndegroundRocketStorage;

public class RocketLaunchApp {
    public static void main(String[] args) {
        Coordinates bellfast= new Coordinates(-5.93936, 54.66682);
        Rocket bellfastNuke= new Rocket(Warhead.NUCLEAR,bellfast);
        RocketStorage storage=new UndegroundRocketStorage(bellfastNuke);
        LaunchPlatform site000= new Silo(new Coordinates(0.0,0.0));
        OptionalRocket r0=storage.tryToGet(0);
        if (r0.isPresent()){
            Rocket rocket=r0.get();
            Launch launch =site000.launch(rocket);
            System.out.println("Verifying launch: "+ launch);
        }
    }
}
