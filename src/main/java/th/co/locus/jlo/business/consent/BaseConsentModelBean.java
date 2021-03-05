package th.co.locus.jlo.business.consent;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;
import th.co.locus.jlo.common.BaseModelBean;

@Data
@EqualsAndHashCode(callSuper = false)
public class BaseConsentModelBean extends BaseModelBean {
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
	private Date operatedDate;
	private String operatedBy;

}
