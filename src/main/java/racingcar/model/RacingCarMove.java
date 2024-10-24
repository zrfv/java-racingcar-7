package racingcar.model;

public class RacingCarMove {

    public static int move(RandomNumber randomNumber) {
        if (randomNumber.generate() >= 4) {
            return 1;
        }
        return 0;
    }
}
