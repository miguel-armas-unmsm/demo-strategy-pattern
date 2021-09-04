package domain.util.strategy;

public enum RiskStrategy {

  ALLOW {
    @Override
    public void processPaymentOrder() {
      System.out.println("validar");
    }
  },
  CHALLENGE {
    @Override
    public void processPaymentOrder() {
      System.out.println("retar");
    }
  },
  DENNY {
    @Override
    public void processPaymentOrder() {
      System.out.println("denegar");
    }
  };

  public abstract void processPaymentOrder();
}
