package esercizioUno;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerUtil {

    //connessione con il file xml persistence creato prima
    private  static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("gestioneEventi");


    // get per accedere al metodo privato
    static EntityManager getEntityManager(){
        return  emf.createEntityManager();
    }

    // per chiudere
    public  static void close(){
        emf.close();
    }

}
