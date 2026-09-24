package com.coding.nexuspay.vault_service.dto.response;


import com.coding.nexuspay.common_lib.enums.CardBrand;

public record TokenizeResponse(
        String token,
        String lastFour,
        CardBrand brand,
        Integer expiryMonth,
        Integer expiryYear
) {
}
