package racingcar.model;

import racingcar.view.InputView;

public class RacingCarName {

    private String[] nameList;

    public String[] get() {
        InputView inputView = new InputView();
        return inputView.splitCarName(inputView.inputCarName());
    }
}
