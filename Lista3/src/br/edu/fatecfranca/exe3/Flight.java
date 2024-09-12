package br.edu.fatecfranca.exe3;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private int id;
    private String origin;
    private String destination;
    private List<Reservation> reservations = new ArrayList<Reservation>();

    public Flight(int id, String origin, String destination) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
    }

    public Flight(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<Reservation> getReservation() {
        return reservations;
    }

    public void addReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", reservations=" + reservations +
                '}';
    }
}
