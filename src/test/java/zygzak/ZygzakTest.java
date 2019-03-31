package zygzak;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.*;

public class ZygzakTest {
    private final String zyg = "ZYG";
    private final String zak = "ZAK";
    private final String zygzak = "ZYG ZAK";

    Zygzak zygzaczek = new Zygzak();


    @Test
    public void shouldNotStartWhen0OrLessIsInput(){
        assertEquals(zygzaczek.start(0).get(0), "Invalid input");
    }

    @Test
    public void listShouldNotBeEmptyWithNumbers(){

        assertNotEquals(zygzaczek.start(5), "Invalid input");

    }

    @Test
    public void shouldAddCorrectNumbersToTheList(){

        assertEquals(zygzaczek.start(7).get(6), "7");

    }

    @Test
    public void shouldSayZygWhenDividingBy3IsPossible(){

        assertEquals(zygzaczek.start(5).get(2), zyg);

    }

    @Test
    public void shouldntSayZygWhenDividingBy3IsImpossible(){

        assertNotEquals(zygzaczek.start(5).get(3), zyg);


    }

    @Test
    public void shouldSayZakWhenDividingBy3IsPossible(){

        assertEquals(zygzaczek.start(5).get(4), zak);


    }

    @Test
    public void shouldntSayZakWhenDividingBy3IsImpossible(){

        assertNotEquals(zygzaczek.start(5).get(3), zak);

    }

    @Test
    public void shouldSayZigZakWhenBothDividingPossible(){

        assertEquals(zygzaczek.start(15).get(14), zygzak);

    }


}
