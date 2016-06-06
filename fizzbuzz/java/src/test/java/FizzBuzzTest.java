import org.junit.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_return_fizz_if_dividable_by_3() {
        assertThat(FizzBuzz.getResult(3), is("fizz"));
        assertThat(FizzBuzz.getResult(6), is("fizz"));
    }

    @Test
    public void should_return_buzz_if_dividable_by_5() {
        assertThat(FizzBuzz.getResult(5), is("buzz"));
        assertThat(FizzBuzz.getResult(10), is("buzz"));
    }

    @Test
    public void should_return_fizzbuzz_if_dividable_by_15() {
        assertThat(FizzBuzz.getResult(15), is("fizzbuzz"));
    }

    @Test
    public void should_return_the_same_number_if_no_other_requirement_is_fulfilled() {
        assertThat(FizzBuzz.getResult(1), is("1"));
        assertThat(FizzBuzz.getResult(2), is("2"));
        assertThat(FizzBuzz.getResult(4), is("4"));
    }
}
