package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ForumStats {
    public static void main(String[] args) {
        System.out.println(averageNumberOfPostsOfUsersUnder40(UsersRepository.getUsersList()));
        System.out.println(averageNumberOfPostsOfUsersOver40(UsersRepository.getUsersList()));
    }
    public static double averageNumberOfPostsOfUsersUnder40(List<User> usersList) {
       double avg = usersList
        .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
               .average()
               .getAsDouble();
       return avg;
    }
    public static double averageNumberOfPostsOfUsersOver40(List<User> usersList) {
        double avg1 = usersList
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return avg1;
    }

}
