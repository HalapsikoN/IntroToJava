package by.epam.unit04.task2.entity;

import java.util.Arrays;

public class Text {

    private String header;

    private Sentence[] sentences;

    public Text(String header, Sentence[] sentences) {
        this.header = header;
        this.sentences = sentences;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Sentence[] getSentences() {
        return sentences;
    }

    public void setSentences(Sentence[] sentences) {
        this.sentences = sentences;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Text text = (Text) o;

        if (!header.equals(text.header)) return false;
        return Arrays.equals(sentences, text.sentences);
    }

    @Override
    public int hashCode() {
        int result = header.hashCode();
        result = 31 * result + Arrays.hashCode(sentences);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Sentence sentence : sentences) {
            stringBuilder.append(sentence + " ");
        }
        return stringBuilder.toString();
    }
}
