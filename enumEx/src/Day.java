public enum Day {
  SUN(0, "Day Off"), MON(1, "Work Day"), TUE(2, "Work Day"), WED(3,
      "Work Day"), THU(4, "Work Day"), FRI(5, "Work Day"), SAT(6, "Day Off"),;

  public final int dayValue;
  public final String description;


  // constructor
  private Day(int dayValue, String description) {
    this.dayValue = dayValue;
    this.description = description;
  }

  public int getdayValue() { // constructor
    return this.dayValue;
  }

  public String getDescription() { // getter
    return this.description;
  }

  public boolean isWorkingDay() { // getter
    return this.getdayValue() != 0 && this.getdayValue() != 6;
  }

  public Day nextDay() {
    return values()[(this.ordinal() + 1) % values().length];
  }

  @Override
  public String toString() {
    return "Day(" //
        + "Day=" + this.dayValue //
        + ",Descript: " + this.description;
  }

  public static void main(String[] args) {
    for (Day day : Day.values()) {
      // System.out.println(day.name());
      if (!day.isWorkingDay()) {
        System.out.println(day.name());
      }
    }
  }
}
