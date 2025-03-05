package lk.ijse._13_spring_boot.controller;

import lk.ijse._13_spring_boot.dto.OrderDTO;
import lk.ijse._13_spring_boot.service.OrderService;
import lk.ijse._13_spring_boot.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/placeOrder")
public class PlaceOrderController {
//    @Autowired
//    private OrderService orderService;
//
//    @PostMapping("/save")
//    public ResponseUtil saveOrder(@RequestBody OrderDTO orderDTO) {
//        orderService.saveOrder(orderDTO);
//        return new ResponseUtil(200, "Order Placed Successfully.", null);
//    }
//
//    @GetMapping("/getAll")
//    public ResponseUtil getAllOrders() {
//        return new ResponseUtil(200, "Retrieved Orders Successfully.", orderService.getAllOrders());
//    }
//
//    @GetMapping("/search/{id}")
//    public ResponseUtil getOrderById(@PathVariable String id) {
//        return new ResponseUtil(200, "Order Found Successfully", orderService.getOrderById(id));
//    }
}
