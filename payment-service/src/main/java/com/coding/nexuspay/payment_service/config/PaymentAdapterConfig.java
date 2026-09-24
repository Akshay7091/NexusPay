package com.coding.nexuspay.payment_service.config;

import com.coding.nexuspay.common_lib.enums.PaymentMethod;
import com.coding.nexuspay.payment_service.gateway.PaymentAdapter;
import com.coding.nexuspay.payment_service.gateway.adapter.CardPaymentAdapter;
import com.coding.nexuspay.payment_service.gateway.adapter.NetBankingAdapter;
import com.coding.nexuspay.payment_service.gateway.adapter.UpiPaymentAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@RequiredArgsConstructor
@Configuration
public class PaymentAdapterConfig {

    private final NetBankingAdapter netBankingAdapter;
    private final CardPaymentAdapter cardPaymentAdapter;
    private final UpiPaymentAdapter upiPaymentAdapter;

    @Bean
    public Map<PaymentMethod, PaymentAdapter> paymentAdapterMap() {
        return Map.of(
                PaymentMethod.CARD, cardPaymentAdapter,
                PaymentMethod.NETBANKING, netBankingAdapter,
                PaymentMethod.UPI, upiPaymentAdapter
        );
    }
}
