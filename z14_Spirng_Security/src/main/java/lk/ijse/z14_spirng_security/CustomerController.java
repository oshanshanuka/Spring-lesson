package lk.ijse.z14_spirng_security;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {
    private List<lk.ijse.z14_spirng_security.Customer> customers = new ArrayList<Customer>(
            List.of(new lk.ijse.z14_spirng_security.Customer("oshan",2),
                    new lk.ijse.z14_spirng_security.Customer("shanuka",3))
        );
    @GetMapping
    public List<lk.ijse.z14_spirng_security.Customer> getCustomers(){
        return customers;
    }
    @PostMapping
    public void addCustomer(@RequestBody lk.ijse.z14_spirng_security.Customer customer){
        customers.add(customer);
    }
    @GetMapping("csrftoken")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
