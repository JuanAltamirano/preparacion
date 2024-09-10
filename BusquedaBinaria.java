public class BusquedaBinaria {
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
