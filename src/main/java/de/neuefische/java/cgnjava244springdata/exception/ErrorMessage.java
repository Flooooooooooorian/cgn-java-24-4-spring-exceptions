package de.neuefische.java.cgnjava244springdata.exception;

import java.time.Instant;

public record ErrorMessage(
        String message,
        Instant timestamp
) {
}
