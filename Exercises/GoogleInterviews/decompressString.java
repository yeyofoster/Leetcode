/* cSpell:disable */
// Write a function to decompress a string from an encoded format. For example:

"a(bcd){3}e" -> "abcdbcdbcde"
"a(bc(d){4}e){3}f"-> "abcddddebcddddebcddddef"

// A group of characters surrounded by parentheses should be repeated by the number in the following curly braces.
  
// 1. Iterate through all the string to read every single character.
public String decompressString(String comp){
  StringBuilder sb = new StringBuilder();
  
  int times = 1;
  String currentGroup;
  for(int i = 0; i < comp.length ; i++){
    if(comp.charAt(i) == '('){
      group = getGroupedChars(i, comp);
      i += group.length;
    } else if (comp.charAt(i) == '{'){
        
      sb.append();
    }
  }

}

public String getGroupedChars(int start, String comp){
  String groupedChars = "";
  int times = 1;
  for(int i = start; i < comp.length ; i++){
    if(comp.charAt(i) == '('){
      groupedChars += getGroupedChars(i, comp)
    } else if (comp.charAt(i) == ')'){
      return groupedChars;
    } else {
      groupedChars += comp.charAt(i);
    }
  }
  return groupedChars;
}