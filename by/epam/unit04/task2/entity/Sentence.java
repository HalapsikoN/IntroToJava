package by.epam.unit04.task2.entity;

import java.util.Arrays;

public class Sentence {

    private Word[] words;

    private char punctuationMark;

    public Sentence(Word[] words, char punctuationMark) {
        this.words = words;
        this.setPunctuationMark(punctuationMark);
    }

    public Word[] getWords() {
        return words;
    }

    public void setWords(Word[] words) {
        this.words = words;
    }

    public char getPunctuationMark() {
        return punctuationMark;
    }

    public void setPunctuationMark(char punctuationMark) {
        if (punctuationMark != '.' || punctuationMark != '!') {
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
        return Arrays.equals(words, sentence.words);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(words);
        result = 31 * result + (int) punctuationMark;
        return result;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.length; ++i) {
            stringBuilder.append(words[i].getWord() + " ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append(punctuationMark);
        return stringBuilder.toString();
    }
}
