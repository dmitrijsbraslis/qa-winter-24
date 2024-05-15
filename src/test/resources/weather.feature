Feature: Historical weather data

  Scenario: Historical temperature data test
    Given coordinates:
      | latitude  | 52.54833  |
      | longitude | 13.407822 |

    When we are requesting historical data from "2024-04-01" to "2024-04-01"

    Then timezone is set as "GMT"
    And elevation is 53
    And hourly units are:
      | time           | iso8601 |
      | temperature_2m | °C      |