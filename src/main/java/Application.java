import domain.business.Service;
import domain.business.impl.DeclarativeServiceImpl;
import domain.business.impl.ImperativeServiceImpl;

public class Application {

  public static void main(String[] args) {

    Service service = new DeclarativeServiceImpl();
//    Service service = new ImperativeServiceImpl();
    service.validate();
  }
}
