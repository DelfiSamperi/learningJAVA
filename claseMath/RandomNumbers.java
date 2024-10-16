package claseMath;

public class RandomNumbers {
    public static void main(String[] args) {
        double aux = Math.random()*355;
        int num1 = (int)((aux)+1);
        System.out.println("el numero random es: " + aux);
        System.out.println("el numero generado es: " + num1);
    };
};

