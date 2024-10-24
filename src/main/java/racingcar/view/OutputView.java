package racingcar.view;

import racingcar.model.RacingCar;

public class OutputView {

    public static void printInitResult() {
        System.out.println();
        System.out.println("실행 결과");
    }

    public static void printRoundResult(RacingCar racingCar) {
        System.out.println(racingCar.toString());
    }
}
