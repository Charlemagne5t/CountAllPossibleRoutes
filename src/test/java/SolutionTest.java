import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void countRoutesTest1() {
        int[] locations = {2, 3, 6, 8, 4};
        int start = 1;
        int finish = 3;
        int fuel = 5;
        int expected = 4;
        int actual = new Solution().countRoutes(locations, start, finish, fuel);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countRoutesTest2() {
        int[] locations = {4, 3, 1};
        int start = 1;
        int finish = 0;
        int fuel = 6;
        int expected = 5;
        int actual = new Solution().countRoutes(locations, start, finish, fuel);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countRoutesTest3() {
        int[] locations = {5, 2, 1};
        int start = 0;
        int finish = 2;
        int fuel = 3;
        int expected = 0;
        int actual = new Solution().countRoutes(locations, start, finish, fuel);
        Assert.assertEquals(expected, actual);
    }
}
