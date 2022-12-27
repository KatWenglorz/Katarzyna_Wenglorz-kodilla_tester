package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class WeatherAlertServiceTestSuite {

    WeatherAlertService weatherAlertService = new WeatherAlertService();
    WeatherAlert weatherAlert = Mockito.mock(WeatherAlert.class);
    Information information = Mockito.mock(Information.class);
    Person firstPerson = Mockito.mock(Person.class);
    Person secondPerson = Mockito.mock(Person.class);
    Person thirdPerson = Mockito.mock(Person.class);
    Localization firstLocalization = Mockito.mock(Localization.class);
    Localization secondLocalization = Mockito.mock(Localization.class);

    @Test
    public void subscribedPersonShouldReceiveWeatherAlert() {

        weatherAlertService.addSubscriber(firstPerson, firstLocalization);
        weatherAlertService.addSubscriber(secondPerson, firstLocalization);

        weatherAlertService.sendWeatherAlertToSubscribedPeople(weatherAlert, firstLocalization);
        Mockito.verify(firstPerson).receiveWeatherAlert(weatherAlert);
        Mockito.verify(secondPerson).receiveWeatherAlert(weatherAlert);
    }
    @Test
    public void alertShouldNotBeSendToPeopleWhoAreNotSubscribedToACertainLocalization() {

        weatherAlertService.addSubscriber(thirdPerson, firstLocalization);

        weatherAlertService.sendWeatherAlertToSubscribedPeople(weatherAlert, secondLocalization);
        Mockito.verify(thirdPerson, Mockito.never()).receiveWeatherAlert(weatherAlert);
    }
    @Test
    public void shouldSendInformationToAllSubscribedPeople() {

    weatherAlertService.addSubscriber(firstPerson, firstLocalization);
    weatherAlertService.addSubscriber(secondPerson, firstLocalization);
    weatherAlertService.addSubscriber(thirdPerson, firstLocalization);

    weatherAlertService.sendInformationToAllPeople(information);

    Mockito.verify(firstPerson, Mockito.times(1)).receiveInformation(information);
    Mockito.verify(secondPerson, Mockito.times(1)).receiveInformation(information);
    Mockito.verify(thirdPerson, Mockito.times(1)).receiveInformation(information);
    }
    @Test
    public void shouldUnsubscribe() {
        weatherAlertService.addSubscriber(firstPerson, firstLocalization);
        weatherAlertService.addSubscriber(firstPerson, secondLocalization);

        weatherAlertService.unsubscribe(firstPerson, firstLocalization);

        weatherAlertService.sendWeatherAlertToSubscribedPeople(weatherAlert, firstLocalization);
        Mockito.verify(firstPerson, Mockito.never()).receiveWeatherAlert(weatherAlert);
    }
    @Test
    public void shouldNotReceiveInformationIfWasUnsubscribedFromAllLocalizations() {
        weatherAlertService.addSubscriber(firstPerson, firstLocalization);
        weatherAlertService.unsubscribe(firstPerson, firstLocalization);
        weatherAlertService.sendInformationToAllPeople(information);

        Mockito.verify(firstPerson, Mockito.never()).receiveInformation(information);
    }
    @Test
    public void shouldDeleteLocalization() {
        weatherAlertService.addSubscriber(firstPerson, firstLocalization);
        weatherAlertService.deleteLocalization(firstLocalization);
        weatherAlertService.sendWeatherAlertToSubscribedPeople(weatherAlert, firstLocalization);

        Mockito.verify(firstPerson, Mockito.never()).receiveWeatherAlert(weatherAlert);
    }
}