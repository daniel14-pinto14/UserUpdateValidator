package com.tbp.crud.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class IdCheckValidator implements ConstraintValidator<IdCheck, Integer> {

    Logger logger = LoggerFactory.getLogger(IdCheckValidator.class);

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
         logger.info("Validating ID" + value);
         Pattern pattern = Pattern.compile("^[0-9]+$");
             return pattern.matcher(String.valueOf(value)).matches();

    }
}
