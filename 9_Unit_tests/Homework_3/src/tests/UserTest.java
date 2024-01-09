import org.junit.Assert;
import org.junit.jupiter.api.Test;
import tdd.*;
public class UserTest {
    UserRepository repository = new UserRepository();
    @Test
    public void logOutIfNotAdmin(){
        User user1 = new User("user1", "qwerty", false);
        User user2 = new User("user1", "qwerty", true);
        repository.addUser(user1);
        repository.addUser(user2);
        UserRepository.logOutNotAdmin(repository);
        Assert.assertTrue(repository.getIsAdmin());

    }
}