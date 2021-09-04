package domain.repository;

import domain.model.PaymentOrder;

import java.util.List;

public interface PaymentOrderRepository {

  List<PaymentOrder> getPaymentOrders();
}
