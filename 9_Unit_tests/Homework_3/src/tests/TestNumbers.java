import numbers.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestNumbers {

    @ParameterizedTest
    @ValueSource (ints = {2,4,22,98})
    public void checkEvenNumber (int num){
        Assertions.assertTrue(Numbers.evenOddNumber(num));
    }

    @ParameterizedTest
    @ValueSource (ints = {3,7,29,99})
    public void checkNotEvenNumber (int num){
        Assertions.assertFalse(Numbers.evenOddNumber(num));
    }

    @ParameterizedTest
    @ValueSource (ints = {25,29,100})
    public void checkInterval (int num){
        Assertions.assertTrue(Numbers.numberInInterval(num));
    }

}
