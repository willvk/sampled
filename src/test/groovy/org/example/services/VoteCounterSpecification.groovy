package org.example.services

import org.example.model.Ballot
import org.example.model.Vote
import spock.lang.Specification

import java.lang.reflect.Array

class VoteCounterSpecification extends Specification{

    def "two candidates 2 ballots"() {
        given:
        def candidates = ["John Gray", "Frank Blue"]
        def vc = new VoteCounter(candidates)
        def firstBallot = new Ballot()
        firstBallot.setVote(0, new Vote(1, "Frank Blue"))
        firstBallot.setVote(1, new Vote(2, "Frank Blue"))
        firstBallot.setVote(2, new Vote(3, "Frank Blue"))
        def secondBallot = new Ballot()
        secondBallot.setVote(0, new Vote(1, "Frank Blue"))
        secondBallot.setVote(1, new Vote(2, "Frank Blue"))
        secondBallot.setVote(2, new Vote(3, "John Gray"))
        def ballots = [firstBallot, secondBallot]

        when:
        String result = vc.tallyVotes(ballots)

        then:
        assert result == "[Frank Blue=9, John Gray=3]"


    }
}
