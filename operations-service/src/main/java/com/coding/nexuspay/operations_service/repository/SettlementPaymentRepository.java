package com.coding.nexuspay.operations_service.repository;

import com.coding.nexuspay.operations_service.entity.Settlement;
import com.coding.nexuspay.operations_service.entity.SettlementPayment;
import com.coding.nexuspay.operations_service.entity.SettlementPaymentId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SettlementPaymentRepository extends JpaRepository<SettlementPayment, SettlementPaymentId> {
    List<SettlementPayment> findBySettlement(Settlement settlement);
}
