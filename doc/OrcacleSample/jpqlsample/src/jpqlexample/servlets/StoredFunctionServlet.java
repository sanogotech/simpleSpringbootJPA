package jpqlexample.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;
import java.util.Iterator;
import java.math.BigDecimal;
import jpqlexample.entities.*;

public class StoredFunctionServlet extends HttpServlet {
    @PersistenceUnit(unitName="jpqlexample-pu")
    private EntityManagerFactory emf;
    public void doGet(
        HttpServletRequest request,
        HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setBufferSize(8192);
        EntityManager em = emf.createEntityManager();
        PrintWriter out = response.getWriter();
        String sup_name ="Tortuga Trading";
        BigDecimal sum = (BigDecimal)em.createNativeQuery("SELECT sum_total(?1) FROM DUAL")
                      .setParameter(1, sup_name)
                      .getSingleResult(); 
        out.println("The total cost of the ordered products supplied by Tortuga Trading: " + sum +"<br/>");
        List<Customer> customers = (List<Customer>)em.createNativeQuery("SELECT * FROM customers", jpqlexample.entities.Customer.class)
                              .getResultList(); 
        Iterator i = customers.iterator();
        Customer cust;
        out.println("Customers: " + "<br/>");
        while (i.hasNext()) {
            cust = (Customer) i.next();
            out.println(cust.getCust_name() +"<br/>");
        }
    }
}
