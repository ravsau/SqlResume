import java.util.ArrayList;

public class UpdateSkill {

	
	private String skill;
	private String rating;
	private int counter;
	private int skillCount;
	private String[] skillArray;
	
	
	
	public UpdateSkill(String[]Skill){
		
		
		skillArray=Skill;
		
	}
	
	public void addSkill(String skill, String rating,int num){
		
		skillArray[num]=""+skill + rating;
		
	}
	
	
	
	public String getSkill(int num){
		
		return skillArray[num];
	}
}
