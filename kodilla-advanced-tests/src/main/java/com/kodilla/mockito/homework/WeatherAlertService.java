package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherAlertService {
    private Map<Person, Set<Localization>> subscribedPeople = new HashMap<>();

    public void sendInformationToAllPeople(Information information) {
        for (Person subscribedPerson : subscribedPeople.keySet()) {
            subscribedPerson.receiveInformation(information);
        }
    }
    public void addSubscriber(Person person, Localization localization) {
        this.subscribedPeople.put(person, new HashSet<>(Set.of(localization)));
    }
    public void deleteLocalization(Localization localization) {
        for(Map.Entry<Person, Set<Localization>> entryPersonsLocalizations : subscribedPeople.entrySet()) {
            entryPersonsLocalizations.getValue().remove(localization);
        }
    }
    public void unsubscribe(Person person, Localization localization) {
        this.subscribedPeople.get(person).remove(localization);
        if(this.subscribedPeople.get(person).isEmpty()) {
            this.subscribedPeople.remove(person);
        }
    }
    public void deletePerson(Person person) {
        this.subscribedPeople.remove(person);
    }

    public void sendWeatherAlertToSubscribedPeople(WeatherAlert weatherAlert, Localization localization) {
            for (Map.Entry<Person, Set<Localization>> entryPersonsLocalizations : subscribedPeople.entrySet()) {
                if (entryPersonsLocalizations.getValue().contains(localization)) {
                    entryPersonsLocalizations.getKey().receiveWeatherAlert(weatherAlert);
                }
            }
        }
    }
