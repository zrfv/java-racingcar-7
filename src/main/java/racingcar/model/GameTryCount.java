package racingcar.model;

import racingcar.view.InputView;

public class GameTryCount {

    public int get() {
        InputView inputView = new InputView();
        return inputView.convertStringToInt(inputView.inputTryCount());
    }
}
