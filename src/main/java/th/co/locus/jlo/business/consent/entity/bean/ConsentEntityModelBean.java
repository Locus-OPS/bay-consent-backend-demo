package th.co.locus.jlo.business.consent.entity.bean;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;
import th.co.locus.jlo.common.BaseModelBean;

@Data
@EqualsAndHashCode(callSuper = true)
public class ConsentEntityModelBean extends BaseModelBean {

	private Long consentId;
	@NotBlank(message = "Consent Entity: Entity code parameter is required field")
	@Size(max = 50, message = "Consent Entity: Length of Entity code parameter is over, it cannot be more than 50 characters")
	private String entityCode;

}
