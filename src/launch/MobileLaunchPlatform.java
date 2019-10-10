package launch;
import nuclear.Coordinates;

public interface MobileLaunchPlatform extends LaunchPlatform {
    void move(Coordinates location);
}
