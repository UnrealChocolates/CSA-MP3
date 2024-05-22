import java.util.*;

public class WordChecker {

  private ArrayList<String> wordList;

  public WordChecker(ArrayList<String> words){
    wordList = words;
  }

  public boolean isWordChain() {
    for (int i = 1; i < wordList.size(); i++){
      String word = wordList.get(i);
      String nextWord = wordList.get(i-1);
      if (word.indexOf(nextWord) == -1){
        return false;
      } else {
        return true;
      }
    }
  }

  public ArrayList<String> createList(String target) {
    ArrayList<String> list = new ArrayList<String>();
    for (String i : wordList){
      int index = i.indexOf(target);
      if (index == 0){
        list.add(i.substring(target.length()));
      }
    }

    return list;
  }
}
