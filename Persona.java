public class Persona  implements Comparable<Persona>{
    private String nombre;
    private int edad;
    
    public String getNombre() {
      return nombre;
    }
    public void setNombre(String nombre) {
      this.nombre = nombre;
    }
    public int getEdad() {
      return edad;
    }
    public void setEdad(int edad) {
      this.edad = edad;
    }
    public Persona(String nombre, int edad) {
      super();
      this.nombre = nombre;
      this.edad = edad;
    }
    @Override
    public int compareTo(Persona o) {
      
      if (this.getEdad()>o.getEdad()) {
        
        return 1;
      }else if (this.getEdad()<o.getEdad()) {
        return -1;
      }else {
        return 0;
      }
    }
  
    //@Override
    //public int compareTo(Persona o) {
        // Compara los nombres en orden alfabético .........
        //return this.nombre.compareTo(o.nombre);
    //}

  }