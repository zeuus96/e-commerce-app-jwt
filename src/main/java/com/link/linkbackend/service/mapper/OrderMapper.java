package com.link.linkbackend.service.mapper;

import com.link.linkbackend.domain.PurchaseOrder;
import com.link.linkbackend.service.dto.OrderDTO;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface OrderMapper extends EntityMapper<OrderDTO, PurchaseOrder> {
}
