package launch;
import nuclear.Coordinates;
import nuclear.Rocket;

import java.util.Date;
import java.util.Objects;

public class Launch {
    private final Coordinates coordinates;
    private final Rocket rocket;
    private final Date date;

    public Launch(Coordinates coordinates, Rocket rocket, Date date) {
        this.coordinates = coordinates;
        this.rocket = rocket;
        this.date = date;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Launch launch = (Launch) o;
        return Objects.equals(coordinates, launch.coordinates) &&
                Objects.equals(rocket, launch.rocket) &&
                Objects.equals(date, launch.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinates, rocket, date);

    }

    @Override
    public String toString() {
        return "Launch{" +
                "coordinates=" + coordinates +
                ", rocket=" + rocket +
                ", date=" + date +
                '}';
    }
}
