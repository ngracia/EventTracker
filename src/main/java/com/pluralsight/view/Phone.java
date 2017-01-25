package com.pluralsight.view;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by dev on 25/01/17.
 */
@Documented
@Constraint(validatedBy = PhoneConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Phone {

    String message() default "{Phone}";
    Class<?>[] group() default {};
    Class<? extends Payload>[] playload() default {};
}
