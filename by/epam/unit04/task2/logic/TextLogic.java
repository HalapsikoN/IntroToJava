package by.epam.unit04.task2.logic;

import by.epam.unit04.task2.entity.Sentence;
import by.epam.unit04.task2.entity.Text;
import by.epam.unit04.task2.entity.Word;

public class TextLogic {

    public String getText(Text text) {
        StringBuilder stringBuilder=new StringBuilder();

        stringBuilder.append(text.getHeader()+"\n");
        for(Sentence sentence:text.getSentences()){
            stringBuilder.append(" ");
            for(Word word:sentence.getWords()){
                stringBuilder.append(word.getWord());
                stringBuilder.append(" ");
            }
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
            stringBuilder.append(sentence.getPunctuationMark());
        }

        return stringBuilder.toString();
    }
}
