package com.coding.nexuspay.operations_service.repository;

import com.coding.nexuspay.common_lib.enums.SettlementStatus;
import com.coding.nexuspay.operations_service.entity.Settlement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SettlementRepository extends JpaRepository<Settlement, UUID> {
    List<Settlement> findByStatus(SettlementStatus settlementStatus);
}
