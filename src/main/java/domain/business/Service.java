package domain.business;

public interface Service {

  /**
   * La orden de pago será procesada únicamente si ha
   *  * pasado por una validación de riesgo.
   */
  void validate();

}
