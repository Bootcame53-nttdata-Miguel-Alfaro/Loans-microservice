package com.nttdata.bank.loans.service;

import reactor.core.publisher.Mono;

public interface ProductValidationService {
    Mono<Boolean> validateProductExists(String productId);
}
