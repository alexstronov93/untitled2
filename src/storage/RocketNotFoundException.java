package storage;

public class RocketNotFoundException extends Exception {
    public RocketNotFoundException(int index) {
        super("Rocket index "+index+" not found");
    }
}
