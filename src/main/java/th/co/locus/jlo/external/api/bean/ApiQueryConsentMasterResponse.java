package th.co.locus.jlo.external.api.bean;

import java.util.List;

import lombok.Data;
import th.co.locus.jlo.business.consent.master.bean.ConsentMasterModelBean;

@Data
public class ApiQueryConsentMasterResponse {
	private List<ConsentMasterModelBean> consentMasterList;

}
