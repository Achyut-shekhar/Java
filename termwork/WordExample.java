class WordExample {
  private String strdata;
  public WordExample(String strdata) {
      strdata = strdata.trim().replaceAll("\\s+", " ");
      if (!strdata.endsWith(".") && !strdata.endsWith("?") && !strdata.endsWith("!")) {
          throw new IllegalArgumentException("Sentence must end with '.', '?' or '!'.");}
      this.strdata = strdata;}
  public void countWord() {
      String[] words = strdata.split(" ");
      int count = 0; 
      for (String word : words) {
          if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
              count++;}       }
      System.out.println("Number of words starting and ending with a vowel: " + count);} 
  public void placeWord() {
      String[] words = strdata.split(" ");
      StringBuilder vowelWords = new StringBuilder();
      StringBuilder otherWords = new StringBuilder();

      for (String word : words) {
          if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
              vowelWords.append(word).append(" ");
          } else {
              otherWords.append(word).append(" ");}      }
      System.out.println("Rearranged sentence: " + vowelWords.toString().trim() + " " + otherWords.toString().trim()); } 
  private boolean isVowel(char c) {
      c = Character.toUpperCase(c);        return "AEIOU".indexOf(c) != -1;}
  public static void main(String[] args) {
      try {
          WordExample we = new WordExample("INDIA IS A BEAUTIFUL COUNTRY AND IT IS FULL OF CULTURE! "); 
          we.countWord();
          we.placeWord();
      } catch (IllegalArgumentException e) {
          System.out.println(e.getMessage());}  }   }

