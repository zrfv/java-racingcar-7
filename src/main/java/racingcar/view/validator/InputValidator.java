package racingcar.view.validator;

public class InputValidator {

    private final String NOT_MULTIPLE_CAR = "자동차는 2개 이상 입력해주세요.";
    private final String NOT_POSITIVE_NUMBER = "1 이상의 정수만 입력가능합니다.";

    public void checkSingleCar(String input) { // 쉼표 있는지 확인, 없으면 차 한대이므로 예외
        if (!input.contains(",")) {
            throw new IllegalArgumentException(NOT_MULTIPLE_CAR);
        }
    }

    public void checkEmptyString(String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException(NOT_MULTIPLE_CAR);
        }
    }

    public void checkPositiveNumber(Integer input) {
        if (!(input >= 1)) {
            throw new IllegalArgumentException(NOT_POSITIVE_NUMBER);
        }
    }
}
