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

    public List<String> getList(ArrayList<RacingCar> racingCarList, int maxPosition) {
        List<String> winnerList = new ArrayList<>();
        for (RacingCar car : racingCarList) {
            if (car.getCurrentPosition() == maxPosition) {
                winnerList.add(car.getName());
            }
        }
        return winnerList;
    }
}