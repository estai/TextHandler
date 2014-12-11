package com.epam.text;

import com.epam.action.ReaderFile;
import com.epam.text.Sentence;

import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 07.11.14.
 */
public class Text {

    private ArrayList<Sentence> sentences=new ArrayList<Sentence>();
    private String text;
    private ReaderFile readerOfFile;
    ResourceBundle bundle=ResourceBundle.getBundle("pattern");
    private String s=bundle.getString("sentenceRegex");

    public Text(ReaderFile readerOfFile) {
        this.readerOfFile = readerOfFile;
        text=readerOfFile.readText();

        Pattern pattern=Pattern.compile(s);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find())
        {
            String s=matcher.group();
            if(s.length()>1 && !s.isEmpty()){
                sentences.add(new Sentence(s));
            }
        }
    }

    public String getText() {
        return text;
    }

    public ArrayList<Sentence> getSentences() {
        return sentences;
    }
}
