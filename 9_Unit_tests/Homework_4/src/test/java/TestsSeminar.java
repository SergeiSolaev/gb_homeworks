import card.CreditCard;
import card.PaymentForm;
import weather.WeatherService;
import weather.WeatherReporter;
import org.junit.*;
import java.util.Iterator;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;


public class TestsSeminar {

    @Test
    public void iterTest1(){

        Iterator iterator = mock(Iterator.class);
        when(iterator.next()).thenReturn("Hello").thenReturn("World");
        String result = iterator.next() + " " + iterator.next();
        assertThat(result).isEqualTo("Hello World");
    }

    @Test
    public void cardTest(){
        CreditCard mockCard = mock(CreditCard.class);
        when(mockCard.getCardNumber()).thenReturn("1234");
        when(mockCard.getCardHolder()).thenReturn("Sergei");
        when(mockCard.getExpiryDate()).thenReturn("12.12.2023");
        when(mockCard.getCvv()).thenReturn("123");
        PaymentForm paymentForm = new PaymentForm(mockCard);
        paymentForm.pay(100);
        verify(mockCard, times(1)).charge(100);

    }

    @Test
    public void weatherTest(){
        WeatherService mockWeatherService = mock(WeatherService.class);
        when(mockWeatherService.getCurrentTemperature()).thenReturn(22);
        WeatherReporter wheatherReporter = new WeatherReporter(mockWeatherService);
        String result = wheatherReporter.generateReport();
        assertThat(result).isEqualTo("Текущая температура: " + 22 + " градусов.");
    }

}
