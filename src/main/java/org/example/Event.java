package org.example;

import java.time.LocalDateTime;
import java.util.UUID;

public class Event {
    private UUID id;
    private LocalDateTime localDateTime;
    private String description;

    public Event(UUID id, LocalDateTime localDateTime, String description) {
        this.id = id;
        this.localDateTime = localDateTime;
        this.description = description;

        System.out.printf("Generated %s", id.toString());
    }
}