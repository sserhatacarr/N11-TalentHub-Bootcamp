package com.serhatacarr.weatherapi.util;

import jakarta.validation.Constraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;

/**
 * @author Serhat Acar
 */

@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CountryCodeValidator.class)
public @interface ValidCountryCode {
    String message() default "Invalid country code.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

class CountryCodeValidator implements ConstraintValidator<ValidCountryCode, String> {
    private static final Set<String> VALID_COUNTRY_CODES = Set.of(
            "UM","AF","AX","DE","US","AS","AD","AO","AI","AQ","AG","AR","AL","AW","AU","AT","AZ","BS","BH","BD","BB","EH","BE",
            "BZ","BJ","BM","BY","AE","GB","RE","BO","BQ","BA","BW","BV","BR","BN","BG","BF","BI","BT","KY","GI","DZ","CX","DJ",
            "CK","CW","TD","CZ","CN","DK","CD","TL","DO","DM","EC","GQ","SV","ID","ER","AM","EE","SZ","ET","FK","FO","MA","FJ",
            "CI","PH","PS","FI","FR","GF","TF","PF","GA","GM","GH","GN","GW","GD","GL","GP","GU","GT","GG","GY","ZA","GS","KR",
            "SS","GE","HT","HM","IN","IO","HR","NL","HN","HK","IQ","IR","IE","IM","ES","IL","SE","CH","IT","IS","JM","JP","JE",
            "KH","CM","CA","ME","QA","KZ","KE","CY","KG","KI","CC","CO","KM","CG","XK","CR","KW","KP","MP","CU","LA","LS","LV",
            "LR","LY","LI","LT","LB","LU","HU","MG","MO","MW","MV","MY","ML","MT","MH","MQ","MU","YT","MX","FM","EG","MN","MD",
            "MC","MS","MR","MZ","MM","NA","NR","NP","NE","NG","NI","NU","NF","MK","NO","CF","UZ","PK","PW","PA","PG","PY","PE",
            "PN","PL","PT","PR","RO","RW","RU","BL","SH","KN","LC","VC","WS","SM","ST","MF","PM","SN","SC","SL","SG","SX","RS",
            "SK","SI","SB","SO","LK","SD","SR","SY","SA","SJ","CL","TJ","TZ","TH","TW","TG","TK","TO","TT","TN","TV","TC","TR",
            "TM","UG","UA","OM","UY","JO","VU","VA","VE","VN","VI","VG","WF","YE","NC","NZ","CV","GR","ZM","ZW" );

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return VALID_COUNTRY_CODES.contains(value);
    }
}

