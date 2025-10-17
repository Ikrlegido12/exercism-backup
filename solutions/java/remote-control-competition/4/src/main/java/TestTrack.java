import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive(); // Call the drive method to make the car travel
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        cars.sort((car1, car2) -> Integer.compare(car2.getNumberOfVictories(), car1.getNumberOfVictories()));
        return cars; // Return the sorted list of cars
    }
    
}
