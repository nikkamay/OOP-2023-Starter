package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	
	
	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);

       
	}

	public String[] findWord(){
        return null;
    }

    public void loadFile()
    {
		String[] lines = loadStrings("small.txt"); //Load a text file into a String array

		 
		for (int i = 0; i < lines.length; i++) {
			String[] splittedWords = split(lines[i], ' '); // Split a string into an array of words
			String changedLines = splittedWords[i].replaceAll("[^\\w\\s]","").toLowerCase(); // Remove punction characters and convert to lower case
			
			System.out.println(changedLines);
		}
		 
    }



	public void keyPressed() {


	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
		loadFile();
        
	}
}
