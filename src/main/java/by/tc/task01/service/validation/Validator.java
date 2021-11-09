package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import sun.security.validator.ValidatorException;

import java.util.Map;

public class Validator {

	private static final String REGEX_VALUE_VALIDATION = "^(0|[1-9]\\d*)([.,]\\d+)?";
	private static final String REGEX_KEY_VALIDATION = "[a-zA-Z]+";

	public static boolean criteriaValidator(Criteria criteria) throws ValidationException {

		for (Map.Entry<String, Object> c: criteria.getCriteriaMap().entrySet()) {
			if(!c.getKey().trim().matches(REGEX_KEY_VALIDATION) && c.getValue().toString().matches(REGEX_VALUE_VALIDATION)){
				throw new ValidationException("Invalid value or category");
			}
		}
		return true;
	}
}