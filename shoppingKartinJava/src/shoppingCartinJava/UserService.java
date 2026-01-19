package shoppingKartinJava;
public class UserService {
    public User findUser(String username) {
        return UserDatabase.users.get(username.toLowerCase()); }
    public User registerUser(String username, String email, String password) {
        User newUser = new User(username, email, password);
        UserDatabase.users.put(username.toLowerCase(), newUser);
        return newUser;
    }
}
