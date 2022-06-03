package com.example.reamohetse;

import javafx.animation.*;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;



public class HelloApplication extends Application {


    VBox myLabel = new VBox();

    Label settingpoints;
    Label scoreshape;

    Duration timeDuration1 = Duration.millis(15000);
    Duration timeDuration2 = Duration.millis(9000);
    Duration timeDuration3 = Duration.millis(14000);
    Duration timeDuration4 = Duration.millis(6000);
    Duration timeDuration5 = Duration.millis(11000);


    Duration time_Duration1 = Duration.millis(15000);
    Duration time_Duration2 = Duration.millis(17000);
    Duration time_Duration3 = Duration.millis(12000);
    Duration time_Duration4 = Duration.millis(20000);
    Duration time_Duration5 = Duration.millis(15000);
    Duration time_Duration6 = Duration.millis(17000);
    Duration time_Duration7 = Duration.millis(12000);
    Duration time_Duration8 = Duration.millis(20000);

    TranslateTransition coin1 = new TranslateTransition(time_Duration1);
    TranslateTransition coin2 = new TranslateTransition(time_Duration2);
    TranslateTransition coin3 = new TranslateTransition(time_Duration3);
    TranslateTransition coin4 = new TranslateTransition(time_Duration4);
    TranslateTransition coin5 = new TranslateTransition(time_Duration5);
    TranslateTransition coin6 = new TranslateTransition(time_Duration6);
    TranslateTransition coin7 = new TranslateTransition(time_Duration7);
    TranslateTransition coin8 = new TranslateTransition(time_Duration8);

    TranslateTransition clouldsTrans1 = new TranslateTransition(timeDuration1);
    TranslateTransition clouldsTrans2 = new TranslateTransition(timeDuration2);
    TranslateTransition clouldsTrans3 = new TranslateTransition(timeDuration3);
    TranslateTransition clouldsTrans4 = new TranslateTransition(timeDuration4);
    TranslateTransition clouldsTrans5 = new TranslateTransition(timeDuration5);


    SequentialTransition seq1;
    SequentialTransition seq2;
    SequentialTransition seq3;
    SequentialTransition seq4;
    SequentialTransition seq5;
    SequentialTransition seq6;
    SequentialTransition seq7;
    SequentialTransition seq8;


    SequentialTransition seqT1;
    SequentialTransition seqT2;
    SequentialTransition seqT3;
    SequentialTransition seqT4;
    SequentialTransition seqT5;


    Rectangle rectangle1 = new Rectangle(180,100);
    String source = getClass().getResource("/plane2.png").toExternalForm();
    Image image = new Image(source);
    ImageView imageView = new ImageView(image);


    Rectangle shape2 = new Rectangle(85,60);
    String source1 = getClass().getResource("/kingCoin.png").toExternalForm();
    Image point1 = new Image(source1);

    Rectangle shape3 = new Rectangle(85,60);
    String source2 = getClass().getResource("/kingCoin.png").toExternalForm();
    Image point2 = new Image(source2);

    Rectangle shape4 = new Rectangle(85,60);
    String source3 = getClass().getResource("/kingCoin.png").toExternalForm();
    Image point3 = new Image(source3);

    Rectangle shape5 = new Rectangle(85,60);
    String source4 = getClass().getResource("/kingCoin.png").toExternalForm();
    Image point4 = new Image(source4);

    Rectangle shape6 = new Rectangle(85,60);
    String source5 = getClass().getResource("/kingCoin.png").toExternalForm();
    Image point5 = new Image(source5);

    Rectangle shape7 = new Rectangle(85,60);
    String source6 = getClass().getResource("/kingCoin.png").toExternalForm();
    Image point6 = new Image(source6);

    Rectangle shape8 = new Rectangle(85,60);
    String source7 = getClass().getResource("/kingCoin.png").toExternalForm();
    Image point7 = new Image(source7);

