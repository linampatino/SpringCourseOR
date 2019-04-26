package com.or.spring.orspring;

import com.or.spring.orspring.model.Product;
import com.or.spring.orspring.repositories.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class OrspringApplication  implements CommandLineRunner {

    private ProductRepository productRepository;
    private Logger LOG = LoggerFactory.getLogger(OrspringApplication.class);

    @Autowired
    public void productRepository(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(OrspringApplication.class, args);

    }

    @Override
    public void run(String... strings) throws Exception{
        Product product1 = new Product();
        product1.setName("product 1");
        product1.setDescription("this a test product");
        product1.setCategory("test");
        product1.setType("general");
        product1.setPrice(1.2);
        productRepository.save(product1);

        Product product2 = new Product();
        product2.setName("product 222222222222");
        product2.setDescription("this a test product 222222222");
        product2.setCategory("test2222222");
        product2.setType("general 2222");
        product2.setPrice(99.2);
        productRepository.save(product2);

        List<Product> products = productRepository.findAll();
        products.forEach(item -> System.out.println(item.toString()));

        products.forEach(product-> LOG.info("products found ", product.toString()));

    }


}
