package com.ubs.opsit.interviews;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by vagha_000 on 21-Jul-15.
 */
public class TimeConverterTest {

    private TimeConverter berlinClock;

    @Before
    public void init() {
        berlinClock = new TimeConverterImpl();
    }


    @Test
    public void testBerlinClockConverterOKFirstCase() {
        String time = berlinClock.convertTime("23:12:45");
        assertNotNull(time);
        assertEquals("O\r\n" + "RRRR\r\n" + "RRRO\r\n" + "YYOOOOOOOOO\r\n" + "YYOO", time);
    }


    @Test
    public void testBerlinClockConverterOKSecondCase() {
        String time = berlinClock.convertTime("02:25:22");
        assertNotNull(time);
        assertEquals("Y\r\n" + "OOOO\r\n" + "RROO\r\n" + "YYRYYOOOOOO\r\n" + "OOOO", time);
    }


    @Test
    public void testBerlinClockConverterOKThirdCase() {
        String time = berlinClock.convertTime("07:08:09");
        assertNotNull(time);
        assertEquals("O\r\n" + "ROOO\r\n" + "RROO\r\n" + "YOOOOOOOOOO\r\n" + "YYYO", time);
    }


    @Test
    public void testBerlinClockConverterOKForthCase() {
        String time = berlinClock.convertTime("13:01:59");
        assertNotNull(time);
        assertEquals("O\r\n" + "RROO\r\n" + "RRRO\r\n" + "OOOOOOOOOOO\r\n" + "YOOO", time);
    }


    @Test
    public void testBerlinClockConverterOKFifthCase() {
        String time = berlinClock.convertTime("16:47:59");
        assertNotNull(time);
        assertEquals("O\r\n" + "RRRO\r\n" + "ROOO\r\n" + "YYRYYRYYROO\r\n" + "YYOO", time);
    }


    @Test
    public void testBerlinClockConverterOKSixthCase() {
        String time = berlinClock.convertTime("20:33:12");
        assertNotNull(time);
        assertEquals("Y\r\n" + "RRRR\r\n" + "OOOO\r\n" + "YYRYYROOOOO\r\n" + "YYYO", time);
    }


    @Test
    public void testBerlinClockConverterOKSeventhCase() {
        String time = berlinClock.convertTime("24:59:08");
        assertNotNull(time);
        assertEquals("Y\r\n" + "RRRR\r\n" + "RRRR\r\n" + "YYRYYRYYRYY\r\n" + "YYYY", time);
    }


    @Test(expected = RuntimeException.class)
    public void testBerlinClockConverterInvalidFormat() {
        berlinClock.convertTime("23:12:456");
    }


    @Test(expected = RuntimeException.class)
    public void testBerlinClockConverterInvalidFormatSecondCase() {
        berlinClock.convertTime("25:12:45");
    }
}
