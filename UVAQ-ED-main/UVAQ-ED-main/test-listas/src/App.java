public class App {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();
        lista.agregarAlInicio(1);        
        lista.agregarAlInicio(2);
        lista.agregarAlInicio(3);
        lista.agregarAlInicio(4);
        lista.agregarAlFinal(5);

        lista.mostrarLista();
    }
}
