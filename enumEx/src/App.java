public class App {
  public static void main(String[] args) {
    WeekdayEnum day = WeekdayEnum.SUN;

    if (day.dayValue == 6 || day.dayValue == 0) {
      System.out.println("Today is: " + day + ". At Home");
    } else {

      System.out.println("Today is: " + day + ". At Affice");;
    }
  }
}
