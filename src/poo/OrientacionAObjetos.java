package poo;

public class OrientacionAObjetos {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();

        persona.nacer();
        persona.hablar();
        persona.caminar();
        persona.morir();
        
        persona2.nacer();
        persona2.hablar();
        
        persona3.caminar();
        persona3.morir();
        
        persona4.setNombre("Francisco");
        persona4.setEdad(26);
        
        System.out.println(persona4);
    }
}
