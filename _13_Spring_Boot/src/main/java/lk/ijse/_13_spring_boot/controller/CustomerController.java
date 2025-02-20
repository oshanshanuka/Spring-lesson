package lk.ijse._13_spring_boot.controller;

import lk.ijse._13_spring_boot.dto.CustomerDTO;
import lk.ijse._13_spring_boot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

   /*@PostMapping(path = "save")
   public String getCustomer(@RequestBody CustomerDTO customerDTO){
       System.out.println(customerDTO.getName());
       return "customerDTO";
   }*/

    @PostMapping(path = "save")
    public Boolean getCustomer(@RequestBody CustomerDTO customerDTO) {
        boolean res = customerService.save(customerDTO);
        System.out.println(customerDTO.getName());
        return res;
    }

    @GetMapping(path = "/get")
    public List<CustomerDTO> getAllCustomers(){
        return customerService.getAll();
    }

    @DeleteMapping(path = "/delete/{id}")
    public boolean deleteCustomer(@PathVariable int id){
        return customerService.delete(id);
    }

    @PutMapping(path = "/update")
    public boolean updateCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.update(customerDTO);
    }
}
