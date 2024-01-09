import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class Test
{
    public static void test(){
        assertThat(Calculator.calculateDiscount(100, 50)).isEqualTo(50);
        assertThat(Calculator.calculateDiscount(100, 100)).isEqualTo(0);
        assertThat(Calculator.calculateDiscount(100, 0)).isEqualTo(100);
        assertThatThrownBy(() -> Calculator.calculateDiscount(-100, 50))
                .isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> Calculator.calculateDiscount(100, 110))
                .isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> Calculator.calculateDiscount(100, -10))
                .isInstanceOf(ArithmeticException.class);
    }

}
