package esercizioUno;

import jakarta.persistence.*;

import java.time.LocalDate;



@Entity
@Table (name = "eventi")
public class Evento {
    public enum TipoEvento {
        PUBBLICO,
        PRIVATO
    }

    @Id
    private Long id;

    @Column (name ="titolo")
    private String titolo;
    @Column (name="dataEvento")
    private LocalDate dataEvento;
    @Column (name = "tipoEvento")
    private TipoEvento tipoEvento;
    @Column (name="numMaxPax")
    private int numMaxPax;

    public Evento(String t, LocalDate dataE, TipoEvento tipoE, int numMaxPax){
        this.titolo = t;
        this.dataEvento = dataE;
        this.tipoEvento = tipoE;
        this.numMaxPax = numMaxPax;
    }





    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getNumMaxPax() {
        return numMaxPax;
    }

    public void setNumMaxPax(int numMaxPax) {
        this.numMaxPax = numMaxPax;
    }





}
