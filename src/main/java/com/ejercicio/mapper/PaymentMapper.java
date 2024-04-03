package com.ejercicio.mapper;

import com.ejercicio.dto.PaymentDto;
import com.ejercicio.entities.Payment;
import org.mapstruct.Mapper;

@Mapper
public interface PaymentMapper {
    PaymentDto paymentToPaymentDto(Payment payment);
    Payment paymentDtoToPayment(PaymentDto paymentDto);
}
