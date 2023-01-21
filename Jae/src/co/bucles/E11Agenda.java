package co.bucles;

public class E11Agenda {
    public static void main(String[] args) {
        String [][] agenda = new String[7][24];
        for (int i = 0; i < agenda.length; i++){
            for (int j = 0; j < agenda[i].length; j++){
                agenda[i][j] = "No tengo planes.";
            }
        }
        agenda[0][9] = "curso react";
        agenda[0][15] = "curso spring";
        agenda[1][9] = "curso ingles";
        agenda[1][15] = "curso node";
        agenda[6][15] = "Descanzar";

        for (int i = 0; i < agenda.length; i++){
            for (int j = 0; j < agenda[i].length; j++) {
                System.out.println(agenda[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
