package racingcar.model;

import racingcar.view.InputView;

public class RacingCarName {

    public static String[] getList(InputView inputView) {
        return inputView.splitCarName(inputView.inputCarName());
    }
}
