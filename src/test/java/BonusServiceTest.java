import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.BonusService;

public class BonusServiceTest {
    @Test
    public void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(1000, true);
        //System.out.println("1. " + expected + " == ? == " + actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(1_000_000, true);
        //System.out.println("2. " + expected + " == ? == " + actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateForNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 2000;
        boolean registered = false;
        long expected = 20;
        long actual = service.calculate(2000, false);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateForNotRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 50_001;
        boolean registered = false;
        long expected = 500;
        long actual = service.calculate(50_001, false);
        Assertions.assertEquals(expected, actual);
    }
}
