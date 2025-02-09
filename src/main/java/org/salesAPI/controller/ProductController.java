package org.salesAPI.controller;

import org.salesAPI.model.Product;
import org.salesAPI.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/import")
public class ProductController {

    @Autowired
    private ProductService productService;

    // Endpoint zum Importieren von CSV-Daten
    @PostMapping("/csv")
    public String importCsvData(@RequestParam("file") String filePath) {
        productService.importCsvData(filePath);
        return "CSV Import erfolgreich!";
    }

    // Endpoint zum Importieren von Wetterdaten
    @PostMapping("/apiWeather")
    public String importWeatherData() {
        productService.importWeatherDataFromApi();
        return "Wetterdaten importiert!";
    }

    // CREATE: Produkt hinzufügen
    @PostMapping("/product")
    public Product createProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    // READ: Alle Produkte anzeigen
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // READ: Einzelnes Produkt anhand der ID anzeigen
    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    // UPDATE: Produkt aktualisieren
    @PutMapping("/product/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    // DELETE: Produkt löschen
    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}