package comp2931.cwk1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


/**
 * Unit tests for the Date class
 */

public class DateTest {

  private Date middle;
  private Date lastYear;
  private Date newYearsEve;
  private Date wrongDays;

  @Before
  public void setUp() {
    middle = new Date(1975, 06, 15);
    lastYear = new Date(9999, 12, 31);
    newYearsEve = new Date(1999, 12, 31);
  }

  @Test
  public void checkStringFormat() {
    assertThat(middle.getYear(), is(1975));
    assertThat(middle.getMonth(), is(06));
    assertThat(middle.getDay(), is(15));
  }

  @Test(expected=IllegalArgumentException.class)
  public void checkValidDays() {
    Date wrongDays = new Date(2000, 04, 31);
    assertThat(wrongDays.getYear(), is(2000));
    assertThat(wrongDays.getMonth(), is(04));
    assertThat(wrongDays.getDay(), is(31));
  }

  @Test(expected=IllegalArgumentException.class)
  public void yearsTooLow() {
    new Date(0, 12, 15);
  }

  @Test(expected=IllegalArgumentException.class)
  public void yearsTooHigh() {
    new Date(10000, 12, 15);
  }

  @Test(expected=IllegalArgumentException.class)
  public void monthsTooLow() {
    new Date(2000, 0, 15);
  }

  @Test(expected=IllegalArgumentException.class)
  public void monthsTooHigh() {
    new Date(2000, 13, 15);
  }

  @Test(expected=IllegalArgumentException.class)
  public void daysTooLow() {
    new Date(2000, 12, 0);
  }

  @Test(expected=IllegalArgumentException.class)
  public void daysTooHigh() {
    new Date(2000, 12, 32);
  }

  @Test
  public void equality() {
    assertTrue(newYearsEve.equals(newYearsEve));
    assertTrue(newYearsEve.equals(new Date(1999, 12, 31)));
    assertFalse(newYearsEve.equals(new Date(2000, 12, 31)));
    assertFalse(newYearsEve.equals(new Date(1999, 1, 31)));
    assertFalse(newYearsEve.equals(new Date(1999, 12, 1)));
    assertFalse(newYearsEve.equals("1999/12/31"));
  }
}
