public class Lista {
  private Nodo cabeza;  

  public Lista() {
    this.cabeza = null;
  }

  public void agregarAlInicio(int valor) {
    Nodo nuevo = new Nodo(valor);
    nuevo.setSiguiente(cabeza);
    cabeza = nuevo;
  }

  public void agregarAlFinal(int valor) {
    Nodo nuevo = new Nodo(valor);

    if (cabeza == null) {
      cabeza = nuevo;
      return;
    }

    Nodo tmp = cabeza;
    while (tmp.getSiguiente() != null) {
      tmp = tmp.getSiguiente();
    }
    tmp.setSiguiente(nuevo);
  }


  public void mostrarLista() {
    Nodo tmp = cabeza;

    while(tmp != null) {
      System.out.println(tmp.getValor());     
      tmp = tmp.getSiguiente(); 
    }
  }
}
