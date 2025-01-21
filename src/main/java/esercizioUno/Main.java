package esercizioUno;

import jakarta.persistence.EntityManager;

import java.time.LocalDate;

public class Main {
  public  static void  main(String[] args){

      EntityManager em =  EntityManagerUtil.getEntityManager();

     try
      {  em.getTransaction();

          //Istanza evento
          Evento evento1 = new Evento("Concerto Ed Sheeran", LocalDate.of(2025, 6, 3), Evento.TipoEvento.PUBBLICO, 100000);

          em.persist(evento1); //salva nel db

          em.getTransaction().commit(); //invio i comandi
      }
     catch (Exception e){
         if(em.getTransaction().isActive())
             em.getTransaction().rollback(); //annulla la persistenza in cado si errore
           e.printStackTrace(); //stampa l'errore

  } finally {
         em.close();
     }
     }
}
