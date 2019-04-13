import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


@RunWith(JUnitParamsRunner.class)
public class FizzBuzzTest {

    @Test
    @Parameters({
            "1,1",
            "2,2"
    })
    public void shouldConvertInputToExpectedValue(int input, String expectedOutput) {
        //GIVEN
        FizzBuzz fizzBuzz = new FizzBuzz();

        //WHEN
        String output = fizzBuzz.getString(input);

        //THEN
        assertThat(output, equalTo(expectedOutput));
    }
}