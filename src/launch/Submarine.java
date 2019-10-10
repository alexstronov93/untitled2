package launch;

import nuclear.Coordinates;
import nuclear.Rocket;

import java.util.Date;

public class Submarine implements MobileLaunchPlatform {
    private final Coordinates location;

    public Submarine(Coordinates location) {
        this.location = location;
    }


    @Override
    public void move(nuclear.Coordinates location) {
        Coordinates newCoord= new Coordinates(location.getLatidude(),location.getLongtidute());
    }




    @Override
    public Launch launch(Rocket rocket) {
        Launch launch = new Launch(location, rocket, new Date());
        Date date =new Date();
        Coordinates target = rocket.getTarget();
        System.out.println(rocket.getWarhead() +
                " rocket has been launched from the Submarine at {" +
                location.getLatidude() + ", " +
                location.getLongtidute() + "} at " +
                launch.getDate() + ", targeting coordinates {" +
                target.getLatidude() + ", " +
                target.getLongtidute() + "}"
        );
        return launch;
    }

}
