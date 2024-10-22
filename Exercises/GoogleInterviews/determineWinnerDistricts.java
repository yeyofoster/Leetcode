An election was recently held and it's time to count the votes. Votes are counted in two stages:
 
 1. Each voting district counts the votes in its district and ranks the candidates by total number of votes in the district.
 2. Only the top N candidates and their votes are reported to the central authority, who determines the final results across all districts.

The central authority either designates the winner of the election, or declares that it is impossible to determine a winner. 
The task is to implement the central authority algorithm and either designate the winner of the election or declare that it is impossible to determine the winner.

  
// Example 1: 2 districts, top (N=) 2 candidates reported.
//   Inputs to the central authority:
//     District A:
//       1. Candidate a = 10 votes
//       2. Candidate b = 8 votes
//     District B:
//       1. Candidate b = 6 votes
//       2. Candidate c = 2 votes
//   Output: Candidate b is the winner!
//  Candidate A: total 10; + possibly 2 votes from District B
//  Candidate B: Total 14; + possibly 0 votes
//  Candidate C: Total 2; + possily 8 votes from District A
  
// Example 2: 2 districts, top (N=) 2 candidates reported.
//   Inputs to the central authority:
//     District A:
//       1. Candidate a = 10 votes
//       2. Candidate b = 8 votes
//     District B:
//       1. Candidate b = 6 votes
//       2. Candidate c = 5 votes
//   Output: Impossible to determine a winner.
//   Reason:
//     While Candidate b has 14 votes, it's possible that Candidate a has 15
//     votes (10 from District A and 5 from District B), and so Candidate a or
//     Candidate b could be the winner.
  
Class District {
  // ID of the district
  int id;
  // Limited to the top N candidates in the district
  List<Candidate> candidates;
}

Class Candidate {
  // ID of the Candidate
  int id;
  // Number of votes
  int numVotes;
}

Input: List<District> districts

public String determineWinner(List<District> districts) {
  // 1. Determine all votes for every single candidate.
  HashMap candidateVotes = new HashMap<Integer, Integer>();
  
  for(District d : districts){
    for(Candidate candidate : d.candidates){
      if(candidateVotes.hasKey(candidate.id)){
        candidateVotes.put(candidate.id, candidateVotes.get(candidate.id) + candidate.numVotes);
      } else {
        candidateVotes.put(candidate.id. candidate.numVotes);
      }
    }
  }
  
  // 2. We have the votes for every single candidate in all districts.
  // 3. Determine a winner (if possible),
  int maxVotes = 0;
  int candidateId;
  for(Map.entry entry : candidateVotes.getEntries()){
    if(entry.value > maxVotes){
      maxVotes = entry.value;
      candidateId = entry.id;
    }
  }
  
  
  for(Map.entry entry : candidateVotes.getEntries()){
    if(entry.value == maxVotes){
      return "Impossible to determine a winner."
    }
  }
  
  return String.format("Candidate %d is the winner", candidateId);
}

// 1. Get the votes for each candidate in every single district.
// 2. Get the top N candidates for each district.
// 3. Determine a possible winner with the top N candidates for districts. 