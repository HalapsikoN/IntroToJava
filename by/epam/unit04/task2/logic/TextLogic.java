package by.epam.unit04.task2.logic;

import by.epam.unit04.task2.entity.Sentence;
import by.epam.unit04.task2.entity.Text;

public class TextLogic {

    public static Text addSentenceToText(Text text, Sentence sentence) {

        Sentence[] oldSentences = text.getSentences();
        Sentence[] newSentences = new Sentence[oldSentences.length + 1];
        for (int i = 0; i < oldSentences.length; ++i) {
            newSentences[i] = oldSentences[i];
        }
        newSentences[newSentences.length - 1] = sentence;
        Text newText = new Text(text.getHeader(), newSentences);
        return newText;
    }
}
