package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.view.validator.InputValidator;

public class InputView {

    private final String INITIAL_INPUT_CAR_NAME = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

    InputValidator inputValidator = new InputValidator();

    public String inputCarName() {
        System.out.println(INITIAL_INPUT_CAR_NAME);
        String carName = Console.readLine();

        inputValidator.checkSingleCar(carName);

        return carName;
    }

    public void close() {
        Console.close();
    }
}
