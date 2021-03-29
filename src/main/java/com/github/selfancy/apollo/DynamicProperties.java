package com.github.selfancy.apollo;

import java.lang.annotation.*;

/**
 * Dynamic properties.
 * Both required annotation `@DynamicProperties` and `@ConfigurationProperties`.
 * <br>
 * Sample:
 * <pre>
 * <br> @DynamicProperties
 * <br> @ConfigurationProperties("custom")
 * <br> public class CustomProperties {
 * <br>     private String value;
 * <br> }
 * </pre>
 * Created by mike on 2020/8/13 since 1.0
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DynamicProperties {
}
