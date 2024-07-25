public class Box2 {
        double width, height, depth;

        Box2(){
            System.out.println("Constructor of Box2 class");
            width = 10;
            height = 5;
            depth = 10;
        }

        double volume(){
            return width*height*depth;
        }
    }

