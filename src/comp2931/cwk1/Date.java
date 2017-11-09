// COMP2931 Coursework 1

/**
 * Creates Date.class, which allows for a representation of any valid date in 
 * the form YYYY-MM-DD. Getter methods enables retrieval of the indivdual day, 
 * month, year or even day of year. It is also possible to compare dates to see 
 * if they are equal to each other.
 * 
 * @author Ryan Wan
 * @since  2017-11-08
 */
 
package comp2931.cwk1;


public class Date {

  private int year;
  private int month;
  private int day;

  /**
   * Creates a date using the given values for year, month and day. Also, limits 
   * are placed on each integer value so that they are valid.
   *
   * @param y Year
   * @param m Month
   * @param d Day
   * @exception IllegalArgumentException On invalid input.
   * @see IllegalArgumentException
   */
  public Date(int y, int m, int d) {
    year = y;
    month = m;
    day = d;

    // IllegalArgumentExceptions are thrown if Year, Month and Day exceed the
    // values specified
    if (year < 1 || year > 9999) {
      throw new IllegalArgumentException("Invalid year");
    }
    if (month < 1 || month > 12) {
      throw new IllegalArgumentException("Invalid month");
    }
    if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||
       month == 10 || month == 12) && (day < 1 || day > 31)) {
      throw new IllegalArgumentException("Invalid day for a 31-day month");
    }
    if ((month == 4 || month == 6 || month == 9 || month == 11) && (day < 1 ||
       day > 30)) {
      throw new IllegalArgumentException("Invalid day for a 30-day month");
    }
    if ((month == 2) && (day < 1 || day > 28)) {
      throw new IllegalArgumentException("Day does not exist in February");
    }
  }

  /**
   * Returns the year of the date.
   *
   * @return Year
   */
  public int getYear() {
    return year;
  }

  /**
   * Returns the month of the date.
   *
   * @return Month
   */
  public int getMonth() {
    return month;
  }

  /**
   * Returns the day of the date.
   *
   * @return Day
   */
  public int getDay() {
    return day;
  }

  /**
   * Returns the day of the year as an integer, based on a date given in the ISO
   * 8601 format (YYYY-MM-DD).
   *
   * @return dayOfYear
   */
  public int getDayofYear() {
    int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
    // January is 0 since there are no previous months to add
    int numFullMonthDays = 0;
    int month = this.getMonth();
    int daysInCurrentMonth = this.getDay();
    int dayOfYear;

    for (int counter = 0; counter < month; counter++) {
      numFullMonthDays = numFullMonthDays + daysInMonth[counter];
    // loops through array adding full month days until counter = month
    }
    dayOfYear = numFullMonthDays + daysInCurrentMonth;
    // adds the remaining partial days in the month specified
    return dayOfYear;
  }

  /**
   * Provides a string representation of this date.
   *
   * ISO 8601 format is used (YYYY-MM-DD).
   *
   * @return Date as a string in the format 
   */
  @Override
  public String toString() {
    return String.format("%04d-%02d-%02d", year, month, day);
    // Changed from "%04d-%02d-%2d"
  }

  /**
   * Tests whether a date is equal to another.
   *
   * <p>The two objects are considered equal if both are instances of
   * the Date class <em>and</em> both represent exactly the same date. This can 
   * be true even if one date pre-defined, as long the format and dates match up
   * correctly.
   *
   * @return True if this Date object is equal to the other, false otherwise
   */
  @Override
  public boolean equals(Object other) {
    if (other == this) {
      // if 'other' is same object as this one!
      return true;
    }
    else if (! (other instanceof Date)) {
      // if 'other' is not a Date object
      return false;
    }
    else {
      // Compare fields
      Date otherDate = (Date) other;
      return getYear() == otherDate.getYear()
          && getMonth() == otherDate.getMonth()
          && getDay() == otherDate.getDay();
    }
  }
}
