class ProductionRemoteControlCar implements RemoteControlCar {

    int distanceTravelled;
    int numberOfVictories;

    public void drive() {
        distanceTravelled += 10; // Production car drives 10 units
    }

    public int getDistanceTravelled() {
        return distanceTravelled; // Return the distance travelled
    }

    public int getNumberOfVictories() {
        return numberOfVictories; // Return the number of victories
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories; // Set the number of victories
    }
}
