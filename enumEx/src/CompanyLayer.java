public class CompanyLayer {

  public static void main(String[] args) {

    /*
     * EnumClass.name()
     */
    for (Company company : Company.values()) {
      System.out.println(company.toString());
    }

    // Company employee = Company.DEVELOPER;


    System.out.println(Company.CEO.isManagement());
  }
}
