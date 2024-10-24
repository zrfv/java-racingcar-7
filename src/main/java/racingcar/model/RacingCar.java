package racingcar.model;

public class RacingCar {
    private final String name;
    private int currentPosition;

    public RacingCar(String name, int currentPosition) {
        this.name = name;
        this.currentPosition = currentPosition;
    }

    public void move(RacingCarMove racingCarMove, RandomNumber randomNumber) {
        this.currentPosition += racingCarMove.move(randomNumber);
    }

    public String getName() {
        return name;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }
}
