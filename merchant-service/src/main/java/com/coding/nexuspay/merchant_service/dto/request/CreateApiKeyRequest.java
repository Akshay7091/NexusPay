package com.coding.nexuspay.merchant_service.dto.request;


import com.coding.nexuspay.common_lib.enums.Environment;

public record CreateApiKeyRequest(
        Environment environment
) {
}
