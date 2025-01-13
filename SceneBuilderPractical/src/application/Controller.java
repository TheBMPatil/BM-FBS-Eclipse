<<<<<<< HEAD
package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {

	@FXML
	private Circle myCircle;

	private double x;
	private double y;

	public void up(ActionEvent e) {
		System.out.println("UP");

		myCircle.setCenterY(y -= 5);
	}

	public void down(ActionEvent e) {
		System.out.println("down");
		myCircle.setCenterY(y += 5);
	}

	public void left(ActionEvent e) {
		System.out.println("Left");
		myCircle.setCenterX(x -= 5);
	}

	public void right(ActionEvent e) {
		System.out.println("Right");
		myCircle.setCenterX(x += 5);
	}
}
=======
package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {

	@FXML
	private Circle myCircle;

	private double x;
	private double y;

	public void up(ActionEvent e) {
		System.out.println("UP");

		myCircle.setCenterY(y -= 5);
	}

	public void down(ActionEvent e) {
		System.out.println("down");
		myCircle.setCenterY(y += 5);
	}

	public void left(ActionEvent e) {
		System.out.println("Left");
		myCircle.setCenterX(x -= 5);
	}

	public void right(ActionEvent e) {
		System.out.println("Right");
		myCircle.setCenterX(x += 5);
	}
}
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
