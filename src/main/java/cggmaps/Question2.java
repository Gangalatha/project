package cggmaps;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Question2
{
	@Id
	private int question_id;
	private String question;
	
	@OneToMany(mappedBy="question")
	private List<Answer2> answers;
	
	
	public List<Answer2> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer2> answers) {
		this.answers = answers;
	}
	public Question2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question2(int question_id, String question) {
		super();
		this.question_id = question_id;
		this.question = question;
	}
	@Override
	public String toString() {
		return "Question2 [question_id=" + question_id + ", question=" + question + "]";
	}
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	
	
}