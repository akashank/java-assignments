/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capgemini;

/**
 *
 * @author Ankit Akash
 */
public class demo {
    
    
	public static void main(String[] args) {

		// playing cricket
		Game newGame = new cricket();
		perform(newGame);

		// playing football
		newGame = new Football();
		perform(newGame);

		// playing tennis
		newGame = new Tennis();
		perform(newGame);

	}

	private static void perform(Game newGame) {
		newGame.play();

	}


    
}
