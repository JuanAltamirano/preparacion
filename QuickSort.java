public class QuickSort {
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

