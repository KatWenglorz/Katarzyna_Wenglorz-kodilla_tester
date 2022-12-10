package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {
    @Test
    public void testAverageNumberOfPostsOfUsersUnder40() {
        //given
        List<User> usersList = new ArrayList<>();
        usersList.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        usersList.add(new User("Walter White", 50, 7, "Chemists"));
        //when
        double result = ForumStats.averageNumberOfPostsOfUsersUnder40(usersList);
        //then
        double expected = 4648;
        assertEquals(result, expected);
    }

    @Test
    public void testAverageNumberOfPostsOfUsersOver40() {
        //given
        List<User> usersList = new ArrayList<>();
        usersList.add(new User("Walter White", 50, 8, "Chemists"));
        usersList.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        usersList.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        //when
        double result = ForumStats.averageNumberOfPostsOfUsersOver40(usersList);
        //then
        double expected = 4;
        assertEquals(result, expected);
    }
}