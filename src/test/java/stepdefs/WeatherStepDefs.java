package stepdefs;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.WeatherResponse;
import org.junit.jupiter.api.Assertions;
import requesters.WeatherRequester;

import java.util.Map;

public class WeatherStepDefs {
    private Double lat;
    private Double lon;
    private WeatherResponse response;

    @Given("coordinates:")
    public void set_coordinates(Map<String, Double> parms) {
        lat = parms.get("latitude");
        lon = parms.get("longitude");
    }

    @When("we are requesting historical data from {string} to {string}")
    public void request_historical_weather(String dateFrom, String dateTo) throws JsonProcessingException {
        WeatherRequester requester = new WeatherRequester();
        response = requester.requestHistoricalData(lat, lon, dateFrom, dateTo);
    }

    @Then("timezone is set as {string}")
    public void timezone_check(String timezone) {
        Assertions.assertEquals(timezone, response.getTimezone(), "Wrong timezone!");
    }

    @Then("elevation is {int}")
    public void elevation_check(int elevation) {
        Assertions.assertEquals(elevation, response.getElevation(), "Wrong elevation!");
    }

    @Then("hourly units are:")
    public void hourly_units_check(Map<String, String> params) {
        Assertions.assertEquals(params.get("time"), response.getHourlyUnits().getTime());
        Assertions.assertEquals(params.get("temperature_2m"), response.getHourlyUnits().getTemperature2m());
    }
}
