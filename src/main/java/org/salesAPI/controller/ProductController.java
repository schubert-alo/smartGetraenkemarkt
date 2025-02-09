package org.salesAPI.controller;

import org.salesAPI.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/import")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/csv")
    public String importCsvData(@RequestParam("file") String filePath) {
        productService.importCsvData(filePath);
        return "CSV Import erfolgreich!";
    }

    @PostMapping("/apiWeather")
    public String importWeatherData() {
        productService.importWeatherDataFromApi();
        return "Wetterdaten importiert!";
    }
}