package by.epam.unit04.task2.entity;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Text {

    private String header;

    private List<Sentence> sentences;

    public Text(String header, List<Sentence> sentences) {
        this.header = header;
        this.sentences = sentences;
    }

    public Text(String header, Sentence sentence) {
        this.header = header;
        this.sentences = new LinkedList<>();
        this.sentences.add(sentence);
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public void addSentence(Sentence sentence){
        this.sentences.add(sentence);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Text text = (Text) o;

        if (!header.equals(text.header)) return false;
        return sentences.equals(text.sentences);
    }

    @Override
    public int hashCode() {
        int result = header.hashCode();
        result = 31 * result + sentences.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Text{" +
                "header='" + header + '\'' +
                ", sentences=" + sentences +
                '}';
    }
}