    Rectangle shape9 = new Rectangle(85,60);
    String source8 = getClass().getResource("/kingCoin.png").toExternalForm();
    Image point8 = new Image(source8);

    //Creating images clouds
    Rectangle rectangle2 = new Rectangle(180,100);
    String source_1 = getClass().getResource("/blueCloud.png").toExternalForm();
    Image image1 = new Image(source_1);


    Rectangle shape_2 = new Rectangle(180,100);
    String source_2 = getClass().getResource("/blueCloud.png").toExternalForm();
    Image image2 = new Image(source_2);


    Rectangle shape_3 = new Rectangle(480,230);
    String source_3 = getClass().getResource("/blueCloud.png").toExternalForm();
    Image image3 = new Image(source_3);

    Rectangle shape_4 = new Rectangle(480,230);
    String source_4 = getClass().getResource("/blueCloud.png").toExternalForm();
    Image image4 = new Image(source_4);

    Rectangle shape_5 = new Rectangle(180,100);
    String source_5 = getClass().getResource("/blueCloud.png").toExternalForm();
    Image image5 = new Image(source_5);

    //to create score
    int score;
    @Override
    public void start(Stage stage) {

        Pane playing = new Pane();

        rectangle2.setFill(new ImagePattern(image1));

        shape_5.setFill(new ImagePattern(image5));

        shape_2.setFill(new ImagePattern(image2));

        shape_3.setFill(new ImagePattern(image3));

        shape_4.setFill(new ImagePattern(image4));

        shape2.setFill(new ImagePattern(point1));

        shape3.setFill(new ImagePattern(point2));

        shape4.setFill(new ImagePattern(point3));

        shape5.setFill(new ImagePattern(point4));

        shape6.setFill(new ImagePattern(point5));

        shape7.setFill(new ImagePattern(point6));

        shape8.setFill(new ImagePattern(point7));

        shape9.setFill(new ImagePattern(point8));

        coin1.setToX(-2000f);
        coin1.setToY(1000);
        coin1.setCycleCount(500);
        coin1.setAutoReverse(false);

        seq1 = new SequentialTransition (shape2, coin1);


        coin2.setToX(-2000f);
        coin2.setToY(1200);
        coin2.setCycleCount(500);
        coin2.setAutoReverse(false);

        seq2 = new SequentialTransition (shape3, coin2);

        coin3.setToX(-2000f);
        coin3.setToY(1400);
        coin3.setCycleCount(500);
        coin3.setAutoReverse(false);

        seq3 = new SequentialTransition (shape4, coin3);

        coin4.setToX(-2000f);
        coin4.setToY(1600);
        coin4.setCycleCount(500);
        coin4.setAutoReverse(false);

        seq4 = new SequentialTransition (shape5, coin4);

        coin5.setToX(-2000f);
        coin5.setToY(1800);
        coin5.setCycleCount(500);
        coin5.setAutoReverse(false);

        seq5 = new SequentialTransition (shape6, coin5);

        coin6.setToX(-2000f);
        coin6.setToY(800);
        coin6.setCycleCount(500);
        coin6.setAutoReverse(false);

        seq6 = new SequentialTransition (shape7, coin6);

        coin7.setToX(-2000f);
        coin7.setToY(2000);
        coin7.setCycleCount(500);
        coin7.setAutoReverse(false);

        seq7 = new SequentialTransition (shape8, coin7);

        coin8.setToX(-2000f);
        coin8.setToY(600);
        coin8.setCycleCount(500);
        coin8.setAutoReverse(false);

        seq8 = new SequentialTransition (shape9, coin8);

        clouldsTrans1 .setToX(-2000f);
        clouldsTrans1 .setCycleCount(500);
        clouldsTrans1 .setAutoReverse(false);

        seqT1 = new SequentialTransition (rectangle2, clouldsTrans1 );

        clouldsTrans2.setToX(-2000f);
        clouldsTrans2.setCycleCount(500);
        clouldsTrans2.setAutoReverse(false);

        seqT2 = new SequentialTransition (shape_2, clouldsTrans2);

        clouldsTrans3.setToX(-2000f);
        clouldsTrans3.setCycleCount(500);
        clouldsTrans3.setAutoReverse(false);

        seqT3 = new SequentialTransition (shape_3, clouldsTrans3);

        clouldsTrans4.setToX(-2000f);
        clouldsTrans4.setCycleCount(500);
        clouldsTrans4.setAutoReverse(false);

        seqT4 = new SequentialTransition (shape_4, clouldsTrans4);

        clouldsTrans5.setToX(-2000f);
        clouldsTrans5.setCycleCount(500);
        clouldsTrans5.setAutoReverse(false);

        seqT5 = new SequentialTransition (shape_5, clouldsTrans5);

        Group imageClouds = new Group(SettingLabel(),Score(),myLabel,shape_2,shape_3,shape_4,shape2,shape3,shape4,shape5,shape6,shape7,shape8,shape9,playing);


        rectangle2.setX(1400);
        rectangle2.setY(50);
        shape_2.setX(1400);
        shape_2.setY(400);
        shape_3.setX(1400);
        shape_3.setY(800);
        shape_4.setX(1400);
        shape_4.setY(500);
        shape_5.setX(1400);
        shape_5.setY(100);


        shape2.setX(400);
        shape2.setY(-50);
        shape3.setX(600);
        shape3.setY(-50);
        shape4.setX(700);
        shape4.setY(-50);
        shape5.setX(850);
        shape5.setY(-50);
        shape6.setX(900);
        shape6.setY(-50);
        shape7.setX(950);
        shape7.setY(-50);
        shape8.setX(1000);
        shape8.setY(-50);
        shape9.setX(1050);
        shape9.setY(-50);

        Scene scene = new Scene(imageClouds,1400, 700);

        ImageView plainImage = CreatingAttacker(scene);

        playing.getChildren().addAll(rectangle1,rectangle2,shape_2,shape_3,shape_4,shape_5,settingpoints);

        scene.addEventFilter(KeyEvent.KEY_PRESSED, event -> {
            double y = rectangle1.getY();
            double x = rectangle1.getX();

            if(event.getCode()==KeyCode.UP){
                rectangle1.setY(y-10);
            }
            else if(event.getCode()==KeyCode.DOWN){
                rectangle1.setY(y+10);
            }
            else if(event.getCode()==KeyCode.RIGHT){
                rectangle1.setX(x+10);
            }
            else if(event.getCode()==KeyCode.LEFT){
                rectangle1.setX(x-10);
            }
            else if(event.getCode()==KeyCode.ENTER){
                playGame();
            }
            if(event.getCode() == KeyCode.SPACE){
                seq1.pause();
                seq2.pause();
                seq3.pause();
                seq4.pause();
                seqT1.pause();
                seqT2.pause();
                seqT2.pause();
                seqT3.pause();
                seqT4.pause();
                seqT5.pause();
            }
        });

        stage.setTitle("IN CLOUD GAME");
        stage.setScene(scene);
        stage.show();
    }



