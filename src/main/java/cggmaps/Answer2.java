package cggmaps;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Answer2
{
	@Id
	@Column(name="answer_id")
	private int answer_id;
	private String answer;
	
	@ManyToOne
	@JoinColumn(name="q_id")
	private Question2 question;

	public Question2 getQuestion() {
		return question;
	}
	public void setQuestion(Question2 question) {
		this.question = question;
	}
	public Answer2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer2(int answer_id, String answer) {
		super();
		this.answer_id = answer_id;
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Answer2 [answer_id=" + answer_id + ", answer=" + answer + "]";
	}
	public int getAnswer_id() {
		return answer_id;
	}
	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	
}