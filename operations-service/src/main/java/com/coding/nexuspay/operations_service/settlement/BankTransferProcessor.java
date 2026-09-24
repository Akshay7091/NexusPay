package com.coding.nexuspay.operations_service.settlement;

import com.coding.nexuspay.common_lib.entity.Money;
import com.coding.nexuspay.operations_service.settlement.dto.BankTransferResult;

import java.util.UUID;

public interface BankTransferProcessor {

    BankTransferResult initiate(UUID settlementId, UUID merchantId, Money amount,
                                String bankAccount, String ifsc);
}
