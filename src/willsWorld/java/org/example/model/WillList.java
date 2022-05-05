package org.example.model;

import java.util.List;

public class WillList {
  private List<Integer> items;

  public WillList(List<Integer> q){
    items = q;
  }
  public boolean add(Integer item){
    items.add(item);
    return true;
  }
  public List<Integer> getItems() {
    return items;
  }
}
