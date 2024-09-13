package de.neuefische.java.cgnjava244springdata;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/oders")
public class OrderController {

    @GetMapping
    public void test() {
        throw new IllegalArgumentException("IlligaleARgument");
    }

}
