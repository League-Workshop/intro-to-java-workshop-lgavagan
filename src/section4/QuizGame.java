package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		int score=0;
		
		String answer=JOptionPane.showInputDialog(null,"What league does Messi play in?");
		
		if(answer.equals("La Liga")){
			score++;
		}
		
		String answer2=JOptionPane.showInputDialog(null,"How tall was the tallset man ever when he died?");
		if(answer2.equals("8,11")) {
			score++;
		}
		String answer3=JOptionPane.showInputDialog(null,"Who is the main character in the Battlefront 2 campaign?");
		if(answer3.equals("Iden Versio")) {
			score++;
		}
		System.out.println(score);
	 
		
	}
}
