package ec.edu.epn;

public class Main {

    public static void main(String[] args) {

        Administrador administradores[] = new Administrador[5];

        administradores[0] = new Administrador("1725996365", "Billy Proaño", "El condado", "0983333483", "billy97proano@hotmail.com");
        administradores[1] = new Administrador("1725969503", "Nathaly Mafla", "La macahal", "0983974092", "nathaly@hotmail.com");
        administradores[2] = new Administrador("1708394000", "Cecilia Morales", "Carcelen", "0987143826", "cecilia@hotmail.com");
        administradores[3] = new Administrador("1709492159", "Luis Proaño", "El Inca", "0984951424", "luis@hotmail.com");
        administradores[4] = new Administrador("1720540879", "Omar Proaño", "Calderoon", "0984276934", "omar@hotmail.com");

        for (int i = 0; i< administradores.length; i++){
            System.out.println("Datos de Administrador ->" +administradores[i].toString());
        }



    }

}
