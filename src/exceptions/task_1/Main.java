import java.util.Scanner;

public class Main {
        public static User[] getUsers() {
            User user1 = new User("john", "pass1", "jhon@gmail.com", 24);
            User user2 = new User("kris", "pass2", "kris@gmail.com", 35);
            User user3 = new User("loco", "pass3", "loco@gmail.com", 22);
            User user4 = new User("gray", "pass4", "gray@gmail.com", 33);
            User user5 = new User("tracy", "pass5", "tracy@gmail.com", 40);
            return new User[] {user1, user2, user3, user4, user5};
        };

        public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
            User[] users = getUsers();
            for (User user : users) {
                if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                    return user;
                }
            }
            throw new UserNotFoundException("User not found");
        }

        public static void validateUser(User user) throws AccessDeniedException {
            if (user.getAge() < 18) {
                throw new AccessDeniedException("User's age is less than 18");
            }
        }

        public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter login:");
            String login = scanner.nextLine();
            System.out.println("Enter password:");
            String password = scanner.nextLine();

            User user = getUserByLoginAndPassword(login, password);
            validateUser(user);

            System.out.println("Access is provided.");
        }

}
