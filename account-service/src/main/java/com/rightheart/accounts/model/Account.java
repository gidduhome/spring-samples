package com.rightheart.accounts.model;


public class Account{
  private String id;
  private String customerId;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }



  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }



  public Account withId(String id){
    this.setId( id );
    return this;
  }


  public Account withCustomerId(String customerId){
    this.setCustomerId(customerId);
    return this;
  }

}
