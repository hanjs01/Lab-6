/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-b05b57321 modeling language!*/



// line 1 "shoppingsys.ump"
public class Customer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Customer Attributes
  private String name;
  private String birthDate;
  private String address;
  private String city;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Customer(String aName, String aBirthDate, String aAddress, String aCity)
  {
    name = aName;
    birthDate = aBirthDate;
    address = aAddress;
    city = aCity;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setBirthDate(String aBirthDate)
  {
    boolean wasSet = false;
    birthDate = aBirthDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setAddress(String aAddress)
  {
    boolean wasSet = false;
    address = aAddress;
    wasSet = true;
    return wasSet;
  }

  public boolean setCity(String aCity)
  {
    boolean wasSet = false;
    city = aCity;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public String getBirthDate()
  {
    return birthDate;
  }

  public String getAddress()
  {
    return address;
  }

  public String getCity()
  {
    return city;
  }

  public void delete()
  {}

  // line 10 "shoppingsys.ump"
  public String name(){
    return name;
  }

  // line 15 "shoppingsys.ump"
  public String address(){
    return address;
  }

  // line 20 "shoppingsys.ump"
  public String birthDate(){
    return birthDate;
  }

  // line 25 "shoppingsys.ump"
  public String city(){
    return city;
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "birthDate" + ":" + getBirthDate()+ "," +
            "address" + ":" + getAddress()+ "," +
            "city" + ":" + getCity()+ "]";
  }
}