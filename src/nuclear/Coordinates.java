package nuclear;

import java.util.Objects;

public final class Coordinates {
    private final double latidude;
    private final double longtidute;

    public Coordinates(double latidude, double longtidute) {
        this.latidude = latidude;
        this.longtidute = longtidute;
    }

    public double getLatidude() {
        return latidude;
    }

    public double getLongtidute() {
        return longtidute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates coordinates = (Coordinates) o;
        return Double.compare(coordinates.latidude, latidude) == 0 &&
                Double.compare(coordinates.longtidute, longtidute) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(latidude, longtidute);
    }

    @Override
    public String toString() {
        return "Target{" +
                "latitude=" + latidude +
                ", longtidute=" + longtidute +
                '}';
    }
}
