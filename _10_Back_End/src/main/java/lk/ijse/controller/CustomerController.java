package lk.ijse.controller;

import lk.ijse.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    private List<CustomerDTO> customers = new ArrayList<>();

    @PostMapping("save")
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO) {
        customers.add(customerDTO);
        return customerDTO;
    }

    @PutMapping("update")
    public CustomerDTO updateCustomer(@RequestBody CustomerDTO customerDTO) {
        for (int i = 0; i < customers.size(); i++) {
            CustomerDTO existingCustomer = customers.get(i);
            if(existingCustomer.getId().equals(customerDTO.getId())) {
                existingCustomer.setName(customerDTO.getName());
                existingCustomer.setAddress(customerDTO.getAddress());
                existingCustomer.setAge(customerDTO.getAge());
                return existingCustomer;
            }
        }
        return customerDTO;
    }

    @GetMapping("getAll")
    public List<CustomerDTO> getAllCustomers() {
        List<CustomerDTO> customerDTOList = new ArrayList<>();
        return customers;
    }

    @DeleteMapping(path = "delete/{id}")
    public boolean deleteCustomer(@PathVariable(value = "id")String id) {
        for (int i = 0; i < customers.size(); i++) {
            CustomerDTO existingCustomer = customers.get(i);
            if(existingCustomer.getId().equals(id)) {
                customers.remove(i);
                return true;
            }
        }
        return false;
    }
}
