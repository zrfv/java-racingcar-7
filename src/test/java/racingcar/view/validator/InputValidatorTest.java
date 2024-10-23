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
        assertEquals("자동차 이름에 공백은 입력할 수 없습니다.", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class,
                () -> new InputValidator().checkEmptyString("  \n \t "));
        assertEquals("자동차 이름에 공백은 입력할 수 없습니다.", exception.getMessage());
    }

    @Test
    void 시도할_횟수_양수_아니면_예외_테스트() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new InputValidator().checkPositiveNumber(0));
        assertEquals("1 이상의 정수만 입력가능합니다.", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class,
                () -> new InputValidator().checkPositiveNumber(-123));
        assertEquals("1 이상의 정수만 입력가능합니다.", exception.getMessage());
    }

    @Test
    void 자동차_이름이_공백이면_예외_테스트() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new InputValidator().checkEmptyString(new String[]{"kim", "lee","    "}));
        assertEquals("자동차 이름에 공백은 입력할 수 없습니다.", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class,
                () -> new InputValidator().checkEmptyString(new String[]{"kim","lee",""}));
        assertEquals("자동차 이름에 공백은 입력할 수 없습니다.", exception.getMessage());
    }

    @Test
    void 자동차_이름이_5글자_초과하면_예외_테스트() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new InputValidator().checkCarNameLength(new String[]{"kim", "lee","     alpha    "}));
        assertEquals("자동차 이름은 1글자에서 5글자 사이로 입력가능합니다.", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class,
                () -> new InputValidator().checkCarNameLength(new String[]{"kim","lee","The Weeknd"}));
        assertEquals("자동차 이름은 1글자에서 5글자 사이로 입력가능합니다.", exception.getMessage());
    }

    @Test
    void 입력_문자열_처음_또는_끝이_쉼표이면_예외_테스트() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new InputValidator().checkInValidCommaPosition(new String (",kim,lee")));
        assertEquals("자동차 이름은 1글자에서 5글자 사이로 입력가능합니다.", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class,
                () -> new InputValidator().checkInValidCommaPosition(new String ("lee,kim,")));
        assertEquals("자동차 이름은 1글자에서 5글자 사이로 입력가능합니다.", exception.getMessage());
    }
}