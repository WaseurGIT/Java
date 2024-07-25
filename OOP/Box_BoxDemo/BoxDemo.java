public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();

        double vol;
        
        myBox.width = 10;
        myBox.height = 10;
        myBox.depth = 10;
        
        vol = myBox.width * myBox.height * myBox.depth;
        System.out.println("Volume: "+vol);
    }
}
