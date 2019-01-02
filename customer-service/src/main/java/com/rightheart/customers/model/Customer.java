package com.rightheart.customers.model;


public class Customer{
  private String id;
  private String customerName;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }



  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }



  public Customer withId(String id){
    this.setId( id );
    return this;
  }


  public Customer withCustomerName(String customerName){
    this.setCustomerName(customerName);
    return this;
  }

}
