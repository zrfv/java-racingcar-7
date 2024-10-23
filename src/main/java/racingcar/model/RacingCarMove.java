package racingcar.model;

public class RacingCarMove {

    public int move(RandomNumber randomNumber) {
        if (randomNumber.generate() >= 4) {
            return 1;
        }
        return 0;
    }
}
