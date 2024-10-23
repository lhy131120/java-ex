public enum WeekdayEnum {
  SUN(0), MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6),;

  public final int dayValue;

  private WeekdayEnum(int dayValue) {
    this.dayValue = dayValue;
  }
}
