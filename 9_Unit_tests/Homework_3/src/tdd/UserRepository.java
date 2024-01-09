package tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    List<User> data = new ArrayList<>();

    public void addUser(User user) {

    }
    public boolean getIsAdmin() {
        for (User user : data)
            return user.isAdmin;
        return false;
    }

    public static void logOutNotAdmin(UserRepository repository){

        for (int n = 1; n <= repository.data.size(); n++){
            if (!repository.data.get(n).isAdmin){
                repository.data.remove(n);
            }
        }
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

}