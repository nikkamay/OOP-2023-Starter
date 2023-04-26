package ie.tudublin;


import processing.core.PApplet;

public class Follow {
    //Make a class called Follow that has fields for the word (a String) and the count (an int). 
    //Make accessor methods and constructors and a toString()

        private String word;
        private int count;

        public Follow(String word, int count) {
            this.word = word;
            this.count = count;
        }
    

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public int getCount()
        {
            return count;
        }

        public void setCount(int count)
        {
            this.count = count;
        }


    
    
}




