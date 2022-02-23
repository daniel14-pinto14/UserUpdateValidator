package com.tbp.crud.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = IdCheckValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface IdCheck {

    String message() default "User Id should only contain numbers";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
