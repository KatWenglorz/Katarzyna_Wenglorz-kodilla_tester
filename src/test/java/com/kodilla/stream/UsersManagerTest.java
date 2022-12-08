package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {
    @Test
    public void testFilterChemistGroupUsernames() {
        //given
        UsersManager usersManager = new UsersManager();
       UsersRepository.getUsersList().add(new User("Walter White", 50, 7, "Chemists"));
       UsersRepository.getUsersList().add(new User("Jessie Pinkman", 25, 4648, "Sales"));
       UsersRepository.getUsersList().add(new User("Tuco Salamanca", 34, 116, "Manager"));
       UsersRepository.getUsersList().add(new User("Gus Firing", 49, 0, "Board"));
       UsersRepository.getUsersList().add(new User("Gale Boetticher", 44, 2, "Chemists"));
       UsersRepository.getUsersList().add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        //when
        List<String> result = UsersManager.filterChemistGroupUsernames();
        //then
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Walter White");
        expectedList.add("Gale Boetticher");
        assertEquals(result, expectedList);
    }
    @Test
    public void testFilterAgeGroupUsernames() {
        //given
        UsersRepository.getUsersList().add(new User("Walter White", 50, 7, "Chemists"));
        UsersRepository.getUsersList().add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        UsersRepository.getUsersList().add(new User("Tuco Salamanca", 34, 116, "Manager"));
        UsersRepository.getUsersList().add(new User("Gus Firing", 49, 0, "Board"));
        UsersRepository.getUsersList().add(new User("Gale Boetticher", 44, 2, "Chemists"));
        UsersRepository.getUsersList().add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        //when
        List<String> result1 = UsersManager.filterAgeGroupUsernames(45);
        //then
        List<String> expectedList1 = new ArrayList<>();
        expectedList1.add("Walter White");
        expectedList1.add("Gus Firing");
        expectedList1.add("Mike Ehrmantraut");
        assertEquals(result1, expectedList1);
    }
    @Test
    public void testFilterUsersWithZeroPost() {
        //given
        UsersRepository.getUsersList().add(new User("Walter White", 50, 7, "Chemists"));
        UsersRepository.getUsersList().add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        UsersRepository.getUsersList().add(new User("Tuco Salamanca", 34, 116, "Manager"));
        UsersRepository.getUsersList().add(new User("Gus Firing", 49, 0, "Board"));
        UsersRepository.getUsersList().add(new User("Gale Boetticher", 44, 2, "Chemists"));
        UsersRepository.getUsersList().add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        //when
        List<String> result2 = UsersManager.filterUsersWithZeroPost();
        //then
        List<String> expectedList2 = new ArrayList<>();
        expectedList2.add("Gus Firing");
        expectedList2.add("Mike Ehrmantraut");
        assertEquals(result2, expectedList2);
    }
}