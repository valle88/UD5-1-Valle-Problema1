import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        Cola prueba = new Cola();


        System.out.println(prueba.numero);
        prueba.enqueque(3,5);
        System.out.println(prueba.numero);



       Cola float collection = new Cola(3)

        while (!salir) {
            System.out.println("Introduzca un nombre o pulse Q para salir");
            userInput = sc.nextLine();

            if (userInput.equals("Q")) {
                salir = true;
            } else {
                collection.insert(userInput, 0);
            }

            String aux;

            for (int i = 0; i < collection.length(); i++) {
                aux = collection.getElement(i);
                System.out.println(i + " - " + aux);
            }






    }
}
