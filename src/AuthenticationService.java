import java.util.ArrayList;
import java.util.Objects;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

    // Add a constructor to initialize the users list with the default user
    public AuthenticationService(){
        users = new ArrayList<User>();
    }

    // Implement the signUp method to add a new user to the list if the username is not taken and return the user; returns null otherwise
    @Override
    public User signUp(String username, String password) {
        for (User user : users){
            if(Objects.equals(user.getUsername(), username)){
                return null;
            }
        }
        User create_user = new User(username, password);
        users.add(create_user);
        return create_user;

    }
    // Implement the logIn method to return the user if the username and password match, and null otherwise
    @Override
    public User logIn(String username, String password) {
        for (User user : users){
            if(user.getUsername().equals(username) & user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }



}
