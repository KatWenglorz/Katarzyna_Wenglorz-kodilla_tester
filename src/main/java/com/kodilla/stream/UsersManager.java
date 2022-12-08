package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
        List<String> ageGroupUsernames = filterAgeGroupUsernames(45);
        System.out.println(ageGroupUsernames);
        List<String> usersWithZeroPost = filterUsersWithZeroPost();
        System.out.println(usersWithZeroPost);
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }
    public static List<String> filterAgeGroupUsernames(int userAge) {
        List<String> ageUsernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > userAge)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return ageUsernames;
    }
    public static List<String> filterUsersWithZeroPost() {
        List<String> usersZeroPost = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() == 0)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usersZeroPost;

    }

    public static String getUserName(User user) {
        return user.getUsername();
    }


}