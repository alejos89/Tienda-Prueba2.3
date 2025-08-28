// Main.java
import control.TiendaFetcher;
import views.Dashboard;

public class Main {
    public static void main(String[] args) {
     
   String saludo = "hola";


   
        try {
             

              String urlApi= "https://jsonplaceholder.typicode.com/posts";
              String respuesta = TiendaFetcher.obtenerProductos(urlApi);
              System.out.println("Respuesta de la API");

                

              Dashboard ola= new Dashboard(respuesta);

                for (int i = 0; i < respuesta.length(); i++) {
                    String letra =""+respuesta.charAt(i);
                    if (letra.equalsIgnoreCase("o")) {
                        System.out.println(respuesta.charAt(i));
                        
                    }

                    
                 }
             
        } catch (Exception e) {}
            // TODO: handle exception
    }
}