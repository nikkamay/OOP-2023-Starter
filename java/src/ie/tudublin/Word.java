package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;

public class Word {
    //Make a class called Word that has fields for the word (a String) and an ArrayList of type Follow as fields. 
    //Make accessor methods, a constructor and a toString Method that will iterate through the follows ArrayList. 
    //(See the printout of the model above).

    private String word;
    ArrayList<Follow> follow = new ArrayList<Follow>();


    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

   public String[] findFollow(String word)
   {

    return null;
}


}
