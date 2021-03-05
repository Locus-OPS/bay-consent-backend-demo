package th.co.locus.jlo.business.consent.master.bean;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import th.co.locus.jlo.business.consent.BaseConsentModelBean;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString
public class ConsentContentModelBean extends BaseConsentModelBean {

	private Long consentId;
	@NotBlank(message = "Consent Content: Language code parameter is required field")
	@Size(max = 50, message = "Consent Content: Length of Language code parameter is over, it cannot be more than 50 characters")
	private String langCode;
	@NotBlank(message = "Consent Content: Content text parameter is required field")
	private String contentText;
	private String contentHtml;
	private Integer revision;
	private String consentRemark;
}
