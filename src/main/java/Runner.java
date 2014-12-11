import com.epam.action.Action;
import com.epam.action.ReaderFile;
import com.epam.text.Sentence;
import com.epam.text.Text;
import com.epam.text.Word;

/**
 * Created by User on 07.11.14.
 */
public class Runner {
    public static void main(String[] args) {
        ReaderFile readerOfFile=new ReaderFile("D:/two_task.txt");
       Text text=new Text(readerOfFile);
        for (Sentence sentence:text.getSentences()){

             for(Word word:sentence.getWords())
                 System.out.println(word.getWord());}
        System.out.println("-------------------------");
             Action.print(Action.sortSentense(text));
    }
}
