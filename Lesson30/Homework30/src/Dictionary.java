public class Dictionary {

  private static class WordsPair {
    private String word;
    private String translate;

    public WordsPair(String word, String translate) {
      this.word = word;
      this.translate = translate;
    }
  }

  private WordsPair[] wordsPairs;
  private int count;

  public Dictionary() {
    this.wordsPairs = new WordsPair[10];
    this.count = 0;
  }

  public void put(String word, String translate) {
    for (int i = 0; i < count; i++) {
      if (wordsPairs[i].word.equals(word)) {
        System.out.println("Такое слово уже существует! " + word);
        return;
      }
    }
    WordsPair wordsPair = new WordsPair(word, translate);
    this.wordsPairs[count] = wordsPair;
    count++;
  }

  public String get(String word) {
    for (int i = 0; i < count; i++) {
      if (wordsPairs[i].word.equals(word)) {
        return wordsPairs[i].translate;
      }
    }
    return null;
  }

  public class Translator {
    public String[] translate(String[] text) {
      String[] translations = new String[text.length];
      for (int i = 0; i < text.length; i++) {
        String word = text[i];
        String translation = get(word);
        if (translation != null) {
          translations[i] = translation;
        } else {
          translations[i] = word; // Использовать исходное слово, если перевод не найден
        }
      }
      return translations;
    }
  }
}



