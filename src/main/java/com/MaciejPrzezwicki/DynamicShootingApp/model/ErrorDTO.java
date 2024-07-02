package com.MaciejPrzezwicki.DynamicShootingApp.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ErrorDTO {
    public final String message;
}
