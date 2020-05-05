package app;

import java.util.Scanner;

import app.personajes.Personaje;

public class App {
    public static Scanner Teclado = new Scanner (System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Harry Potter Game");
        System.out.println("Creado por Alex, Maggie y Dani");

        JuegoHP mijuegoHp = new JuegoHP();

        //JuegoHP.inicioJuegoHP();
        JuegoHP.agregarPersonajes();


        // Hago for loop para ver los personajes de la lista
        for(Personaje persona : JuegoHP.PersonajesLista) {
            System.out.println(persona.getNombre());
        }

        Personaje player1 = mijuegoHp.seleccionaPersonaje();
        //Personaje player2 = mijuegoHp.seleccionaPersonaje();

        System.out.println(player1.getNombre());
        
        //Personaje player1 = seleccionaPersonaje();
        //Personaje player2 = seleccionaPersonaje();



    }
}   
