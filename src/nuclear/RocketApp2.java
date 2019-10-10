package nuclear;

import launch.Launch;
import launch.MobileLaunchPlatform;
import launch.Submarine;
import storage.OptionalRocket;
import storage.RocketStorage;
import storage.UndegroundRocketStorage;

public class RocketApp2 {
    public static void main(String[] args) {
        Coordinates tokio = new Coordinates(22.432, 12.546);
        Rocket tokioNuke = new Rocket(Warhead.CONVENTIONAL, tokio);
        RocketStorage storage = new UndegroundRocketStorage(tokioNuke);
        MobileLaunchPlatform submarine = new Submarine(new Coordinates(3.3, 5.2));
        submarine.move(new Coordinates(5.0, 6.543));
        Launch launch = submarine.launch(tokioNuke);
    }
}
