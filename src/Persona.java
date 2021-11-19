public class Persona implements Comparable{
    private int edad;

    public Persona(int edad) {
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void decirEdad(){
        System.out.println(getEdad());
    }

    @Override
    public int compareTo(Object o) {
        Persona p =  (Persona)o;

        return this.edad - p.getEdad();


    }
}
