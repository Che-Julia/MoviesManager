import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {


    @Test
    public void addMovie() {
        MoviesManager manager = new MoviesManager();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");

        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void overLimit() {
        MoviesManager manager = new MoviesManager(5);
        manager.add("Film 11");
        manager.add("Film 11");
        manager.add("Film 11");
        manager.add("Film 11");
        manager.add("Film 11");
        manager.add("Film 11");
        manager.add("Film 11");
        manager.add("Film 11");
        manager.add("Film 11");
        manager.add("Film 11");

        int expected = 5;
        int actual = manager.findLast().length;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessThanLimit() {
        MoviesManager manager = new MoviesManager(5);
        manager.add("Film 11");
        manager.add("Film 11");
        manager.add("Film 11");

        String[] expected = {"Film 11", "Film 11", "Film 11"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void sortTest() {
        MoviesManager manager = new MoviesManager();
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");

        String[] expected = {"Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

