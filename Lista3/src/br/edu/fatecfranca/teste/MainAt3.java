package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe3.Flight;
import br.edu.fatecfranca.exe3.Passenger;
import br.edu.fatecfranca.exe3.Reservation;

import java.time.LocalDate;

public class MainAt3 {

        public static void main(String[] args) {
            Passenger p1 = new Passenger(1, "Renan", "123.456.789-00");
            Passenger p2 = new Passenger(2, "Lyvia", "987.654.321-00");
            Reservation r1 = new Reservation(100, LocalDate.now(), p1);
            Reservation r2 = new Reservation(200, LocalDate.now(), p2);

            Flight flight = new Flight(1000, "Sao Paulo", "Paris");
            flight.addReservation(r1);
            flight.addReservation(r2);

            System.out.println(flight);
        }
    }

