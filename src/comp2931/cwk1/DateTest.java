/** @author: Ryan Wan COMP2931 Coursework 1
 **/

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
  private Date newYear;
  private Date invalidDate;
  private Date test;

  @Before
  public void setUp() {
    middle = new Date(1975, 06, 15);
    lastYear = new Date(9999, 12, 31);
    newYear = new Date(2000, 01, 01);
  }

  @Test
  public void checkStringFormat() {
    assertThat(middle.toString(), is("1975-06-15"));
    assertThat(lastYear.toString(), is("9999-12-31"));
    assertThat(newYear.toString(), is("2000-01-01"));
  }

  @Test
  public void year() {
    assertThat(middle.getYear(), is(1975));
    assertThat(lastYear.getYear(), is(9999));
    assertThat(newYear.getYear(), is(2000));
  }


  @Test(expected=IllegalArgumentException.class)
  public void yearsTooLow() {
    new Date(0, 12, 15);
  }

  @Test(expected=IllegalArgumentException.class)
  public void yearsTooHigh() {
    new Date(10000, 12, 15);
  }

  @Test
  public void month() {
    assertThat(middle.getMonth(), is(06));
    assertThat(lastYear.getMonth(), is(12));
    assertThat(newYear.getMonth(), is(01));
  }

  @Test(expected=IllegalArgumentException.class)
  public void monthsTooLow() {
    new Date(2000, 0, 15);
  }

  @Test(expected=IllegalArgumentException.class)
  public void monthsTooHigh() {
    new Date(2000, 13, 15);
  }

  @Test
  public void day() {
    assertThat(middle.getDay(), is(15));
    assertThat(lastYear.getDay(), is(31));
    assertThat(newYear.getDay(), is(01));
  }

  @Test(expected=IllegalArgumentException.class)
  public void daysTooLow() {
    new Date(2000, 12, 0);
  }

  @Test(expected=IllegalArgumentException.class)
  public void daysTooHigh() {
    new Date(2000, 12, 32);
  }

  @Test(expected=IllegalArgumentException.class)
  public void checkValidDays() {
    invalidDate = new Date(2000, 04, 31);
    assertThat(invalidDate.getYear(), is(2000));
    assertThat(invalidDate.getMonth(), is(04));
    assertThat(invalidDate.getDay(), is(31));
  }

  @Test
  public void equality() {
    assertTrue(newYear.equals(newYear));
    assertTrue(newYear.equals(new Date(2000, 01, 01)));
    assertFalse(newYear.equals(new Date(2001, 01, 01)));
    assertFalse(newYear.equals(new Date(2000, 02, 01)));
    assertFalse(newYear.equals(new Date(2000, 01, 02)));
    assertFalse(newYear.equals("2000/01/01"));
  }

  @Test
  public void dayOfYear() {
    test = new Date(1975, 12, 31);
    assertThat(test.getDayofYear(), is(365));
  }
}
