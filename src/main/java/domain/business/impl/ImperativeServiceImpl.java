package domain.business.impl;

import domain.business.Service;
import domain.repository.PaymentOrderRepository;
import domain.repository.impl.PaymentOrderRepositoryImpl;

public class ImperativeServiceImpl implements Service {

  private PaymentOrderRepository repository;

  public ImperativeServiceImpl() {
    repository = new PaymentOrderRepositoryImpl();
  }

  @Override
  public void validate() {
    System.out.println("Imperative service");
    repository.getPaymentOrders()
            .forEach(paymentOrder -> {
              switch (paymentOrder.getRiskCode()) {
                case "ALLOW":
                  System.out.println("validar");
                  break;
                case "CHALLENGE":
                  System.out.println("retar");
                  break;
                case "DENNY":
                  System.out.println("denegar");
                  break;
              }
            });
  }
}
