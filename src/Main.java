public class Main {
    public static void main(String[] args) {
        Persona persona1 =  new Persona(2);
        Persona persona2 =  new Persona(2);
        System.out.println(persona1.compareTo(persona2));
    }
}
/* en este caso se implementa el metodo compareTo, cuando es negativo significa que el objeto que le pasamos por parametro es mayor que el primero, si es positivo el primero es
mayor, si son 0 entonces son iguales. */