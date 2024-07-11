package com.nttdata.bank.loans.service;

import reactor.core.publisher.Mono;

public interface CustomerValidationService {
    Mono<Boolean> validateCustomerExists(String customerId);
}
