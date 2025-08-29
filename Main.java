import control.TiendaFetcher;
import views.Dashboard;

public class Main {
    public static void main(String[] args) {
        String saludo = "hola";

        try {
            String urlApi = "https://jsonplaceholder.typicode.com/posts/4";
            String respuesta = TiendaFetcher.obtenerProductos(urlApi);
            System.out.println("Respuesta de la API");

            Dashboard ola = new Dashboard(respuesta);

            System.out.print("{\n");
            for (int i = 0; i < respuesta.length(); i++) {
                System.out.print(respuesta.charAt(i));
            }
            System.out.print("\n}");
        } catch (Exception e) {
          
        }
    }
}
