package br.edu.fatecfranca.exe3;

import java.time.LocalDate;

public class Reservation {
    private int id;
    private LocalDate date;
    private Passenger passenger;

    public Reservation(int id, LocalDate date, Passenger passenger) {
        this.id = id;
        this.date = date;
        this.passenger = passenger;
    }

    public Reservation(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "\nReservation{" +
                "id=" + id +
                ", date=" + date +
                ", passenger=" + passenger +
                '}';
    }
}
