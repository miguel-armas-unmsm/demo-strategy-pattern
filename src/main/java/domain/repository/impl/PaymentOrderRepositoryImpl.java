package domain.repository.impl;

import static domain.util.constant.Constants.*;

import domain.model.PaymentOrder;
import domain.repository.PaymentOrderRepository;
import java.util.ArrayList;
import java.util.List;

public class PaymentOrderRepositoryImpl implements PaymentOrderRepository {

  @Override
  public List<PaymentOrder> getPaymentOrders() {
    System.out.println("repository");
    List<PaymentOrder> paymentOrders = new ArrayList<>();
    paymentOrders.add(PaymentOrder.builder().code("01-allow").riskCode(RISK_ALLOW).build());
    paymentOrders.add(PaymentOrder.builder().code("02-allow").riskCode(RISK_ALLOW).build());
    paymentOrders.add(PaymentOrder.builder().code("03-allow").riskCode(RISK_ALLOW).build());
    paymentOrders.add(PaymentOrder.builder().code("04-challenge").riskCode(RISK_CHALLENGE).build());
    paymentOrders.add(PaymentOrder.builder().code("05-challenge").riskCode(RISK_CHALLENGE).build());
    paymentOrders.add(PaymentOrder.builder().code("06-denny").riskCode(RISK_DENNY).build());
    return paymentOrders;
  }
}
