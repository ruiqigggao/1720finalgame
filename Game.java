

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Game extends Application {
	private int WIDTH = 700;
	private int HEIGHT = 500;
	private StackPane stack;
	private ImageView background;
	private Button start;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		// build your application here
		// hints for what you will need are given in the list of imports
		
		StackPane stack = new StackPane();
		stack.setAlignment(Pos.CENTER);
		stack.setPadding(new Insets(25,25,25,25));
		
		
		Image back = new Image("gamepic/icons/forest.png");
		ImageView background = new ImageView(back);
		stack.getChildren().add(background);
		background.setFitHeight(HEIGHT);
		background.setFitWidth(WIDTH);

		Button start = new Button("START");
		stack.getChildren().add(start);

		start.setTranslateX(0);
		start.setTranslateY(150);
		start.setMaxSize(100, 50);
		
		start.setOnMouseClicked(startevent->{
			stack.getChildren().remove(start);
			stack.getChildren().remove(background);
			Image pic1 = new Image("gamepic/icons/badroom1.png");
			ImageView picture1 = new ImageView(pic1);
			stack.getChildren().add(picture1);
			picture1.setFitHeight(HEIGHT);
			picture1.setFitWidth(WIDTH);
			Image dialog = new Image("gamepic/icons/dbox.png");
			ImageView dialogb = new ImageView(dialog);
			stack.getChildren().add(dialogb);
			dialogb.setTranslateX(0);
		    dialogb.setTranslateY(150);
			Text hello =  new Text("Good morning the world! What a great day! ");
			stack.getChildren().add(hello);
			hello.setFont(Font.font("Arial", 25));
			hello.setTranslateX(-85);
			hello.setTranslateY(120);
			Button scene1 = new Button("let's enjoy the new day");
			stack.getChildren().add(scene1);
			scene1.setTranslateX(-90);
			scene1.setTranslateY(200);
			scene1.setMaxSize(200,25);
			Button scene10 = new Button("But I wanna sleep...");
			stack.getChildren().add(scene10);
			scene10.setTranslateX(120);
			scene10.setTranslateY(200);
			scene10.setMaxSize(200,25);
			
			/*sleep*/
			scene10.setOnMouseClicked(sceneevent1->{
				stack.getChildren().remove(scene1);
				stack.getChildren().remove(scene10);
				stack.getChildren().remove(hello);
				stack.getChildren().remove(background);
				Image pic2 = new Image("gamepic/icons/badroom2.png");
				ImageView picture2 = new ImageView(pic2);
				stack.getChildren().add(picture2);
				picture2.setFitHeight(HEIGHT);
				picture2.setFitWidth(WIDTH);
				Image dialog1 = new Image("gamepic/icons/dbox.png");
				ImageView dialogb1 = new ImageView(dialog1);
				stack.getChildren().add(dialogb1);
				dialogb1.setTranslateX(0);
			    dialogb1.setTranslateY(150);
				Text nice0 =  new Text("Because you sleep whole day, your day is end.");
				stack.getChildren().add(nice0);
	            nice0.setFont(Font.font("Arial", 30));
	            nice0.setTranslateX(-15);
				nice0.setTranslateY(120);
				/*Button scene50 = new Button("Open a new day");
				stack.getChildren().add(scene50);
				scene50.setTranslateX(120);
				scene50.setTranslateY(200);
				scene50.setMaxSize(200,25);
				
				scene50.setOnMouseClicked(sceneevent50->{
				reset();
				});*/
			});
				
			/*get up*/
			scene1.setOnMouseClicked(sceneevent->{
			stack.getChildren().remove(scene1);
			stack.getChildren().remove(scene10);
			stack.getChildren().remove(hello);
			
			Image pic3 = new Image("gamepic/icons/breakfast.png");
			ImageView picture3 = new ImageView(pic3);
			stack.getChildren().add(picture3);
			picture3.setFitHeight(400);
			picture3.setFitWidth(400);
			Image dialog1 = new Image("gamepic/icons/dbox.png");
			ImageView dialogb1 = new ImageView(dialog1);
			stack.getChildren().add(dialogb1);
			dialogb1.setTranslateX(0);
		    dialogb1.setTranslateY(150);
			Text nice =  new Text("breakfast time!");
			stack.getChildren().add(nice);
            nice.setFont(Font.font("Arial", 25));
            nice.setTranslateX(-100);
			nice.setTranslateY(120);
			Button scene2 = new Button("have breakfast");
			stack.getChildren().add(scene2);
			scene2.setTranslateX(-100);
			scene2.setTranslateY(200);
			scene2.setMaxSize(200,25);
			Button scene20 = new Button("I've lost my appetite");
			stack.getChildren().add(scene20);
			scene20.setTranslateX(120);
			scene20.setTranslateY(200);
			scene20.setMaxSize(200,25);
			
			/*faint*/
			scene20.setOnMouseClicked(sceneevent20->{
				stack.getChildren().remove(scene2);
				stack.getChildren().remove(scene20);
				stack.getChildren().remove(nice);
				Text nice2 =  new Text("Oh...I feel dizzy...Why... ");
				stack.getChildren().add(nice2);
	            nice2.setFont(Font.font("Arial", 25));
	            nice2.setTranslateX(-50);
				nice2.setTranslateY(120);
				Button scene4 = new Button("faint...");
				stack.getChildren().add(scene4);
				scene4.setTranslateX(-100);
				scene4.setTranslateY(200);
				scene4.setMaxSize(200,25);
				
				scene4.setOnMouseClicked(sceneevent4->{
					stack.getChildren().remove(scene4);
					stack.getChildren().remove(nice2);
					Image pic2 = new Image("gamepic/icons/badroom2.png");
					ImageView picture2 = new ImageView(pic2);
					stack.getChildren().add(picture2);
					picture2.setFitHeight(HEIGHT);
					picture2.setFitWidth(WIDTH);
					Image pic8 = new Image("gamepic/icons/gameover.png");
					ImageView picture8 = new ImageView(pic8);
					stack.getChildren().add(picture8);
					picture8.setFitHeight(400);
					picture8.setFitWidth(400);
					Image dialog4 = new Image("gamepic/icons/dbox.png");
					ImageView dialogb4= new ImageView(dialog4);
					stack.getChildren().add(dialogb4);
					dialogb4.setTranslateX(0);
				    dialogb4.setTranslateY(150);
					Text nice3 =  new Text("Because you faint, your day is end.");
					stack.getChildren().add(nice3);
		            nice3.setFont(Font.font("Arial", 35));
		            nice3.setTranslateX(-50);
					nice3.setTranslateY(120);
				});
			});
			/*go to school*/
			scene2.setOnMouseClicked(sceneevent2->{
				stack.getChildren().remove(scene2);
				stack.getChildren().remove(scene20);
				stack.getChildren().remove(nice);
				Image pic2 = new Image("gamepic/icons/badroom2.png");
				ImageView picture2 = new ImageView(pic2);
				stack.getChildren().add(picture2);
				picture2.setFitHeight(HEIGHT);
				picture2.setFitWidth(WIDTH);
				Image pic4 = new Image("gamepic/icons/breakfast.png");
				ImageView picture4 = new ImageView(pic4);
				stack.getChildren().add(picture4);
				picture3.setFitHeight(HEIGHT);
				picture3.setFitWidth(WIDTH);
				Image dialog2 = new Image("gamepic/icons/dbox.png");
				ImageView dialogb2= new ImageView(dialog2);
				stack.getChildren().add(dialogb2);
				dialogb2.setTranslateX(0);
			    dialogb2.setTranslateY(150);
				Text nice1 =  new Text("emmmmm...delcious! Oh! I would belate! Let's go! ");
				stack.getChildren().add(nice1);
	            nice1.setFont(Font.font("Arial", 25));
	            nice1.setTranslateX(-50);
				nice1.setTranslateY(120);
				Button scene3 = new Button("Continute...");
				stack.getChildren().add(scene3);
				scene3.setTranslateX(120);
				scene3.setTranslateY(200);
				scene3.setMaxSize(200,25);
				
				scene3.setOnMouseClicked(sceneevent3->{
					stack.getChildren().remove(scene3);
					stack.getChildren().remove(nice1);
					Image pic5 = new Image("gamepic/icons/traffic light.png");
					ImageView picture5 = new ImageView(pic5);
					stack.getChildren().add(picture5);
					picture5.setFitHeight(HEIGHT);
					picture5.setFitWidth(WIDTH);
					Image dialog3 = new Image("gamepic/icons/dbox.png");
					ImageView dialogb3= new ImageView(dialog3);
					stack.getChildren().add(dialogb3);
					dialogb3.setTranslateX(0);
				    dialogb3.setTranslateY(150);
					Text nice4 =  new Text("Oh! It's red light!");
					stack.getChildren().add(nice4);
		            nice4.setFont(Font.font("Arial", 25));
		            nice4.setTranslateX(-100);
					nice4.setTranslateY(120);
					Button scene5 = new Button("Fine, just wait...");
					stack.getChildren().add(scene5);
					scene5.setTranslateX(-100);
					scene5.setTranslateY(200);
					scene5.setMaxSize(200,25);
					Button scene6 = new Button("I have to go directly!");
					stack.getChildren().add(scene6);
					scene6.setTranslateX(120);
					scene6.setTranslateY(200);
					scene6.setMaxSize(200,25);
					
					scene6.setOnMouseClicked(sceneevent6->{
						stack.getChildren().remove(scene5);
						stack.getChildren().remove(scene6);
						stack.getChildren().remove(nice4);
						Image pic8 = new Image("gamepic/icons/gameover.png");
						ImageView picture8 = new ImageView(pic8);
						stack.getChildren().add(picture8);
						picture8.setFitHeight(400);
						picture8.setFitWidth(400);
						Image dialog4 = new Image("gamepic/icons/dbox.png");
						ImageView dialogb4= new ImageView(dialog4);
						stack.getChildren().add(dialogb4);
						dialogb4.setTranslateX(0);
					    dialogb4.setTranslateY(150);
						Text nice5 =  new Text("Because you got hit by a truck, your life is end.");
						stack.getChildren().add(nice5);
			            nice5.setFont(Font.font("Arial", 30));
			            nice5.setTranslateX(-15);
						nice5.setTranslateY(120);
					});
					
					scene5.setOnMouseClicked(sceneevent5->{
						stack.getChildren().remove(scene5);
						stack.getChildren().remove(scene6);
						stack.getChildren().remove(nice4);
						Image pic6 = new Image("gamepic/icons/traffic light.png");
						ImageView picture6 = new ImageView(pic6);
						stack.getChildren().add(picture6);
						picture6.setFitHeight(HEIGHT);
						picture6.setFitWidth(WIDTH);
						Image dialog4 = new Image("gamepic/icons/dbox.png");
						ImageView dialogb4= new ImageView(dialog4);
						stack.getChildren().add(dialogb4);
						dialogb4.setTranslateX(0);
					    dialogb4.setTranslateY(150);
						Text nice6 =  new Text("Hu~, I cross the road safely.");
						stack.getChildren().add(nice6);
			            nice6.setFont(Font.font("Arial", 25));
			            nice6.setTranslateX(-100);
						nice6.setTranslateY(120);
						Button scene7 = new Button("Go into my classroom.");
						stack.getChildren().add(scene7);
						scene7.setTranslateX(120);
						scene7.setTranslateY(200);
						scene7.setMaxSize(200,25);
						
				/*classroom*/
				scene7.setOnMouseClicked(sceneevent7->{
					stack.getChildren().remove(scene7);
					stack.getChildren().remove(nice6);
					Image pic7 = new Image("gamepic/icons/classroom.png");
					ImageView picture7 = new ImageView(pic7);
					stack.getChildren().add(picture7);
					picture7.setFitHeight(HEIGHT);
					picture7.setFitWidth(WIDTH);
					Image pic8 = new Image("gamepic/icons/bad cat.png");
					ImageView picture8 = new ImageView(pic8);
					stack.getChildren().add(picture8);
					picture8.setFitHeight(400);
					picture8.setFitWidth(400);
					Image dialog5 = new Image("gamepic/icons/dbox.png");
					ImageView dialogb5= new ImageView(dialog5);
					stack.getChildren().add(dialogb5);
					dialogb5.setTranslateX(0);
				    dialogb5.setTranslateY(150);
					Text nice7 =  new Text("School bully:Oh~ Let me guess who's coming...  ");
					stack.getChildren().add(nice7);
		            nice7.setFont(Font.font("Arial", 25));
		            nice7.setTranslateX(-15);
					nice7.setTranslateY(120);
					Button scene8 = new Button("Oh...again...");
					stack.getChildren().add(scene8);
					scene8.setTranslateX(120);
					scene8.setTranslateY(200);
					scene8.setMaxSize(200,25);
					
					scene8.setOnMouseClicked(sceneevent8->{
						stack.getChildren().remove(scene8);
						stack.getChildren().remove(nice7);
						Text nice8 =  new Text("My Pinky boy~ I know you always do you homework well... ");
						Text nice9 =  new Text("Let me have a look!");
						stack.getChildren().add(nice8);
			            nice8.setFont(Font.font("Arial", 25));
			            nice8.setTranslateX(-10);
						nice8.setTranslateY(120);
						stack.getChildren().add(nice9);
			            nice9.setFont(Font.font("Arial", 25));
			            nice9.setTranslateX(-15);
						nice9.setTranslateY(150);
						Button scene9 = new Button("Never!");
						stack.getChildren().add(scene9);
						scene9.setTranslateX(120);
						scene9.setTranslateY(200);
						scene9.setMaxSize(200,25);
						Button scene11 = new Button("OK, I've finish well for you...");
						stack.getChildren().add(scene11);
						scene11.setTranslateX(-150);
						scene11.setTranslateY(200);
						scene11.setMaxSize(250,25);
						
				/*homework*/		
						scene9.setOnMouseClicked(sceneevent9->{
							stack.getChildren().remove(scene9);
							stack.getChildren().remove(scene11);
							stack.getChildren().remove(nice8);
							stack.getChildren().remove(nice9);
							Image pic9 = new Image("gamepic/icons/classroom.png");
							ImageView picture9 = new ImageView(pic9);
							stack.getChildren().add(picture9);
							picture9.setFitHeight(HEIGHT);
							picture9.setFitWidth(WIDTH);
							Image pic10 = new Image("gamepic/icons/pinky cry.png");
							ImageView picture10 = new ImageView(pic10);
							stack.getChildren().add(picture10);
							picture10.setFitHeight(400);
							picture10.setFitWidth(400);
							Image dialog6 = new Image("gamepic/icons/dbox.png");
							ImageView dialogb6= new ImageView(dialog6);
							stack.getChildren().add(dialogb6);
							dialogb6.setTranslateX(0);
						    dialogb6.setTranslateY(150);
							Text nice10 =  new Text("(you've been hit)");
							stack.getChildren().add(nice10);
				            nice10.setFont(Font.font("Arial", 30));
				            nice10.setTranslateX(-15);
							nice10.setTranslateY(120);
							Button scene12 = new Button("Wuwuwu...");
							stack.getChildren().add(scene12);
							scene12.setTranslateX(120);
							scene12.setTranslateY(200);
							scene12.setMaxSize(200,25);
							
							scene12.setOnMouseClicked(sceneevent12->{
								stack.getChildren().remove(scene12);
								stack.getChildren().remove(nice10);
								Text nice11 =  new Text("Because you are badly wounded and");
								stack.getChildren().add(nice11);
					            nice11.setFont(Font.font("Arial", 30));
					            nice11.setTranslateX(-15);
								nice11.setTranslateY(120);
								Text nice12 =  new Text("sent into hospital, your beautiful day is end.");
								stack.getChildren().add(nice12);
					            nice12.setFont(Font.font("Arial", 30));
					            nice12.setTranslateX(-15);
								nice12.setTranslateY(150);
							});
						});
							
							scene11. setOnMouseClicked(sceneevent11->{
								stack.getChildren().remove(scene9);
								stack.getChildren().remove(scene11);
								stack.getChildren().remove(nice8);
								stack.getChildren().remove(nice9);
								Image pic11 = new Image("gamepic/icons/classroom.png");
								ImageView picture11 = new ImageView(pic11);
								stack.getChildren().add(picture11);
								picture11.setFitHeight(HEIGHT);
								picture11.setFitWidth(WIDTH);
								Image pic10 = new Image("gamepic/icons/bad cat got homework.png");
								ImageView picture10 = new ImageView(pic10);
								stack.getChildren().add(picture10);
								picture10.setFitHeight(400);
								picture10.setFitWidth(400);
								Image dialog6 = new Image("gamepic/icons/dbox.png");
								ImageView dialogb6= new ImageView(dialog6);
								stack.getChildren().add(dialogb6);
								dialogb6.setTranslateX(0);
							    dialogb6.setTranslateY(150);
								Text nice13 =  new Text("School bully: Good boy!");
								stack.getChildren().add(nice13);
					            nice13.setFont(Font.font("Arial", 30));
					            nice13.setTranslateX(-15);
								nice13.setTranslateY(120);
								Button scene13 = new Button("after class, take a walk in the park");
								stack.getChildren().add(scene13);
								scene13.setTranslateX(120);
								scene13.setTranslateY(200);
								scene13.setMaxSize(350,25);
								
								/*go to park*/
								scene13.setOnMouseClicked(sceneevent13->{
									stack.getChildren().remove(scene13);
									stack.getChildren().remove(nice13);
									Image pic12 = new Image("gamepic/icons/forest.png");
									ImageView picture12 = new ImageView(pic12);
									stack.getChildren().add(picture12);
									picture12.setFitHeight(HEIGHT);
									picture12.setFitWidth(WIDTH);
									Image pic13 = new Image("gamepic/icons/sigh.png");
									ImageView picture13 = new ImageView(pic13);
									stack.getChildren().add(picture13);
									picture13.setFitHeight(400);
									picture13.setFitWidth(400);
									Image dialog7 = new Image("gamepic/icons/dbox.png");
									ImageView dialogb7= new ImageView(dialog7);
									stack.getChildren().add(dialogb7);
									dialogb7.setTranslateX(0);
								    dialogb7.setTranslateY(150);
									Text nice14 =  new Text("One day I will hit back to you evil bully!");
									stack.getChildren().add(nice14);
						            nice14.setFont(Font.font("Arial", 30));
						            nice14.setTranslateX(-15);
									nice14.setTranslateY(120);
									Text nice15 =  new Text("...What's this?");
									stack.getChildren().add(nice15);
						            nice15.setFont(Font.font("Arial", 30));
						            nice15.setTranslateX(-15);
									nice15.setTranslateY(150);
									Button scene14 = new Button("Open it");
									stack.getChildren().add(scene14);
									scene14.setTranslateX(-150);
									scene14.setTranslateY(200);
									scene14.setMaxSize(250,25);
									Button scene15 = new Button("Anyway, just keep walking...");
									stack.getChildren().add(scene15);
									scene15.setTranslateX(120);
									scene15.setTranslateY(200);
									scene15.setMaxSize(250,25);
									
									scene14.setOnMouseClicked(sceneevent14->{
										stack.getChildren().remove(scene14);
										stack.getChildren().remove(scene15);
										stack.getChildren().remove(nice14);
										stack.getChildren().remove(nice15);
										stack.getChildren().remove(picture13);
										Image pic80 = new Image("gamepic/icons/gameover.png");
										ImageView picture80 = new ImageView(pic80);
										stack.getChildren().add(picture80);
										picture80.setFitHeight(400);
										picture80.setFitWidth(400);
										Image dialog70 = new Image("gamepic/icons/dbox.png");
										ImageView dialogb70= new ImageView(dialog70);
										stack.getChildren().add(dialogb70);
										dialogb70.setTranslateX(0);
									    dialogb70.setTranslateY(150);
										Text nice16 =  new Text("GHOOST!!! your life is end.");
										stack.getChildren().add(nice16);
							            nice16.setFont(Font.font("Arial", 35));
							            nice16.setTranslateX(-15);
										nice16.setTranslateY(120);
									});
							
									scene15.setOnMouseClicked(sceneevent14->{
										stack.getChildren().remove(scene14);
										stack.getChildren().remove(scene15);
										stack.getChildren().remove(nice14);
										stack.getChildren().remove(nice15);
										Text nice17=  new Text("It'stime to go home...");
										stack.getChildren().add(nice17);
							            nice17.setFont(Font.font("Arial", 25));
							            nice17.setTranslateX(-15);
										nice17.setTranslateY(120);
										Text nice18 =  new Text("What a great day...");
										stack.getChildren().add(nice18);
							            nice18.setFont(Font.font("Arial", 35));
							            nice18.setTranslateX(-15);
										nice18.setTranslateY(150);
									});
							
							
								});
						});
					});
					});
					});
				});
				});
				});
		});
		
	/*	reset();{
		stack.getChildren().add(background);
		stack.getChildren().add(start);	
		}*/
		Scene scene = new Scene(stack,WIDTH,HEIGHT);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}

	private void reset() {
		
		
	}

}
