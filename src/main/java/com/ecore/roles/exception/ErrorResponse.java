package com.ecore.roles.exception;

import lombok.*;

@Builder
@Data
public class ErrorResponse {

    private final int status;
    private final String error;

}
