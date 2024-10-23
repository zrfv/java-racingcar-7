package racingcar.view.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class InputValidatorTest{

    @Test
    void 자동차_한대_입력_예외_테스트() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new InputValidator().checkSingleCar("kim"));
        assertEquals("자동차는 2개 이상 입력해주세요.", exception.getMessage());
    }

    @Test
    void 입력_문자열_공백_예외_테스트() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new InputValidator().checkEmptyString(""));
        assertEquals("자동차는 2개 이상 입력해주세요.", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class,
                () -> new InputValidator().checkEmptyString("  \n \t "));
        assertEquals("자동차는 2개 이상 입력해주세요.", exception.getMessage());
    }
}