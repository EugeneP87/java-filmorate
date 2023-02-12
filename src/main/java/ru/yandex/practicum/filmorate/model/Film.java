package ru.yandex.practicum.filmorate.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
public class Film {

    private int id;  // целочисленный идентификатор
    @NotBlank
    private String name; // название
    private String description; // описание
    private LocalDate releaseDate; // дата релиза
    private int duration; // продолжительность фильма
    private Set<Integer> likes = new HashSet<>(); // список лайков

}