package com.eiv;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.eiv.model.ProvinciaEntity;

public class App {
    
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
    
    private EntityManagerFactory emf;
        
    public App() {
        this.emf = Persistence.createEntityManagerFactory("data-access-hibernate");
        
        try {
            org.h2.tools.Server.main();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    public void run() {
        
        ProvinciaEntity provinciaEntity = new ProvinciaEntity(10L, "TIERRA DEL FUEGO");
    
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(provinciaEntity);
        em.getTransaction().commit();
                
        List<ProvinciaEntity> provinciaEntities = (List<ProvinciaEntity>) em
                .createQuery("FROM ProvinciaEntity").getResultList();
        
        provinciaEntities.forEach(e -> System.out.println(e));
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese <0> para salir !!");
            int rv = -1;
            while (rv != 0) {
                rv = scanner.nextInt();
            }
        }
        
        em.close();
    }
}
