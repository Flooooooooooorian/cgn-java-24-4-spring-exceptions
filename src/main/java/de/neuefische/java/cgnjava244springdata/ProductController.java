package de.neuefische.java.cgnjava244springdata;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

//    public ProductController(ProductRepo productRepo) {
//        this.productRepo = productRepo;
//    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.findAll();
    }

    @PostMapping
    public Product saveProduct(@RequestBody Product productToSave) {
        return productService.save(productToSave);
    }

    @GetMapping("{id}")
    public Product getProductById(@PathVariable String id) {
        return productService.getById(id);
    }

    @ExceptionHandler(NoSuchElementException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleNoSuchElementException(NoSuchElementException e) {
        return e.getMessage();
    }
}
