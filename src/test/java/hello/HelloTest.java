package hello;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;

import static org.junit.jupiter.api.Assertions.*;

public class HelloTest {
    Hello welcomer = new Hello();

    @Test
    public void shouldSayHello(){
        assertEquals(welcomer.sayHello("John"), String.format("Hello, %s.", "John"));
    }

    @Test
    public void shouldHandleEmpty(){
        assertEquals(welcomer.sayHello(""), "You cannot provide an empty name.");
    }

    @Test
    public void shouldNotGreetNumber(){
        assertNotEquals(welcomer.sayHello("1"), "Hello, 1.");
        assertEquals(welcomer.sayHello("5"), "Sorry, can't use numbers.");
    }

    @Test
    public void shouldHandleNull(){
        NullPointerException myThrowable = assertThrows(NullPointerException.class, welcomer::sayHello);
        assert(myThrowable.getMessage().equals("Null name..."));
      //  assertNull(welcomer.sayHello("Null name..."));
    }

    @Test
    public void shouldGreetJanInPolishAndCapitalLetters(){
        assertTrue(welcomer.sayHello("Jan").contains("WITAJ, JAN!"));
    }

    @Test
    public void shouldNotUseShortPolishNames(){
        assertFalse(welcomer.sayHello("Janek").contains("WITAJ, JANEK!"));
    }
}
