package com.epam.action;

import com.epam.text.Sentence;
import com.epam.text.Text;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Action {

   public static List<Sentence> sortSentense(Text text) {
       List<Sentence> sentences=text.getSentences();
       Collections.sort(sentences, new Comparator<Sentence>() {
           @Override
           public int compare(Sentence o1, Sentence o2) {
               return Integer.compare(o1.getWords().size(),o2.getWords().size());
           }
       });
   return sentences;
   }
    public static void print(List<Sentence> sentences){
        for (Sentence sentence: sentences){
            System.out.println(sentence.getSentence());
        }
    }
}
