package sample;

import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class CreateScrollbar {

    Rectangle r=new Rectangle(10,235,32.5,230);
    Group storerote;
    Circle sc;
    CreateScrollbar(){

    }

    CreateScrollbar(Group root){
        storerote=root;
        Rectangle r1=new Rectangle(18,250,16,200);
        Stop[] stops1 = new Stop[] { new Stop(0, javafx.scene.paint.Color.RED), new Stop(1, javafx.scene.paint.Color
                .RED)};
        javafx.scene.paint.LinearGradient lg1 = new javafx.scene.paint.LinearGradient(0,.5,1,.5,true, CycleMethod
                .REFLECT,stops1);
        r1.setFill(lg1);

        sc=new Circle(8);
        sc.setLayoutX(26.3);
        sc.setLayoutY(250);

        Stop[] stop = new Stop[] { new Stop(0, javafx.scene.paint.Color.BLACK), new Stop(1, javafx.scene.paint.Color
                .BLACK)};
        javafx.scene.paint.LinearGradient g = new javafx.scene.paint.LinearGradient(0,0,0,2,true, CycleMethod
                .REFLECT,stop);
        sc.setFill(g);
        root.getChildren().addAll(r1,sc);
    }

    public Circle getSc() {
        return sc;
    }
}