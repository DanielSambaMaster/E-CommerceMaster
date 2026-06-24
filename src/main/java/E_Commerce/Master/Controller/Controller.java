package E_Commerce.Master.Controller;


import E_Commerce.Master.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller
{

    @Autowired
    private ProductService service;

    @GetMapping("/c")
    public ResponseEntity <?>getProducts()
    {
        return ResponseEntity.ok(service.getAllProducts());
    }

    @PostMapping("/")
    public ResponseEntity postProducts()
    {
        return ResponseEntity.ok().build();
    }


}
