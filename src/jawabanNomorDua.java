public class jawabanNomorDua {
    public static void main(String[] args) {
        String[] shape = new String[]{"Triangel", "Cubes", "Circle"};
        for ( int i = 0; i < shape.length; i++ ){
            String changeShape = shape[i];
            if ( changeShape.contains("e")){
                System.out.println(shape[i].replace("e", "*"));
            }
        }
    }
}