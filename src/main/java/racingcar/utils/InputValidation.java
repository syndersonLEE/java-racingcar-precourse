package racingcar.utils;

import java.util.Arrays;

public class InputValidation {
	public static boolean parseInputValueCar(String inputValue) {
		Arrays.stream(inputValue.split(","))
				.allMatch(InputValidation::validLength);
		return true;
	}

	public static boolean validLength(Object inputValue) {
		if(!(inputValue instanceof String))
			throw new IllegalArgumentException();
		String car = (String) inputValue;
		if(car.length() == 0 || car.length() > 5) {
			throw new IllegalArgumentException();
		}
		return true;
	}
}
