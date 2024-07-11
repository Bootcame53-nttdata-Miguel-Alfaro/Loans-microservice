package com.nttdata.bank.loans.service.impl;

import com.nttdata.bank.loans.service.ProductValidationService;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ProductValidationServiceImpl implements ProductValidationService {
    private final WebClient.Builder webClientBuilder;

    public ProductValidationServiceImpl(WebClient.Builder webClientBuilder) {
        this.webClientBuilder = webClientBuilder;
    }

    @Override
    public Mono<Boolean> validateProductExists(String customerId) {
        return webClientBuilder.build()
                .get()
                .uri("/products/" + customerId)
                .exchangeToMono(response -> {
                    if (response.statusCode().is2xxSuccessful()) {
                        return Mono.just(true);
                    } else {
                        return Mono.error(new RuntimeException("Product not found"));
                    }
                });
    }
}
