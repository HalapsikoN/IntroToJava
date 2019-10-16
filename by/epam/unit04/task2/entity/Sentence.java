package by.epam.unit04.task2.entity;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Sentence {

    private List<Word> words;

    private char punctuationMark;

    public Sentence(List<Word> words, char punctuationMark) {
        this.words = words;
        this.punctuationMark = punctuationMark;
    }

    public Sentence(Word word, char punctuationMark){
        this.words=new LinkedList<>();
        this.words.add(word);
        this.punctuationMark=punctuationMark;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public void addWord(Word word){
        this.words.add(word);
    }

    public char getPunctuationMark() {
        return punctuationMark;
    }

    public void setPunctuationMark(char punctuationMark) {
        if (punctuationMark != '.' && punctuationMark != '!') {
            punctuationMark = '.';
        }
        this.punctuationMark = punctuationMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sentence sentence = (Sentence) o;

        if (punctuationMark != sentence.punctuationMark) return false;
        return words.equals(sentence.words);
    }

    @Override
    public int hashCode() {
        int result = words.hashCode();
        result = 31 * result + (int) punctuationMark;
        return result;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "words=" + words +
                ", punctuationMark=" + punctuationMark +
                '}';
    }
}
