public enum Company {
  CEO("CEO", 1), MANAGER("MANAGER", 2), TEAM_LEAD("TEAM LEAD", 3), DEVELOPER(
      "DEVELOPER", 4), QA_ENGINEER("QA ENGINEER", 5), HR("HUMAN RESOURCES",
          6), MARKETING("MARKETING", 7), SALES("SALES",
              8), FINANCE("FINANCE", 9), INTERN("INTERN TRAINEE", 10);

  private final String title;
  private final int level;

  /*
   * Constructor
   */
  Company(String title, int level) {
    this.title = title;
    this.level = level;
  }

  /*
   * Getter Title
   */

  public String getTitle() {
    return this.title;
  }

  /*
   * Getter Position
   */
  public int getPosition() {
    return this.level;
  }

  public boolean isManagement() {
    return level <= 3;
  }

  @Override
  public String toString() {
    return "(ENUM name: " + this.name() + ", Title: " + this.getTitle()
        + ", Level: " + this.getPosition() + ")";
  }

  public static Company get(int level) {
    for (Company company : Company.values()) {
      if (level == company.getPosition())
        return company;
    }
    return null;
  }

  public static int get(Company company) {
    return company.getPosition();
  }


  public static void main(String[] args) {
    System.out.println(Company.get(1));
  }

}
