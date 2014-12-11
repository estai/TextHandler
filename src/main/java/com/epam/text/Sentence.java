package com.epam.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {
   private ArrayList<Word> words=new ArrayList<Word>();
    private String sentence;

     ResourceBundle bundle=ResourceBundle.getBundle("pattern");
      private String s=bundle.getString("wordRegex");

    public Sentence(String sentence) {
        this.sentence = sentence;
        Pattern pattern=Pattern.compile(s);
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()){
            String s=matcher.group();
            if(s.length()>2 && !s.isEmpty())
            {
                words.add(new Word(s));
            }
        }

    }

    public ArrayList<Word> getWords() {
        return words;
    }

    public String getSentence() {
        return sentence;
    }
    public String toString(){
        return this.sentence;
    }
}
