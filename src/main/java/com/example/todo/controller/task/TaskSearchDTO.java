package com.example.todo.controller.task;

import java.util.List;
import java.util.Optional;

public record TaskSearchDTO (
    String summary,
    List<String> status
){

    public boolean isChecked(String targetStatus){
        return Optional.ofNullable(status)
                .map(l -> l.contains(targetStatus))
                .orElse(false);
    }
}
