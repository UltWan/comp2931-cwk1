/** @author: Ryan Wan COMP2931 Coursework 1
 **/
 
package comp2931.cwk1;

/**
 * Simple representation of a date.
 */
public class Date {

  private static final int DAYS_31 = 31;
  private static final int DAYS_30 = 30;
  private static final int FEB = 28;

  private int year;
  private int month;
  private int day;

  /**
   * Creates a date using the given values for year, month and day.
   *
   *
   * @param y Year
   * @param m Month
   * @param d Day
   */
  public Date(int y, int m, int d) {
    year = y;
    month = m;
    day = d;


    // IllegalArgumentException are thrown if Year, Month and Day exceed the
    // values
    if (year < 1 || year > 9999) {
      throw new IllegalArgumentException("Invalid year");
    }

    if (month < 1 || month > 12) {
      throw new IllegalArgumentException("Invalid month");
    }

    if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||
       month == 10 || month == 12) && (day < 1 || day > 31)) {
      throw new IllegalArgumentException("Invalid days for 31-day month");
    }

    if ((month == 4 || month == 6 || month == 9 || month == 11) && (day < 1 ||
       day > 30)) {
      throw new IllegalArgumentException("Invalid days for 30-day month");
    }

    if ((month == 2) && (day < 1 || day > 28)) {
      throw new IllegalArgumentException("Day does not exist in February");
    }
  }

  /**
   * Returns the year component of this date.
   *
   * @return Year
   */
  public int getYear() {
    return year;
  }

  /**
   * Returns the month component of this date.
   *
   * @return Month
   */
  public int getMonth() {
    return month;
  }

  /**
   * Returns the day component of this date.
   *
   * @return Day
   */
  public int getDay() {
    return day;
  }

  /**
   * Returns the day component of this date.
   *
   * @return Day
   */
  public int getDayofYear() {

    int[] numberOfDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int dayOfYear = 0;
    int daysInMonth = this.getDay();
    int month = this.getMonth();

    for (int counter = 0; counter < month; counter++) {
      dayOfYear = dayOfYear + numberOfDays[counter];
    }
    dayOfYear = dayOfYear + daysInMonth;
    return dayOfYear;
  }

  /**
   * Provides a string representation of this date.
   *
   * ISO 8601 format is used (YYYY-MM-DD). Changed from "%04d-%02d-%2d"
   *
   * @return Date as a string
   */
  @Override
  public String toString() {
    return String.format("%04d-%02d-%02d", year, month, day);
  }

  /**
   * Tests whether this date is equal to another.
   *
   * <p>The two objects are considered equal if both are instances of
   * the Date class <em>and</em> both represent exactly the same date
   *
   * @return True if this Date object is equal to the other, false otherwise
   */
  @Override
  public boolean equals(Object other) {
    if (other == this) {
      // 'other' is same object as this one!
      return true;
    }
    else if (! (other instanceof Date)) {
      // 'other' is not a Date object
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
