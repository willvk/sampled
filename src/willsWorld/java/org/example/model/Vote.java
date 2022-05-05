package org.example.model;

public class Vote {
  public Vote(int order, String name){
    candidateName = name;
    this.order = order;
  }

  public String getCandidateName() {
    return candidateName;
  }

  public void setCandidateName(String candidateName) {
    this.candidateName = candidateName;
  }

  // order means the weight
  public int getOrder() {
    return order;
  }

  public void setOrder(int order) {
    this.order = order;
  }

  private String candidateName;
  private int order;

}
