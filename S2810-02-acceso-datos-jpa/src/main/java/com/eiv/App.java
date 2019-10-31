package com.eiv;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.eiv.entities.BarrioEntity;
import com.eiv.entities.LocalidadEntity;
import com.eiv.entities.ProvinciaEntity;

public class App {
    
    private EntityManagerFactory emf;
    private EntityManager em;
    
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
    
    public void run() {

        this.emf = Persistence.createEntityManagerFactory("data-access-hibernate");
        this.em = emf.createEntityManager();
        
        try {
            org.h2.tools.Server.main();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        em.getTransaction().begin();

        LocalidadEntity localidadEntity = em.find(LocalidadEntity.class, 1L);
        BarrioEntity barrioEntity = new BarrioEntity(localidadEntity, 2L);
        
        em.persist(barrioEntity);
        
        List<BarrioEntity> barrioEntities = (List<BarrioEntity>) em
                .createQuery("FROM BarrioEntity", BarrioEntity.class)
                .getResultList();

        em.getTransaction().commit();
        
        barrioEntities.forEach(e -> System.out.println(e));
        
        em.close();
        emf.close();

    }
    
    public void run3() {

        this.emf = Persistence.createEntityManagerFactory("data-access-hibernate");
        this.em = emf.createEntityManager();
        
        try {
            org.h2.tools.Server.main();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        em.getTransaction().begin();
        
        ProvinciaEntity provinciaEntity = em.find(ProvinciaEntity.class, 1L);
        provinciaEntity.getLocalidades().forEach(e -> System.out.println(e));
        
        em.getTransaction().commit();
        
        em.close();        
        emf.close();

    }
    
    public void run2() {

        this.emf = Persistence.createEntityManagerFactory("data-access-hibernate");
        this.em = emf.createEntityManager();
        
        try {
            org.h2.tools.Server.main();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        em.getTransaction().begin();
        
        List<LocalidadEntity> localidadEntities = (List<LocalidadEntity>) em
                .createQuery("FROM LocalidadEntity", LocalidadEntity.class)
                .getResultList();

        em.getTransaction().commit();
        em.close();
        
        localidadEntities.forEach(e -> System.out.println(e));
        
        emf.close();

    }
    
    @SuppressWarnings("unchecked")
    public void run1() {
        
        this.emf = Persistence.createEntityManagerFactory("data-access-hibernate");
        this.em = emf.createEntityManager();
        
        try {
            org.h2.tools.Server.main();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        ProvinciaEntity provinciaEntity = new ProvinciaEntity();
        provinciaEntity.setId(10L);
        provinciaEntity.setNombre("CATAMARCA");
        
        em.getTransaction().begin();
        em.persist(provinciaEntity);
        
        provinciaEntity.setNombre("SANTA FE - 2");
        
        em.getTransaction().commit();
        
        List<ProvinciaEntity> provinciaEntities = (List<ProvinciaEntity>) em
                .createQuery("FROM ProvinciaEntity").getResultList();
        
        provinciaEntities.forEach(e -> System.out.println(e));
        
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        sc.close();
        
        
        em.close();
        emf.close();
    }
}
