import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import enums.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of shapes:");
        Integer numShapes = sc.nextInt();
        List<Shape> shapeList = new ArrayList<>();
        for(int i=0; i<numShapes; i++){
            System.out.println("Shape #"+ (i+1)+ " data:");
            System.out.print("Rectangle or Circle?(r/c)");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED):");
            Color color = Color.valueOf(sc.next());

            if(ch == 'r'){

                System.out.print("Height:");
                Double height = sc.nextDouble();
                System.out.print("Width:");
                Double width = sc.nextDouble();

               Shape shape = new Rectangle(color,width, height);
               shapeList.add(shape);

            } else if(ch == 'c'){
                System.out.print("Radius:");
                Double radius = sc.nextDouble();
                Shape shape = new Circle(color,radius);
                shapeList.add(shape);
            }
        }
        System.out.println("SHAPE AREAS:");
        for(Shape shape : shapeList){
            System.out.printf("%.2f\n", shape.area());

        }
        sc.close();
    }
}