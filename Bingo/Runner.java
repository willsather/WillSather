package bingo;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Runner {

	public static void main(String[] args) {
		
		Game game = new Game();
		
		JFrame frame = new JFrame("Bingo");
		
		frame.setLayout(new GridLayout(6, 5));	
		
		JLabel one = new JLabel(String.valueOf(game.board[0][0]));
		JLabel two = new JLabel(String.valueOf(game.board[0][1]));		
		JLabel three = new JLabel(String.valueOf(game.board[0][2]));
		JLabel four = new JLabel(String.valueOf(game.board[0][3]));
		JLabel five = new JLabel(String.valueOf(game.board[0][4]));
		
		JLabel six = new JLabel(String.valueOf(game.board[1][0]));
		JLabel seven = new JLabel(String.valueOf(game.board[1][1]));
		JLabel eight = new JLabel(String.valueOf(game.board[1][2]));
		JLabel nine = new JLabel(String.valueOf(game.board[1][3]));
		JLabel ten = new JLabel(String.valueOf(game.board[1][4]));
		
		JLabel eleven = new JLabel(String.valueOf(game.board[2][0]));
		JLabel twelve = new JLabel(String.valueOf(game.board[2][1]));
		JLabel thirteen = new JLabel(String.valueOf(game.board[2][2]));
		JLabel fourteen = new JLabel(String.valueOf(game.board[2][3]));
		JLabel fifteen = new JLabel(String.valueOf(game.board[2][4]));
	
		JLabel sixteen = new JLabel(String.valueOf(game.board[3][0]));
		JLabel seventeen = new JLabel(String.valueOf(game.board[3][1]));
		JLabel eighteen = new JLabel(String.valueOf(game.board[3][2]));
		JLabel nineteen = new JLabel(String.valueOf(game.board[3][3]));
		JLabel twenty = new JLabel(String.valueOf(game.board[3][4]));
		
		JLabel twentyOne = new JLabel(String.valueOf(game.board[4][0]));
		JLabel twentyTwo = new JLabel(String.valueOf(game.board[4][1]));
		JLabel twentyThree = new JLabel(String.valueOf(game.board[4][2]));
		JLabel twentyFour = new JLabel(String.valueOf(game.board[4][3]));
		JLabel twentyFive = new JLabel(String.valueOf(game.board[4][4]));
		
		fillBoardFirst(game, frame, one, two, three, four, five,
				six, seven, eight, nine, ten, eleven, twelve,
				thirteen, fourteen, fifteen, sixteen, seventeen,
				eighteen, nineteen, twenty, twentyOne, twentyTwo, 
				twentyThree, twentyFour, twentyFive);
		
		JLabel buttonOne = new JLabel("");
		JButton button = new JButton("Roll");
		JLabel buttonTwo = new JLabel("");
		
		frame.add(buttonOne);
		frame.add(buttonTwo);
		frame.add(button);
		
	    button.addActionListener(new ActionListener() {
	        @Override public void actionPerformed(ActionEvent e) {
				game.checkBoard();
				
				fillBoardAgain(game, frame, one, two, three, four, five,
						six, seven, eight, nine, ten, eleven, twelve,
						thirteen, fourteen, fifteen, sixteen, seventeen,
						eighteen, nineteen, twenty, twentyOne, twentyTwo, 
						twentyThree, twentyFour, twentyFive);
				
				buttonOne.setText(String.valueOf(game.guess) );
	        	}
	        });

		
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	
	public static void fillBoardAgain (Game game, JFrame frame, JLabel one, JLabel two, JLabel three, 
										JLabel four, JLabel five, JLabel six, JLabel seven, JLabel eight, 
										JLabel nine, JLabel ten, JLabel eleven, JLabel twelve, JLabel thirteen,
										JLabel fourteen, JLabel fifteen, JLabel sixteen, JLabel seventeen, JLabel eighteen, 
										JLabel nineteen, JLabel twenty, JLabel twentyOne, JLabel twentyTwo, 
										JLabel twentyThree, JLabel twentyFour, JLabel twentyFive) {
		
		/// Manually Creates labels for First Row ///
		
		one.setText( (String.valueOf(game.board[0][0]) ) );
		two.setText( (String.valueOf(game.board[0][1]) ) );
		three.setText( (String.valueOf(game.board[0][2]) ) );
		four.setText( (String.valueOf(game.board[0][3]) ) );
		five.setText( (String.valueOf(game.board[0][4]) ) );
		
		six.setText( (String.valueOf(game.board[1][0]) ) );
		seven.setText( (String.valueOf(game.board[1][1]) ) );
		eight.setText( (String.valueOf(game.board[1][2]) ) );
		nine.setText( (String.valueOf(game.board[1][3]) ) );
		ten.setText( (String.valueOf(game.board[1][4]) ) );
		
		eleven.setText( (String.valueOf(game.board[2][0]) ) );
		twelve.setText( (String.valueOf(game.board[2][1]) ) );
		thirteen.setText( (String.valueOf(game.board[2][2]) ) );
		fourteen.setText( (String.valueOf(game.board[2][3]) ) );
		fifteen.setText( (String.valueOf(game.board[2][4]) ) );
		
		sixteen.setText( (String.valueOf(game.board[3][0]) ) );
		seventeen.setText( (String.valueOf(game.board[3][1]) ) );
		eighteen.setText( (String.valueOf(game.board[3][2]) ) );
		nineteen.setText( (String.valueOf(game.board[3][3]) ) );
		twenty.setText( (String.valueOf(game.board[3][4]) ) );
		
		twentyOne.setText( (String.valueOf(game.board[4][0]) ) );
		twentyTwo.setText( (String.valueOf(game.board[4][1]) ) );
		twentyThree.setText( (String.valueOf(game.board[4][2]) ) );
		twentyFour.setText( (String.valueOf(game.board[4][3]) ) );
		twentyFive.setText( (String.valueOf(game.board[4][4]) ) );
		
		
	}
	
	public static void fillBoardFirst (Game game, JFrame frame, JLabel one, JLabel two, JLabel three, 
			JLabel four, JLabel five, JLabel six, JLabel seven, JLabel eight, 
			JLabel nine, JLabel ten, JLabel eleven, JLabel twelve, JLabel thirteen,
			JLabel fourteen, JLabel fifteen, JLabel sixteen, JLabel seventeen, JLabel eighteen, 
			JLabel nineteen, JLabel twenty, JLabel twentyOne, JLabel twentyTwo, 
			JLabel twentyThree, JLabel twentyFour, JLabel twentyFive) {
		
		
		/// Manually Creates labels for First Row ///
		
		frame.add( one );
		one.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add( two );
		two.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add( three );
		three.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add( four );
		four.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add( five );
		five.setHorizontalAlignment(JLabel.CENTER);
		
		
		
		/// Manually Creates labels for Second Row ///
		
		frame.add( six );
		six.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add( seven );
		seven.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add( eight );
		eight.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add( nine );
		nine.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add( ten );
		ten.setHorizontalAlignment(JLabel.CENTER);
		
		
		/// Manually Creates labels for Third Row ///
		
		frame.add( eleven );
		eleven.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add( twelve );
		twelve.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add( thirteen );
		thirteen.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add( fourteen );
		fourteen.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add( fifteen );
		fifteen.setHorizontalAlignment(JLabel.CENTER);
		
		
		/// Manually Creates labels for Fourth Row ///
		
		frame.add( sixteen );
		sixteen.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add( seventeen );
		seventeen.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add( eighteen );
		eighteen.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add( nineteen );
		nineteen.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add( twenty );
		twenty.setHorizontalAlignment(JLabel.CENTER);
		
		
		/// Manually Creates labels for Fifth Row ///
		
		frame.add( twentyOne );
		twentyOne.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add( twentyTwo );
		twentyTwo.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add( twentyThree );
		twentyThree.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add( twentyFour );
		twentyFour.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add( twentyFive );
		twentyFive.setHorizontalAlignment(JLabel.CENTER);
		
		
	}
	
}
