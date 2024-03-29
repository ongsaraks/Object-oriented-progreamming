/*
* This class stores scores and provide calibrated average about the scores from 6 judges. 

* This class will be used as a part of the Competitor class. 
*/
// File: <SkiCompetition>
// Description: <Implememt score for other class use>
// Assignment Number: <5>
//
// ID: <6688093>
// Name: Ongsa Raksalam
// Section: 2
// Grader: Sorn
//
// On my honor, Ongsa Raksalam, this lab assignment is my own work
// and I have not provided this code to any other students.
import java.util.*;

public class Score {
	private double jumpScore;
	private double[] styleScore; 
	
	//The constructor should set all given attributes to 0.
	public Score() {
		//TODO: Code HERE
		this.jumpScore = 0;
		this.styleScore = new double[6];
	}
	
	//This method set the jumpScore to the given score
	public void setScores(double score) {
		this.jumpScore = score;
	}
	
	//This method set the styleScore to the given score
	public void setScores(double[] scores) {
		//TODO: Code HERE
		this.styleScore = scores;
	}
	
	//This method return the jumpScore
	public double getJumpScores() {
		//TODO: Code HERE
		return this.jumpScore;
	}
	
	//This method return the styleScore
	public double[] getStyleScore() {
		//TODO: Code HERE
		return styleScore;
	}
	
   /*
    * Return the average of the scores after excluding the minimum and maximum
    * value. In short, it should return 
    *   (SUM(this.scores) - MIN(this.scores) - MAX(this.scores))/(n-2), where
    * n is the length of the score list. 
    */
	public double getCalibratedAverage() {
		//TODO: Code HERE
		double min = styleScore[0];
		double max = styleScore[0];
		double sum = 0;
		for(int i = 0; i < styleScore.length; i++) {
			if (styleScore[i] < min) {
				min = styleScore[i];
			}
			if (styleScore[i] >max) {
				max = styleScore[i];
			}
			sum += styleScore[i];
		}
		double avg = (sum -min - max) / (styleScore.length - 2);
		
		
		return avg; 
	}
	
	//This main is for testing your output
	public static void main(String[] args) {
		Score s1 = new Score();
		s1.setScores(9.5);
		s1.setScores(new double[] {5.5, 4.5, 3.5, 2.5, 1.5, 6.5});
		System.out.println(s1.getJumpScores());
		System.out.println(Arrays.toString(s1.getStyleScore()));
		System.out.println(s1.getCalibratedAverage());
	}
}
