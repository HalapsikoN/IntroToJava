package by.epam.unit04.task2;

import by.epam.unit04.task2.entity.Sentence;
import by.epam.unit04.task2.entity.Text;
import by.epam.unit04.task2.entity.Word;
import by.epam.unit04.task2.logic.TextLogic;

public class Main {

    public static void main(String args[]) {
        Word[] words = new Word[5];
        words[0] = new Word("I");
        words[1] = new Word("like");
        words[2] = new Word("dogs");
        words[3] = new Word("and");
        words[4] = new Word("cats");
        Word[] words1 = new Word[7];
        words1[0] = new Word("I");
        words1[1] = new Word("like");
        words1[2] = new Word("to");
        words1[3] = new Word("watch");
        words1[4] = new Word("videos");
        words1[5] = new Word("with");
        words1[6] = new Word("them");

        Sentence[] sentences = new Sentence[2];
        sentences[0] = new Sentence(words, '.');
        sentences[1] = new Sentence(words1, '.');

        Text text = new Text("there should be header", sentences);

        System.out.println("Header: " + text.getHeader());
        System.out.println(text);

        Word[] words2 = new Word[6];
        words2[0] = new Word("I");
        words2[1] = new Word("don't");
        words2[2] = new Word("know");
        words2[3] = new Word("what");
        words2[4] = new Word("to");
        words2[5] = new Word("add");
        Sentence addSentence = new Sentence(words2, '.');

        Text newText = TextLogic.addSentenceToText(text, addSentence);

        System.out.println("Header: " + newText.getHeader());
        System.out.println(newText);
    }
}
