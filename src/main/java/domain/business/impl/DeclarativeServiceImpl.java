package domain.business.impl;

import domain.business.Service;
import domain.repository.PaymentOrderRepository;
import domain.repository.impl.PaymentOrderRepositoryImpl;
import domain.util.strategy.RiskStrategy;

public class DeclarativeServiceImpl implements Service {

  private PaymentOrderRepository repository;

  public DeclarativeServiceImpl() {
    repository = new PaymentOrderRepositoryImpl();
  }

  @Override
  public void validate() {
    System.out.println("Declarative service");
    repository.getPaymentOrders()
            .forEach(paymentOrder -> RiskStrategy.valueOf(paymentOrder.getRiskCode()).processPaymentOrder());
  }

}
