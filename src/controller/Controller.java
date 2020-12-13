package controller;

import java.lang.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML private Button btn0;
    @FXML private Button btn1;
    @FXML private Button btn2;
    @FXML private Button btn3;
    @FXML private Button btn4;
    @FXML private Button btn5;
    @FXML private Button btn6;
    @FXML private Button btn7;
    @FXML private Button btn8;
    @FXML private Button btn9;
    @FXML private Button btn10;
    @FXML private Circle c0;
    @FXML private Circle c1;
    @FXML private Circle c2;
    @FXML private Circle c3;
    @FXML private Circle c4;
    @FXML private Circle c5;
    @FXML private Circle c6;
    @FXML private Circle c7;
    @FXML private AnchorPane apTry0;
    @FXML private AnchorPane apTry1;
    @FXML private AnchorPane apTry2;
    @FXML private AnchorPane apTry3;
    @FXML private AnchorPane apTry4;
    @FXML private AnchorPane apTry5;
    @FXML private AnchorPane apTry6;
    @FXML private AnchorPane apTry7;
    @FXML private AnchorPane apTry8;
    @FXML private AnchorPane apTry9;
    @FXML private AnchorPane apTry10;
    @FXML private AnchorPane ck0;
    @FXML private AnchorPane ck1;
    @FXML private AnchorPane ck2;
    @FXML private AnchorPane ck3;
    @FXML private AnchorPane ck4;
    @FXML private AnchorPane ck5;
    @FXML private AnchorPane ck6;
    @FXML private AnchorPane ck7;
    @FXML private AnchorPane ck8;
    @FXML private AnchorPane ck9;
    @FXML private AnchorPane anchorPane;

    private AnchorPane[] tryAnchorPanes;
    private ImagePattern[] imgPatterns;
    private int counter;
    private String[] seqToTry;
    private Sequence seq;
    private Colors colors;
    private int rightColorAndPosition;
    private int rightColor;
    private URL location;
    private ResourceBundle resources;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.location = location;
        this.resources = resources;
        colors = new Colors();
        btn0.setVisible(true);
        btn1.setVisible(false);
        btn2.setVisible(false);
        btn3.setVisible(false);
        btn4.setVisible(false);
        btn5.setVisible(false);
        btn6.setVisible(false);
        btn7.setVisible(false);
        btn8.setVisible(false);
        btn9.setVisible(false);
        btn10.setVisible(false);

        seqToTry = new String[4];
        counter = 0;
        rightColorAndPosition = 0;
        rightColor = 0;
        tryAnchorPanes = new AnchorPane[] {apTry0, apTry1, apTry2, apTry3, apTry4, apTry5,
                apTry6, apTry7, apTry8, apTry9};

        imgPatterns = new ImagePattern[] {new ImagePattern(new Image("resources/buttonMastermindYellow.png")), new
                ImagePattern(new Image("resources/buttonMastermindOrange.png")), new ImagePattern(new Image("resources/buttonMastermindGreen.png")),
        new ImagePattern(new Image("resources/buttonMastermindBlue.png")), new ImagePattern(new Image("resources/buttonMastermindViolet.png")),
        new ImagePattern(new Image("resources/buttonMastermindRed.png")), new ImagePattern(new Image("resources/buttonMastermindBlack.png")),
        new ImagePattern(new Image("resources/buttonMastermindSilver.png"))};

        c0.setFill(imgPatterns[0]);
        c1.setFill(imgPatterns[1]);
        c2.setFill(imgPatterns[2]);
        c3.setFill(imgPatterns[3]);
        c4.setFill(imgPatterns[4]);
        c5.setFill(imgPatterns[5]);
        c6.setFill(imgPatterns[6]);
        c7.setFill(imgPatterns[7]);

        for (AnchorPane a : tryAnchorPanes) {
            a.setOnMouseEntered(event -> {
                Scene scene = a.getScene();
                scene.setCursor(Cursor.HAND);
            });
            a.setOnMouseExited(event -> {
                Scene scene = a.getScene();
                scene.setCursor(Cursor.DEFAULT);
            });
        }

        for (Node n : apTry10.getChildren()) {
            ((Circle)n).setFill(new ImagePattern(new Image("resources/questionMark.png")));
        }


        for (int i = 0; i < apTry0.getChildren().size(); i++) {
            ((Circle)apTry0.getChildren().get(i)).setFill(Color.LIGHTGRAY);
            loopThroughCircleresources(apTry0.getChildren().get(i), i, btn0);
        }
        for (int i = 0; i < apTry1.getChildren().size(); i++) {
            ((Circle)apTry1.getChildren().get(i)).setFill(Color.LIGHTGRAY);
            loopThroughCircleresources(apTry1.getChildren().get(i), i, btn1);
        }
        for (int i = 0; i < apTry2.getChildren().size(); i++) {
            ((Circle)apTry2.getChildren().get(i)).setFill(Color.LIGHTGRAY);
            loopThroughCircleresources(apTry2.getChildren().get(i), i, btn2);
        }
        for (int i = 0; i < apTry3.getChildren().size(); i++) {
            ((Circle)apTry3.getChildren().get(i)).setFill(Color.LIGHTGRAY);
            loopThroughCircleresources(apTry3.getChildren().get(i), i, btn3);
        }
        for (int i = 0; i < apTry4.getChildren().size(); i++) {
            ((Circle)apTry4.getChildren().get(i)).setFill(Color.LIGHTGRAY);
            loopThroughCircleresources(apTry4.getChildren().get(i), i, btn4);
        }
        for (int i = 0; i < apTry5.getChildren().size(); i++) {
            ((Circle)apTry5.getChildren().get(i)).setFill(Color.LIGHTGRAY);
            loopThroughCircleresources(apTry5.getChildren().get(i), i, btn5);
        }
        for (int i = 0; i < apTry6.getChildren().size(); i++) {
            ((Circle)apTry6.getChildren().get(i)).setFill(Color.LIGHTGRAY);
            loopThroughCircleresources(apTry6.getChildren().get(i), i, btn6);
        }
        for (int i = 0; i < apTry7.getChildren().size(); i++) {
            ((Circle)apTry7.getChildren().get(i)).setFill(Color.LIGHTGRAY);
            loopThroughCircleresources(apTry7.getChildren().get(i), i, btn7);
        }
        for (int i = 0; i < apTry8.getChildren().size(); i++) {
            ((Circle)apTry8.getChildren().get(i)).setFill(Color.LIGHTGRAY);
            loopThroughCircleresources(apTry8.getChildren().get(i), i, btn8);
        }
        for (int i = 0; i < apTry9.getChildren().size(); i++) {
            ((Circle)apTry9.getChildren().get(i)).setFill(Color.LIGHTGRAY);
            loopThroughCircleresources(apTry9.getChildren().get(i), i, btn9);
        }

        for (int i = 0; i < ck0.getChildren().size(); i++) {
            ((Circle)ck0.getChildren().get(i)).setFill(Color.DARKGRAY);
        }
        for (int i = 0; i < ck1.getChildren().size(); i++) {
            ((Circle)ck1.getChildren().get(i)).setFill(Color.DARKGRAY);
        }
        for (int i = 0; i < ck2.getChildren().size(); i++) {
            ((Circle)ck2.getChildren().get(i)).setFill(Color.DARKGRAY);
        }
        for (int i = 0; i < ck3.getChildren().size(); i++) {
            ((Circle)ck3.getChildren().get(i)).setFill(Color.DARKGRAY);
        }
        for (int i = 0; i < ck4.getChildren().size(); i++) {
            ((Circle)ck4.getChildren().get(i)).setFill(Color.DARKGRAY);
        }
        for (int i = 0; i < ck9.getChildren().size(); i++) {
            ((Circle)ck9.getChildren().get(i)).setFill(Color.DARKGRAY);
        }
        for (int i = 0; i < ck5.getChildren().size(); i++) {
            ((Circle)ck5.getChildren().get(i)).setFill(Color.DARKGRAY);
        }
        for (int i = 0; i < ck6.getChildren().size(); i++) {
            ((Circle)ck6.getChildren().get(i)).setFill(Color.DARKGRAY);
        }
        for (int i = 0; i < ck7.getChildren().size(); i++) {
            ((Circle)ck7.getChildren().get(i)).setFill(Color.DARKGRAY);
        }
        for (int i = 0; i < ck8.getChildren().size(); i++) {
            ((Circle)ck8.getChildren().get(i)).setFill(Color.DARKGRAY);
        }
        seq = new Sequence();
    }

    private void changeColor(Node n, int i, Button btn, int delta) {
    	if (btn.isVisible()) {
            Circle oldCircle = null;

            if (oldCircle != n) {
                counter = 0;
            }
            String fill = ((Circle) n).getFill().toString();
            for (int j = 0; j < imgPatterns.length; j++) {
                if (imgPatterns[j].toString().equals(fill)) {
                	if(delta > 0)
                		counter = j+1;
                	else if(delta < 0)
                		counter = j-1;
                    break;
                }
            }
            
            if(counter == -1)
            	counter = 7;
            else if(counter == 8)
            	counter = 0;
            
            ((Circle) n).setFill(imgPatterns[counter]);
            seqToTry[i] = colors.getColors()[counter];
            oldCircle = (Circle) n;
        }
    }
    
    private void loopThroughCircleresources(Node n, int i, Button btn) {

        if (n instanceof Circle) {

        	n.setOnScroll(event -> {
        		int delta = Integer.signum((int)event.getDeltaY());
        		changeColor(n, i, btn, delta);
        	});
        	
        	n.setOnMouseClicked(event -> {
        		int delta = 0;
        		if(event.getButton() == MouseButton.PRIMARY)
        			delta = 1;
        		else if(event.getButton() == MouseButton.SECONDARY)
        			delta = -1;
        		changeColor(n, i, btn, delta);
        	});
        }
    }

    @FXML
    private void clickOnBtn0() {
        checkSequence(apTry0, ck0, btn0, btn1);
    }
    @FXML
    private void clickOnBtn1() {
        checkSequence(apTry1, ck1, btn1, btn2);
    }
    @FXML
    private void clickOnBtn2() {
        checkSequence(apTry2, ck2, btn2, btn3);
    }
    @FXML
    private void clickOnBtn3() {
        checkSequence(apTry3, ck3, btn3, btn4);
    }
    @FXML
    private void clickOnBtn4() {
        checkSequence(apTry4, ck4, btn4, btn5);
    }
    @FXML
    private void clickOnBtn5() {
        checkSequence(apTry5, ck5, btn5, btn6);
    }
    @FXML
    private void clickOnBtn6() {
        checkSequence(apTry6, ck6, btn6, btn7);
    }
    @FXML
    private void clickOnBtn7() {
        checkSequence(apTry7, ck7, btn7, btn8);
    }
    @FXML
    private void clickOnBtn8() {
        checkSequence(apTry8, ck8, btn8, btn9);
    }
    @FXML
    private void clickOnBtn9() {
        checkSequence(apTry9, ck9, btn9, btn10);
    }

    @FXML
    private void clickOnBtn10() {
        initialize(location, resources);
    }

    private void checkSequence(AnchorPane apTry, AnchorPane ck, Button btn1, Button btn2) {
        rightColorAndPosition = 0;
        rightColor = 0;
        boolean allChosenCircles = true;
        for (Node n : apTry.getChildren()) {

            if (n instanceof Circle) {

                try {
                    Color fill = (Color) ((Circle) n).getFill();
                    if (fill instanceof Color) {
                        allChosenCircles = false;
                        break;
                    }
                } catch (Exception ie) {
                    //handles InvocationTargetException when Circle has image instead of color fill
                }
            }
        }
        if (!allChosenCircles) {
            Alert dialogBox = new Alert(Alert.AlertType.ERROR);
            dialogBox.setTitle("Error");
            dialogBox.setHeaderText("Selection error");
            dialogBox.setContentText("Please select a color for every button!");
            dialogBox.showAndWait();
        } else {
            for (int i = 0; i < seqToTry.length; i++) {

                for (int j = 0; j < seq.getSeqOfColors().length; j++) {
                    if (seqToTry[i].equals(seq.getSeqOfColors()[j]) && i == j) {
                        rightColorAndPosition++;
                    } else if (seqToTry[i].equals(seq.getSeqOfColors()[j]) && i != j) {
                        rightColor++;
                    }
                }

            }
            for (int i = 0; i < rightColorAndPosition; i++) {

                for (int j = 0; j < ck.getChildren().size(); j++) {

                    if (((Circle) ck.getChildren().get(j)).getFill() != Color.RED && (((Circle) ck.getChildren().get(j)).getFill() != Color.WHITE)) {
                        ((Circle) ck.getChildren().get(j)).setFill(Color.RED);
                        break;
                    }

                }
            }
            for (int i = 0; i < rightColor; i++) {
                for (int j = 0; j < ck.getChildren().size(); j++) {

                    if (((Circle) ck.getChildren().get(j)).getFill() != Color.WHITE && (((Circle) ck.getChildren().get(j)).getFill() != Color.RED)) {
                        ((Circle) ck.getChildren().get(j)).setFill(Color.WHITE);
                        break;
                    }
                }
            }
            btn1.setVisible(false);
            btn2.setVisible(true);
            if (rightColorAndPosition == 4) {

                for (int i = 0; i < seqToTry.length; i++) {
                    ((Circle)apTry10.getChildren().get(i)).setFill(new ImagePattern(new Image("resources/buttonMastermind" + seqToTry[i] + ".png")));
                }

                btn10.setVisible(true);
                btn2.setVisible(false);
                Alert dialogBox = new Alert(Alert.AlertType.INFORMATION);
                dialogBox.setTitle("Congrats! :)");
                dialogBox.setHeaderText("You win!");
                dialogBox.setContentText("You got the correct sequence! You win!");
                dialogBox.showAndWait();
            }

            if (apTry == apTry9 && rightColorAndPosition != 4) {

                for (int i = 0; i < seq.getSeqOfColors().length; i++) {
                    ((Circle)apTry10.getChildren().get(i)).setFill(new ImagePattern(new Image("resources/buttonMastermind" + seq.getSeqOfColors()[i] + ".png")));
                }

                Alert dialogBox = new Alert(Alert.AlertType.INFORMATION);
                dialogBox.setTitle("Too bad!");
                dialogBox.setHeaderText("You lose!");
                dialogBox.setContentText("You didn't guess the correct sequence. But I'll show it to you anyway :)");
                dialogBox.showAndWait();
            }

        }
    }
}
