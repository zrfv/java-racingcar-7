package racingcar.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class WinnerTest {

    @Test
    void 우승자_결정_테스트() {
        ArrayList<RacingCar> racingCarList = new ArrayList<>();
        racingCarList.add(new RacingCar("kim", 3));
        racingCarList.add(new RacingCar("lee", 2));
        racingCarList.add(new RacingCar("son", 7));
        racingCarList.add(new RacingCar("kane", 5));

        Winner winner = new Winner();
        assertEquals(7, winner.getMaxPosition(racingCarList));
    }
}
