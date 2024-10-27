package sit.int202.demo1.entities;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TestJpa {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
//        Office office = entityManager.find(Office.class,"9");
//        entityManager.getTransaction().begin();
//        System.out.println(office);
//        Office newOffice = new Office();
//        newOffice.setOfficeCode("99");
//        newOffice.setCity("Bangkok");
//        newOffice.setAddressLine1("123 Pracha-Utid");
//        newOffice.setPhone("357-1138");
//        newOffice.setCountry("Thailand");
//        newOffice.setPostalCode("10140");
//        newOffice.setTerritory("NA");
//        newOffice.setState("N/A");
//        entityManager.persist(newOffice);
//        entityManager.getTransaction().commit();

        employee employee = entityManager.find(employee.class,1727);
        entityManager.getTransaction().begin();
        System.out.println(employee);
        employee newEmployee = new employee();
        newEmployee.setEmployeeNumber(1111);
        newEmployee.setFirstName("Pannakan");
        newEmployee.setLastName("Tongsan");
        newEmployee.setEmail("pannakan@gmail.com");
        newEmployee.setExtension("x1111");
        newEmployee.setOfficeCode("2");
        newEmployee.setJobTitle("VP Sales");
        newEmployee.setReportsTo(1002);
        entityManager.persist(newEmployee);
        entityManager.getTransaction().commit();
    }
}
