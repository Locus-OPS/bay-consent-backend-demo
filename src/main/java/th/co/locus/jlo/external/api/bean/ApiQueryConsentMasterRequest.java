package th.co.locus.jlo.external.api.bean;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import lombok.Data;
import lombok.ToString;
@Data
@ToString
public class ApiQueryConsentMasterRequest {
	private List<String> consentTypeCodeList;
	private Long consentId;
	private String consentVersion;
	private String langCode;
	private List<@NotEmpty(message = "Entity cannot be empty or null value") String> entityCodeList;
	private String proceedBy;
	private String companyCode;
	private String insurerCode;
	@NotEmpty(message = "Consent status parameter is required field")
	private String consentStatus;
	private String effectiveDate;
}
