package stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        processUsersStream();
        List<String> chemistGroupUsernames = filterChemistGroupsUsernames();
        System.out.println(chemistGroupUsernames);
        List<User> olderUsers = filterUsersWithCertainAge(55);
        System.out.println(olderUsers);
        List<String> usersWithNoPosts = filterUsersWithNoPosts();
        System.out.println(usersWithNoPosts);

    }
    public static String getUserName(User user) {
        return user.getUsername();
    }

    private static void processUsersStream() {
        UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .forEach(username -> System.out.println(username));
    }

    public static List<String> filterChemistGroupsUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }

    public static List<User> filterUsersWithCertainAge(int age) {
        List<User> users = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
        return users;
    }

    public static List<String> filterUsersWithNoPosts() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() == 0)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;

    }
}
