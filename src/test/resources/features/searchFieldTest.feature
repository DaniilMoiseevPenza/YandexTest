Feature: Покупка уточек

  Background:
    Given open start page

  Scenario: Парсинг значение из n строчки в результтате поискового запроса
    When type to input text "Погода" in text search field
    Then parse <1> line from result search and output it in console
    When type to input text "Липецк" in text search field
    Then parse <1> line from result search and output it in console
    When type to input text "Лото" in text search field
    Then parse <1> line from result search and output it in console