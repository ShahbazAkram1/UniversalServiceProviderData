/**
 * Author: Shahbaz Ali
 * Email: shahbazkhaniq@gmail.com
 * Date: 9/16/2023$
 * Time: 6:30 PM$
 * Project Name: USPHealthData
 */


package com.uspd.UniversalServiceProviderData.exception;

import lombok.AllArgsConstructor;

public class RequiredFieldValidationException extends RuntimeException {
    public RequiredFieldValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
