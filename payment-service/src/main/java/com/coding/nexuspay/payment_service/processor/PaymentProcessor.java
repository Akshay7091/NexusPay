package com.coding.nexuspay.payment_service.processor;


import com.coding.nexuspay.common_lib.dto.PaymentProcessorRequest;
import com.coding.nexuspay.common_lib.dto.PaymentProcessorResponse;

public interface PaymentProcessor {

    PaymentProcessorResponse charge(PaymentProcessorRequest request);

}
