/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-b05b57321 modeling language!*/



// line 60 "shoppingsys.ump"
public class Account
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Account Attributes
  private int accountNum;
  private String email;
  private long ccNum;
  private double amountCharged;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Account(int aAccountNum, String aEmail, long aCcNum, double aAmountCharged)
  {
    accountNum = aAccountNum;
    email = aEmail;
    ccNum = aCcNum;
    amountCharged = aAmountCharged;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setAccountNum(int aAccountNum)
  {
    boolean wasSet = false;
    accountNum = aAccountNum;
    wasSet = true;
    return wasSet;
  }

  public boolean setEmail(String aEmail)
  {
    boolean wasSet = false;
    email = aEmail;
    wasSet = true;
    return wasSet;
  }

  public boolean setCcNum(long aCcNum)
  {
    boolean wasSet = false;
    ccNum = aCcNum;
    wasSet = true;
    return wasSet;
  }

  public boolean setAmountCharged(double aAmountCharged)
  {
    boolean wasSet = false;
    amountCharged = aAmountCharged;
    wasSet = true;
    return wasSet;
  }

  public int getAccountNum()
  {
    return accountNum;
  }

  public String getEmail()
  {
    return email;
  }

  public long getCcNum()
  {
    return ccNum;
  }

  public double getAmountCharged()
  {
    return amountCharged;
  }

  public void delete()
  {}

  // line 70 "shoppingsys.ump"
  public int accountNum(){
    return accountNum;
  }

  // line 75 "shoppingsys.ump"
  public String email(){
    return email;
  }

  // line 80 "shoppingsys.ump"
  public long ccNum(){
    return ccNum;
  }

  // line 85 "shoppingsys.ump"
  public double amountCharged(){
    return amountCharged;
  }


  public String toString()
  {
    return super.toString() + "["+
            "accountNum" + ":" + getAccountNum()+ "," +
            "email" + ":" + getEmail()+ "," +
            "ccNum" + ":" + getCcNum()+ "," +
            "amountCharged" + ":" + getAmountCharged()+ "]";
  }
}