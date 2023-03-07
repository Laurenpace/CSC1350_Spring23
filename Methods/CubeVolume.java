package class_examples.CSC1350_Spring23.Methods;

public class CubeVolume {
    public static double cubeVolume(double sideLength){
        double volume = sideLength * sideLength * sideLength;
        return volume;
    }


    public static void main(String[] args) {
        double result1 = cubeVolume(2);
        double result2 = cubeVolume(10);

        System.out.println("A cube of side length 2 has volume  "  + result1);
        System.out.println("A cube of side length 10 has volume  " + result2);
    }

}
