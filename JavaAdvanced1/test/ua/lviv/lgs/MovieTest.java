package ua.lviv.lgs;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.TestWatcher;

class MovieTest {

    @Rule
    public TestWatcher testWatcher = new TestWatcher() {
        protected void succeeded(org.junit.runner.Description description) {
            System.out.println("Executing " + description.getMethodName() + "... SUCCEED!");
        };

        protected void failed(Throwable exception, org.junit.runner.Description description) {
            System.out.println("Executing " + description.getMethodName() + "... FAILED!");
        };
    };

    Time time;
    Movie movie = new Movie("Test",time);

    @Before
    public void beforeTest(){
        Time time = new Time(30,1);

    }

    @After
    public void afterTest() {
        movie = null;
    }

    @Test
    public void getTitle() {
        String realData = movie.getTitle();
        String expectedValue = "Test";
        Assert.assertEquals(realData,expectedValue);
    }
}