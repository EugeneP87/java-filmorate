package ru.yandex.practicum.filmorate.controller;

class FilmControllerTest {
/*
    FilmController filmController = new FilmController(new FilmService(new InMemoryFilmStorage()));

    @Test()
    void filmNameNotBlank() {
        Assertions.assertThrows(ValidationException.class, () ->
                filmController.create(Film.builder()
                        .id(1)
                        .name("")
                        .description("Description")
                        .releaseDate(LocalDate.of(2013, 1, 25))
                        .duration(94)
                        .build())
        );
    }

    @Test
    void maxFilmDescriptionLengthIs200() {
        String filled = StringUtils.repeat("*", 201);
        Assertions.assertThrows(ValidationException.class, () ->
                filmController.create(Film.builder()
                        .id(1)
                        .name("Movie 43")
                        .description(filled)
                        .releaseDate(LocalDate.of(2013, 1, 25))
                        .duration(94)
                        .build())
        );
    }

    @Test
    void filmReleaseDate() {
        Assertions.assertThrows(ValidationException.class, () ->
                filmController.create(Film.builder()
                        .id(1)
                        .name("Movie 43")
                        .description("Description")
                        .releaseDate(LocalDate.of(1895, 12, 27))
                        .duration(94)
                        .build())
        );
    }

    @Test
    void filmDurationMustBePositive() {
        Assertions.assertThrows(ValidationException.class, () ->
                filmController.create(Film.builder()
                        .id(1)
                        .name("Movie 43")
                        .description("Description")
                        .releaseDate(LocalDate.of(2013, 1, 25))
                        .duration(0)
                        .build())
        );
    }*/
}