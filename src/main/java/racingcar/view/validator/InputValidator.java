package racingcar.view.validator;

import racingcar.view.InputView;

public class InputValidator {

    public void checkSingleCar(String input) { // 쉼표 있는지 확인, 없으면 차 한대이므로 예외
        if (!input.contains(",")) {
            throw new IllegalArgumentException("자동차는 2개 이상 입력해주세요.");
        }
    }
}
