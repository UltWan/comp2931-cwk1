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
  private Date millenium;
  private Date newYearsEve;

  @Before
  public void setUp() {
    middle = new Date(1975, 06, 15);
    millenium = new Date(2000, 01, 01);
    newYearsEve = new Date(1999, 12, 31);
  }

  @Test
  public void checkStringFormat() {
    Date middle = new Date(1975, 06, 15);
    assertThat(middle.getYear(), is(1975));
    assertThat(middle.getMonth(), is(06));
    assertThat(middle.getDay(), is(15));
  }


}
