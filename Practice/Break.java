public class Break {
    public static void main(String[] args) {
        int i=0;
        while (true) {
            //skips 3 and continue the loop
            if(i==3){
                i=i+1;
                continue;
            }
            
            System.out.println(i);
            i=i+1;
            if(i>5){
                break;
            }
        }
    }
}
