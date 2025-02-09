package org.salesAPI.service;

import org.salesAPI.model.Product;
import org.salesAPI.model.WeatherData;
import org.salesAPI.repository.ProductRepository;
import org.salesAPI.repository.WeatherDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private WeatherDataRepository weatherDataRepository;

    public void importCsvData(String filePath) {
        // CSV-Parsing-Logik hier implementieren (z.B. CsvParser verwenden)
        // Zum Beispiel, nach dem Parsen:
        Product product = new Product("Cola", 100, "CSV", LocalDateTime.now());
        productRepository.save(product);
    }

    public void importWeatherDataFromApi() {
        // API-Logik hier implementieren (z.B. ApiWeatherClient verwenden)
        WeatherData weatherData = new WeatherData("Berlin", 15.5, 80.0, LocalDateTime.now());
        weatherDataRepository.save(weatherData);
    }
}
