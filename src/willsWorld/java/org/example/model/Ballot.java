package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Ballot {
  private final ArrayList<Vote> votes;
  public Ballot(){
    votes = new ArrayList<>(3);
  }

  public List<Vote> getVotes() {
    return votes;
  }

  public void setVote(int index, Vote vote) {
    votes.add(index, vote);
  }
}
