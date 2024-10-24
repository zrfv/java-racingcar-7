package racingcar.view;

import racingcar.model.RacingCar;

public class OutputView {

    public void printInitResult() {
        System.out.println("실행 결과");
    }

    public void printRoundResult(RacingCar racingCar) {
        System.out.println(racingCar.toString());
    }
}
