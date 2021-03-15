package edu.cgcc.cs161.survey;

public class SurveyQuestions {

	private int QuestionNumber;
	private String Question;
	
	SurveyQuestions(int quesnum){
		QuestionNumber = quesnum;
		
		
		//Maybe have a bunch of if's asking for question number and setting question based on number.
		if(QuestionNumber == 1) {
			Question = "Question1";
		}
	}
	
	public String getQuestion() {
		return Question;
	}

	
}
