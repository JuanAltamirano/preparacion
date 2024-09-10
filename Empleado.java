public class Empleado {
    private int id;
    private String nombre;
    private double salario;

    public Empleado(int id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", salario=" + salario +
                '}';
    }

    // Clase interna QuickSort
    public static class QuickSort {
        public static void quickSort(Empleado[] empleados, int izquierda, int derecha) {
            if (izquierda < derecha) {
                int indiceParticion = particion(empleados, izquierda, derecha);
                quickSort(empleados, izquierda, indiceParticion);
                quickSort(empleados, indiceParticion + 1, derecha);
            }
        }

        private static int particion(Empleado[] empleados, int izquierda, int derecha) {
            Empleado pivote = empleados[izquierda];
            while (true) {
                while (empleados[izquierda].getId() < pivote.getId()) {
                    izquierda++;
                }
                while (empleados[derecha].getId() > pivote.getId()) {
                    derecha--;
                }
                if (izquierda >= derecha) {
                    return derecha;
                } else {
                    Empleado temp = empleados[izquierda];
                    empleados[izquierda] = empleados[derecha];
                    empleados[derecha] = temp;
                    izquierda++;
                    derecha--;
                }
            }
        }
    }

    // Clase interna BusquedaBinaria
    public static class BusquedaBinaria {
        public static int busquedaBinaria(Empleado[] empleados, int id) {
            int izquierda = 0;
            int derecha = empleados.length - 1;
            while (izquierda <= derecha) {
                int medio = izquierda + (derecha - izquierda) / 2;
                if (empleados[medio].getId() == id) {
                    return medio;
                }
                if (empleados[medio].getId() < id) {
                    izquierda = medio + 1;
                } else {
                    derecha = medio - 1;
                }
            }
            return -1; // No encontrado
        }
    }
}
