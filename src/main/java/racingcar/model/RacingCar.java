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

    private String convertIntToPosition() {
        String position= "";
        if (getCurrentPosition() == 1) {
            position ="-";
        }

        for (int i = 0; i<getCurrentPosition();++i) {
            position = position.concat("-");
        }
        return position;
    }

    @Override
    public String toString() {
        return getName() + " : " + convertIntToPosition();
    }
}
