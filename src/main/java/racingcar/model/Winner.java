package racingcar.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Winner {
    public int getMaxPosition(ArrayList<RacingCar> racingCarList) {
        List<Integer> list = new ArrayList<>();
        for (RacingCar position : racingCarList) {
            list.add(position.getCurrentPosition());
        }
        return Collections.max(list);
    }
}