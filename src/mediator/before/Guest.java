package mediator.before;

public class Guest {

    private Restaurant reataurant = new Restaurant();
    private CleaningService cleaningService = new CleaningService();

    public void dinner() {
        reataurant.dinner(this);
    }

    public void getTower(int numberOfTower) {
        cleaningService.getTower(this, numberOfTower);
    }
}
