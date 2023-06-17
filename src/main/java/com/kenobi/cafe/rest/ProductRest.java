package com.kenobi.cafe.rest;

import com.kenobi.cafe.wrapper.ProductWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/product")
public interface ProductRest {
    @PostMapping("/add")
    ResponseEntity<String> addProduct(@RequestBody Map<String, String> requestMap);
   @GetMapping("/get")
    ResponseEntity<List<ProductWrapper>> getAllProducts();
   @PostMapping("/update")
    ResponseEntity<String> updateProduct(@RequestBody Map<String, String> requestMap);
   @DeleteMapping("/delete/{id}")
    ResponseEntity<String> deleteProduct(@PathVariable Integer id);
   @PostMapping("/update-status")
    ResponseEntity<String> updateStatus(@RequestBody Map<String, String> requestMap);
   @GetMapping("/getByCategory/{id}")
    ResponseEntity<List<ProductWrapper>> getByCategory(@PathVariable Integer id);
   @GetMapping("/getById/{id}")
    ResponseEntity<ProductWrapper> getproductbyId(@PathVariable Integer id);
}