    public void PauseMethod(){
        seq1.pause();
        seq2.pause();
        seq3.pause();
        seq4.pause();
        seqT1.pause();
        seqT2.pause();
        seqT2.pause();
        seqT3.pause();
        seqT4.pause();
        seqT5.pause();

    }


    private ImageView CreatingAttacker(Scene scene) {

        rectangle1.setFill(new ImagePattern(image));
        rectangle1.setX(100);
        rectangle1.setY(200);
        imageView.setFitWidth(130);
        imageView.setFitHeight(80);
        imageView.setY(scene.getHeight() - imageView.getFitHeight());

        return imageView;
    }
    private Label SettingLabel() {
        scoreshape = new Label(
                "\nStart the Game press ENTER\nPoints :"
        );

        scoreshape.setLayoutX(70);
        scoreshape.setLayoutY(600);
        scoreshape.setTextFill(Color.BLACK);
        scoreshape.setFont(Font.font("Arial", FontWeight.BOLD,20));
        return scoreshape;
    }
    private Label Score() {
        score=0;

        settingpoints = new Label();
        settingpoints.setText(score+"");
        settingpoints.setLayoutX(150);
        settingpoints.setLayoutY(650);
        myLabel.getChildren().add(settingpoints);
        settingpoints.setTextFill(Color.BLACK);
        settingpoints.setFont(Font.font("Arial", FontWeight.BOLD,18));
        rectangle1.translateXProperty().addListener(observable -> {

        });

        shape2.translateXProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                if (rectangle1.getBoundsInParent().intersects(shape2.getBoundsInParent())){
                    FadeTransition fade = new FadeTransition(Duration.millis(500),shape2);
                    fade.setFromValue(1.0f);
                    fade.setToValue(0.5f);
                    fade.setCycleCount(2);
                    fade.setAutoReverse(true);
                    shape2.setFill(Color.WHITE);
                }
            }
        });

        shape3.translateXProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                if (rectangle1.getBoundsInParent().intersects(shape3.getBoundsInParent())){
                    FadeTransition fade = new FadeTransition(Duration.millis(500),shape2);
                    fade.setFromValue(1.0f);
                    fade.setToValue(0.5f);
                    fade.setCycleCount(2);
                    fade.setAutoReverse(true);
                    shape3.setFill(Color.WHITE);
                }
            }
        });

        shape4.translateXProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                if (rectangle1.getBoundsInParent().intersects(shape4.getBoundsInParent())){
                    FadeTransition fade = new FadeTransition(Duration.millis(500),shape2);
                    fade.setFromValue(1.0f);
                    fade.setToValue(0.5f);
                    fade.setCycleCount(2);
                    fade.setAutoReverse(true);
                    shape4.setFill(Color.WHITE);
                }
            }
        });

        shape5.translateXProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                if (rectangle1.getBoundsInParent().intersects(shape5.getBoundsInParent())){
                    FadeTransition fade = new FadeTransition(Duration.millis(500),shape2);
                    fade.setFromValue(1.0f);
                    fade.setToValue(0.5f);
                    fade.setCycleCount(2);
                    fade.setAutoReverse(true);
                    shape5.setFill(Color.WHITE);
                }
            }
        });

        shape6.translateXProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                if (rectangle1.getBoundsInParent().intersects(shape6.getBoundsInParent())){
                    FadeTransition fade = new FadeTransition(Duration.millis(500),shape6);
                    fade.setFromValue(1.0f);
                    fade.setToValue(0.5f);
                    fade.setCycleCount(2);
                    fade.setAutoReverse(true);
                    shape6.setFill(Color.WHITE);
                }
            }
        });

        shape7.translateXProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                if (rectangle1.getBoundsInParent().intersects(shape7.getBoundsInParent())){
                    FadeTransition fade = new FadeTransition(Duration.millis(500),shape7);
                    fade.setFromValue(1.0f);
                    fade.setToValue(0.5f);
                    fade.setCycleCount(2);
                    fade.setAutoReverse(true);
                    shape7.setFill(Color.WHITE);
                }
            }
        });

        shape8.translateXProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                if (rectangle1.getBoundsInParent().intersects(shape8.getBoundsInParent())){
                    FadeTransition fade = new FadeTransition(Duration.millis(500),shape8);
                    fade.setFromValue(1.0f);
                    fade.setToValue(0.5f);
                    fade.setCycleCount(2);
                    fade.setAutoReverse(true);
                    shape8.setFill(Color.WHITE);
                }
            }
        });

        shape9.translateXProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                if (rectangle1.getBoundsInParent().intersects(shape9.getBoundsInParent())){
                    FadeTransition fade = new FadeTransition(Duration.millis(500),shape9);
                    fade.setFromValue(1.0f);
                    fade.setToValue(0.5f);
                    fade.setCycleCount(2);
                    fade.setAutoReverse(true);
                    shape9.setFill(Color.WHITE);
                }
            }
        });

        rectangle2.translateXProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {

                if (rectangle1.getBoundsInParent().intersects(rectangle2.getBoundsInParent())){
                    String image= getClass().getResource("/gameover.jpg").toExternalForm();
                    Image crash = new Image(image);
                    rectangle1.setFill(new ImagePattern(crash));
                    PauseMethod();
                    rectangle2.setOpacity(0.2);
                } else if (rectangle1.getBoundsInParent().intersects(shape_2.getBoundsInParent())) {
                    String image= getClass().getResource("/gameover.jpg").toExternalForm();
                    Image crash= new Image(image);
                    rectangle1.setFill(new ImagePattern(crash));
                    PauseMethod();
                    shape_2.setOpacity(0.2);
                } else if (rectangle1.getBoundsInParent().intersects(shape_3.getBoundsInParent())) {
                    String image= getClass().getResource("/gameover.jpg").toExternalForm();
                    Image crash= new Image(image);
                    rectangle1.setFill(new ImagePattern(crash));
                    PauseMethod();
                    shape_3.setOpacity(0.2);
                } else if (rectangle1.getBoundsInParent().intersects(shape_4.getBoundsInParent())) {
                    String image = getClass().getResource("/gameover.jpg").toExternalForm();
                    Image crash= new Image(image);
                    rectangle1.setFill(new ImagePattern(crash));
                    PauseMethod();
                    shape_4.setOpacity(0.2);
                }
                else if (rectangle1.getBoundsInParent().intersects(shape_5.getBoundsInParent())) {
                    String icon= getClass().getResource("/gameover.jpg").toExternalForm();
                    Image crash= new Image(icon);
                    rectangle1.setFill(new ImagePattern(crash));
                    PauseMethod();
                    shape_5.setOpacity(0.2);
                }
                else if (rectangle1.getBoundsInParent().intersects(shape2.getBoundsInParent())) {
                    score+=25;
                    settingpoints.setText(score+" ");
                }
                else if (rectangle1.getBoundsInParent().intersects(shape3.getBoundsInParent())) {
                    score+=15;
                    settingpoints.setText(score+" ");
                }
                else if (rectangle1.getBoundsInParent().intersects(shape4.getBoundsInParent())) {
                    score+=5;
                    settingpoints.setText(score+" ");
                }
                else if (rectangle1.getBoundsInParent().intersects(shape5.getBoundsInParent())) {
                    score+=5;
                    settingpoints.setText(score+" ");
                }
                else if (rectangle1.getBoundsInParent().intersects(shape6.getBoundsInParent())) {
                    score+=35;
                    settingpoints.setText(score+" ");
                }
                else if (rectangle1.getBoundsInParent().intersects(shape7.getBoundsInParent())) {
                    score+=05;
                    settingpoints.setText(score+" ");
                }
                else if (rectangle1.getBoundsInParent().intersects(shape8.getBoundsInParent())) {
                    score+=15;
                    settingpoints.setText(score+" ");
                }
                else if (rectangle1.getBoundsInParent().intersects(shape9.getBoundsInParent())) {
                    score+=35;
                    settingpoints.setText(score+" ");
                }
            }
        });
        return settingpoints;
    }
    public void playGame(){
        seq1.play();
        seq2.play();
        seq3.play();
        seq4.play();
        seq5.play();
        seq6.play();
        seq7.play();
        seq8.play();
        seqT1.play();
        seqT2.play();
        seqT2.play();
        seqT3.play();
        seqT4.play();
        seqT5.play();

    }
    public static void main(String[] args) {
        launch();
    }
}