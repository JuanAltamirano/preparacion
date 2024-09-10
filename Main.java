public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = {
            new Empleado(3, "Juan", 3000),
            new Empleado(1, "Ana", 2500),
            new Empleado(4, "Luis", 4000),
            new Empleado(2, "Maria", 3500)
        };

        // Ordenar empleados por id usando QuickSort
        QuickSort.quickSort(empleados, 0, empleados.length - 1);

        // Imprimir empleados ordenados
        System.out.println("Empleados ordenados por ID:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }

        // Buscar un empleado por id usando búsqueda binaria
        int idABuscar = 2;
        int indice = BusquedaBinaria.busquedaBinaria(empleados, idABuscar);
        if (indice != -1) {
            System.out.println("Empleado encontrado: " + empleados[indice]);
        } else {
            System.out.println("Empleado con ID " + idABuscar + " no encontrado.");
        }
    }
}
