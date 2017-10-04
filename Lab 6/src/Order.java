/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-b05b57321 modeling language!*/



// line 31 "shoppingsys.ump"
public class Order
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Order Attributes
  private String orderDate;
  private String shipDate;
  private String numShipDays;
  private String shippingCompName;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Order(String aOrderDate, String aShipDate, String aNumShipDays, String aShippingCompName)
  {
    orderDate = aOrderDate;
    shipDate = aShipDate;
    numShipDays = aNumShipDays;
    shippingCompName = aShippingCompName;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setOrderDate(String aOrderDate)
  {
    boolean wasSet = false;
    orderDate = aOrderDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setShipDate(String aShipDate)
  {
    boolean wasSet = false;
    shipDate = aShipDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setNumShipDays(String aNumShipDays)
  {
    boolean wasSet = false;
    numShipDays = aNumShipDays;
    wasSet = true;
    return wasSet;
  }

  public boolean setShippingCompName(String aShippingCompName)
  {
    boolean wasSet = false;
    shippingCompName = aShippingCompName;
    wasSet = true;
    return wasSet;
  }

  public String getOrderDate()
  {
    return orderDate;
  }

  public String getShipDate()
  {
    return shipDate;
  }

  public String getNumShipDays()
  {
    return numShipDays;
  }

  public String getShippingCompName()
  {
    return shippingCompName;
  }

  public void delete()
  {}

  // line 41 "shoppingsys.ump"
  public String orderDate(){
    return orderDate;
  }

  // line 46 "shoppingsys.ump"
  public String shipDate(){
    return shipDate;
  }

  // line 51 "shoppingsys.ump"
  public String numShipDays(){
    return numShipDays;
  }

  // line 56 "shoppingsys.ump"
  public String shippingCompName(){
    return shippingCompName;
  }


  public String toString()
  {
    return super.toString() + "["+
            "orderDate" + ":" + getOrderDate()+ "," +
            "shipDate" + ":" + getShipDate()+ "," +
            "numShipDays" + ":" + getNumShipDays()+ "," +
            "shippingCompName" + ":" + getShippingCompName()+ "]";
  }
}