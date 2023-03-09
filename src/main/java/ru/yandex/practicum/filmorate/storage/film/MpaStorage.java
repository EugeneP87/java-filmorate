package ru.yandex.practicum.filmorate.storage.film;

import ru.yandex.practicum.filmorate.model.Mpa;

import java.util.Collection;

public interface MpaStorage {

    Collection<Mpa> findAll();

    Mpa getMpaById(int id);

}