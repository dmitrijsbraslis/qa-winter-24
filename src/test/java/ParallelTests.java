import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
public class ParallelTests {
    @Test
    public void firstTest() {
        System.out.println("This is First Test");
    }

    @Test
    public void secondTest() {
        System.out.println("This is second test");
    }
}
