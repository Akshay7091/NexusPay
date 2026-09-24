package com.coding.nexuspay.payment_service.gateway;


import com.coding.nexuspay.payment_service.gateway.dto.PaymentRequest;
import com.coding.nexuspay.payment_service.gateway.dto.PaymentResult;

import java.util.UUID;

public interface PaymentAdapter {

    PaymentResult initiate(PaymentRequest request);

    PaymentResult capture(UUID paymentId);
}
