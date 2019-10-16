package by.epam.unit04.task2;

import by.epam.unit04.task2.entity.Sentence;
import by.epam.unit04.task2.entity.Text;
import by.epam.unit04.task2.entity.Word;
import by.epam.unit04.task2.logic.TextLogic;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String args[]) {
        List<Word> words = new LinkedList<>();
        words.add(new Word("I"));
        words.add(new Word("like"));
        words.add(new Word("dogs"));
        words.add(new Word("and"));
        words.add(new Word("cats"));
        List<Word> words1 = new LinkedList<>();
        words1.add(new Word("I"));
        words1.add(new Word("like"));
        words1.add(new Word("to"));
        words1.add(new Word("watch"));
        words1.add(new Word("videos"));
        words1.add(new Word("with"));
        words1.add(new Word("them"));

        List<Sentence> sentences = new LinkedList<>();
        sentences.add(new Sentence(words, '!'));
        sentences.add(new Sentence(words1, '.'));

        Text text = new Text("there should be header", sentences);

        TextLogic textLogic=new TextLogic();
        System.out.println(textLogic.getText(text));

        List<Word> words2 = new LinkedList<>();
        words2.add( new Word("I"));
        words2.add( new Word("don't"));
        words2.add( new Word("know"));
        words2.add( new Word("what"));
        words2.add( new Word("to"));
        words2.add( new Word("add"));
        Sentence addSentence = new Sentence(words2, '.');

        text.addSentence(addSentence);

        System.out.println();
        System.out.println(textLogic.getText(text));
    }
}
