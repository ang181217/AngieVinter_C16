package co.com.ps.c12;
import java.util.Arrays;

public class TrabajoEnGrupo {

    // Organizar un arreglo de 10 números con stream y luego calcular la suma de ellos. El mensaje debe estar en enums.

    public static void main(String[] args) {

        int[] array = {1, 5, 6, 2, 9, 4, 1, 15, 10, 11};
        int arrarOrdenado = Arrays.stream(array).sorted().sum();

        Enum Enum = co.com.ps.c12.Enum.Mensaje;

        System.out.println(Enum.getMensaje() + " " + arrarOrdenado);


    }
}