package com.coding.nexuspay.payment_service.api;


import com.coding.nexuspay.common_lib.dto.PaymentSettlementView;

import java.util.List;
import java.util.UUID;

public interface PaymentLookupService {

    List<PaymentSettlementView> findUnsettledCapturedPayments(UUID merchantId);

    void markSettled(List<UUID> paymentList);

}
