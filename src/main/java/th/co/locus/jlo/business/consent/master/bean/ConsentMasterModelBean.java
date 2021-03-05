package th.co.locus.jlo.business.consent.master.bean;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;
import th.co.locus.jlo.business.consent.BaseConsentModelBean;
import th.co.locus.jlo.business.consent.entity.bean.ConsentEntityModelBean;

@Data
@EqualsAndHashCode(callSuper = true)
public class ConsentMasterModelBean extends BaseConsentModelBean {

	public ConsentMasterModelBean() {
	}

	public ConsentMasterModelBean(Long consentId, Integer majorRevision, String consentTypeCode) {
		this.consentId = consentId;
		this.majorRevision = majorRevision;
		this.consentTypeCode = consentTypeCode;
	}

	private Long consentId;
	private String consentTypeCode;
	private String defaultLang;
	private String description;
	private String consentVersion;
	private Integer majorRevision;
	private Integer revision;
	private String consentStatus;
	private String required;
	private String consentOptType;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date effectiveDate;
	@JsonIgnoreProperties
	private String entityList;
	@JsonIgnoreProperties
	private Integer consentMasterGroupId;

	private List<ConsentEntityModelBean> consentEntityList;
	private List<ConsentContentModelBean> consentContentList;
}
