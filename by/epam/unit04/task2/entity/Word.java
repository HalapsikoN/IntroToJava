package by.epam.unit04.task2.entity;

public class Word {

    private String word;

    public Word(String word) {
        this.setWord(word);
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        String[] words = word.split(" ");
        this.word = words[0];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Word word1 = (Word) o;

        return word.equals(word1.word);
    }

    @Override
    public int hashCode() {
        return word.hashCode();
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                '}';
    }
}
