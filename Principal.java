import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Principal {
  public static void main(String[] args) {
  
    Persona p1= new Persona ("zedro, ",20);
    Persona p2= new Persona ("juan, ",30);
    Persona p3= new Persona ("maria, ",40);
    Persona p4= new Persona ("gema, ",15);
    
    ArrayList<Persona> lista= new ArrayList<Persona>();
    
    lista.add(p1);
    lista.add(p2);
    lista.add(p3);
    lista.add(p4);
    
    Collections.sort(lista);
    
    for (Persona p :lista) {
      System.out.print(p.getNombre());
      System.out.println(p.getEdad());
      
    }
    
  }
}