package de.neuefische.java.cgnjava244springdata;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepo productRepo;

    public List<Product> findAll() {
        return productRepo.findAll();
    }

    public Product save(Product productToSave) {
        return productRepo.save(productToSave);
    }

    public Product getById(String id) {
        return productRepo.findById(id).orElseThrow(() -> new NoSuchElementException("Product with id: " + id + " not found!"));
    }
}
