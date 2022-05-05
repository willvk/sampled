package org.example.services;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.example.model.Ballot;
import org.example.model.Vote;

public class VoteCounter {
  private final Map<String, Integer> tally;

  public VoteCounter(List<String> candidateList) {
    tally = new HashMap<>();
    for (String candidate : candidateList)
    {
      tally.put(candidate, 0);
    }
  }

  public String tallyVotes(List<Ballot> ballots){
    for (Ballot ballot : ballots){
      for (Vote vote: ballot.getVotes())
      {
        int currentTotal = tally.get(vote.getCandidateName());
        tally.put(vote.getCandidateName(), currentTotal+vote.getOrder());
      }
    }
    return sortOutput(tally);
  }

  private String sortOutput(Map<String, Integer> tally){
     return tally.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(
         Collectors.toList()).toString();
  }
}
