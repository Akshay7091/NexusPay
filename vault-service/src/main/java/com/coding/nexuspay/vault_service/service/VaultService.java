package com.coding.nexuspay.vault_service.service;


import com.coding.nexuspay.common_lib.dto.PaymentProcessorResponse;
import com.coding.nexuspay.common_lib.entity.Money;
import com.coding.nexuspay.vault_service.dto.request.TokenizeRequest;
import com.coding.nexuspay.vault_service.dto.response.TokenizeResponse;

import java.util.Map;
import java.util.UUID;

public interface VaultService {

    TokenizeResponse tokenize(TokenizeRequest request, UUID merchantId);

    PaymentProcessorResponse charge(UUID paymentId, String token, Money amount, Map<String, Object> methodDetails);
}
