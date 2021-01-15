package ec.edu.epn;

public class Main {

    public static void main(String[] args) {

        Administrador administradores[] = new Administrador[5];

        administradores[0] = new Administrador("1725996365", "Billy Proaño", "El condado", "0983333483", "billy97proano@hotmail.com");
        administradores[1] = new Administrador("1725969503", "Nathaly Mafla", "La macahal", "0983974092", "nathaly@hotmail.com");
        administradores[2] = new Administrador("1708394000", "Cecilia Morales", "Carcelen", "0987143826", "cecilia@hotmail.com");
        administradores[3] = new Administrador("1709492159", "Luis Proaño", "El Inca", "0984951424", "luis@hotmail.com");
        administradores[4] = new Administrador("1720540879", "Omar Proaño", "Calderoon", "0984276934", "omar@hotmail.com");

        System.out.println("\n ADMINISTRADORES \n ");

        for (int i = 0; i< administradores.length; i++){
            System.out.println("Datos de Administrador ->" +administradores[i].toString());
        }

     //-------------------------------------- CLINETES -----------------------------------------------------------------------
        Cliente clientes[] = new Cliente[5];

        clientes[0] = new Cliente("1725969502", "Juan Perozo", "El Inca",
                "0989765641", "juan@homail.com");
        clientes[1] = new Cliente("1725960987", "Maria Perez", "El Condado",
                "0989765621", "maria@homail.com");
        clientes[2] = new Cliente("1725969512", "Caren Navarrete", "Carcelen",
                "0989765612", "carmne@homail.com");
        clientes[3] = new Cliente("1725969598", "Cristian Campos", "Colinas del norte",
                "0989765341", "cristian@homail.com");
        clientes[4] = new Cliente("1725543502", "Alexander Morales", "La Roldos",
                "0989765324", "alexander@homail.com");

        System.out.println("\n CLIENTES \n");
        for (int i = 0; i< administradores.length; i++){
            System.out.println("Datos de Cliente ->" +clientes[i].toString());
        }

    }

}
