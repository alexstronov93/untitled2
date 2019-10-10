package launch;

import nuclear.Coordinates;
import nuclear.Rocket;

import java.util.Date;

public final class Silo implements LaunchPlatform {
    private final Coordinates location;

    public Silo(Coordinates location) {
        this.location = location;
    }


    @Override
    public Launch launch(Rocket rocket) {
        Launch launch = new Launch(location, rocket, new Date());
        Date date =new Date();
        Coordinates target = rocket.getTarget();

        System.out.println(rocket.getWarhead() +
                " rocket has been launched from the silo at {" +
                location.getLatidude() + ", " +
                location.getLongtidute() + "} at " +
                launch.getDate() + ", targeting coordinates {" +
                target.getLatidude() + ", " +
                target.getLongtidute() + "}"
        );
        return launch;
    }
}
