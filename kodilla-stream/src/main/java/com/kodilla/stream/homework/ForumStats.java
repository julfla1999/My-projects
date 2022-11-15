package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        double avgYoungerUsers = getAverageNumberOfPostOfYoungerUsers(UsersRepository.getUsersList());
        System.out.println(avgYoungerUsers);
        double avgOlderUsers = getAverageNumberOfPostOfOlderUsers(UsersRepository.getUsersList());
        System.out.println(avgOlderUsers);
    }

    public static double getAverageNumberOfPostOfYoungerUsers(List<User> usersRepositoryList) {
        double avg = usersRepositoryList
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return avg;
    }

    public static double getAverageNumberOfPostOfOlderUsers(List<User> usersRepositoryList) {
        double avg = usersRepositoryList
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return avg;
    }
}
