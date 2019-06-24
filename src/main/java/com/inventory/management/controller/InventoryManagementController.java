package com.inventory.management.controller;

import com.inventory.management.model.Inventory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class InventoryManagementController {

    @RequestMapping(value="/products/{id}",  method = RequestMethod.POST)
    public ResponseEntity<Object> getProduct(@PathVariable("id") String id) {
        return new ResponseEntity<>(Inventory.class, HttpStatus.OK);
    }

    @RequestMapping(value="/products/{id}", method=RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@PathVariable("id") String id,
                                                @RequestBody Inventory inventory) {

        return new ResponseEntity<>("Product is updated successsfully",
                HttpStatus.OK);
    }
}
