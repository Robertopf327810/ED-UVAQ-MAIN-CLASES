import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        StackList stack = new StackList();
        while(true) {
            System.out.println("Opción:");
            System.out.println("1. Nueva URL");
            System.out.println("2. Back");
            System.out.println("3. Url Actual");
            System.out.println("4. Salir");

            int option = scan.nextInt();

            switch(option) {
                case 1:
                    System.out.println("Ingrese la URL: ");
                    String url = scan.next();
                    stack.newUrl(url);
                    break;
                case 2:
                    stack.back();                    
                    break;
                case 3: 
                    if(stack.getHead() != null) {
                        System.out.println("URL actual: " + stack.getHead().getUrl());
                    } else {
                        System.out.println("No hay páginas para retroceder");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }        
    }
}
