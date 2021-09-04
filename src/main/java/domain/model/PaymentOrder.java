package domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Builder
@Getter
@Setter
/**
 * <br/> Clase Modelo, representa una orden de pago.
 * <br/>
 * <b>Class</b>: PaymentOrder<br/>
 *
 * @author Miguel Armas Abt <br/>
 * @version 1.0
 */
public class PaymentOrder {

  /**
   * Identificador de la orden de pago con la que se almacena en el repositorio .
   */
  private String code;

  /**
   * Código de evaluación de riesgo. Los valores posibles son ALLOW, CHALLENGE y DENNY
   * - ALLOW: La orden de pago pasó la evaluación de riesgo exitosamente.
   * - CHALLENGE: La orden de pago ha sido Para validar la orden de pago, es necesario contestar correctamente las preguntas reto.
   * - DENNY: La orden de pago fue denegada porque se detectaron actividades fraudulentas.
   */
  private String riskCode;

}
