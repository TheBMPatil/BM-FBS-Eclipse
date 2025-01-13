package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage myStage) throws Exception {
//		Stage stage = new Stage();

		Group root = new Group();

		Scene scene = new Scene(root, Color.BLACK);
		myStage.setTitle("Stage Demo");
		Image icon = new Image("logo.png");
		myStage.getIcons().add(icon);

		myStage.setWidth(620);
		myStage.setHeight(620);
		myStage.setFullScreen(true);
		myStage.setFullScreenExitHint("YOU CAN'T ESCAPE  ! unless you press b");
		myStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("b"));

//		myStage.setResizable(false);

//		myStage.setX(0);;
//		myStage.setY(0);;

		myStage.setScene(scene);
		myStage.show();

	}
}
