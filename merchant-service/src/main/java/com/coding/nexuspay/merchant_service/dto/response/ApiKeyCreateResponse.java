package com.coding.nexuspay.merchant_service.dto.response;


import com.coding.nexuspay.common_lib.enums.Environment;

import java.util.UUID;

public record ApiKeyCreateResponse(
        UUID id,
        String keyId,
        String keySecret,
        Environment environment
) {
}
