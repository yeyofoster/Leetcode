/**
Given a list of all names in the world, we need to suggest the lesser used names for newborns. Output the current least used name whenever someone requests a name for their newborn child.

Eg. Names = [Alice, Bob, Doug, Bob, Melissa, Steven, Steven, Melissa, Doug, Melissa, Doug, Doug, Steven]

Output: Alice
Alice -> 2
Bob -> 2
Output: (Bob, Alice)
Alice -> 3
Bob -> 3
*/

// 1. Iterate through all the names array to find frequencies.

public LesserNames {
  String [] names;
  HashMap frequencies;
  
  {
    Bob: frequency
    ...
  }
  
  public LesserNames() {
    this.names = [Alice, Bob, Doug, Bob, Melissa, Steven, Steven, Melissa, Doug, Melissa, Doug, Doug, Steven];
    this.frequencies = new HashMap<String, Integer>();
  }
  
  public String getLesserName() {
    
    // 2. HashMap to store frequencies for each name.
    for(String name : this.names){
      if(this.frequencies.hasKey(name)){
        this.frequencies.put(name, this.frequencies.get(name) + 1);
      } else {
        this.frequencies.put(name, 1);
      }  
    }
    //We already have frequencies for each name
    
    // 3. Search in the HashMap to get the names with the lesse frecquency.
    int lessFrequency = this.names.length;
    String name = "";
    for(Map.entry entry : frequencies.getEntries()){
      // 4 > Bob.frequency
      if(lessFrequency > entry.value){
        name = entry.key;
        lessFrequency = entry.value;
        entry.value = entry.value + 1;
      }
    }
    
    return name;
  }
}
