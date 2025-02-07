package org.salesAPI.sales;

import org.salesAPI.sales.Sale;
import org.salesAPI.sales.SaleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    private final SaleRepository saleRepository;

    public SaleService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }

    public Sale addSale(Sale sale) {
        return saleRepository.save(sale);
    }
}