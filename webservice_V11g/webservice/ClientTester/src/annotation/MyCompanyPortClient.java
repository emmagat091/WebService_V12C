package annotation;
// This source file is generated by Oracle tools.
// Contents may be subject to change.
// For reporting problems, use the following:
// Generated by Oracle JDeveloper 11g Release 2 11.1.2.4.0.6436

public class MyCompanyPortClient
{
  public static void main(String [] args)
  {
    MyCompanyWS myCompanyWS = new MyCompanyWS();
    MyCompany myCompany = myCompanyWS.getMyCompanyPort();
    // Add your code to call the desired methods.

        Dept dept;
        dept = myCompany.getDeptInfo(10);
        System.out.println(dept.getName() + " is at " + dept.getLocation());
  }
}
