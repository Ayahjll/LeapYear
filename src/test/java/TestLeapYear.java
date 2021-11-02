import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLeapYear {
    @Test
    public void isNotLeapYear () {
        Assertions.assertEquals(false, LeapYear.isLeapYear(1700));
        Assertions.assertEquals(false, LeapYear.isLeapYear(1800));
        Assertions.assertEquals(false, LeapYear.isLeapYear(1900));
        Assertions.assertEquals(false, LeapYear.isLeapYear(2100));
    }

    @Test
    public void isLeapYear () {
        Assertions.assertEquals(true, 2000);
        Assertions.assertEquals(true, 2020);
    }
}

