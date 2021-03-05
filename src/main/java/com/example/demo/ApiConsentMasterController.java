package com.example.demo;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import th.co.locus.jlo.business.consent.master.bean.ConsentMasterModelBean;
import th.co.locus.jlo.external.api.bean.ApiQueryConsentMasterRequest;
import th.co.locus.jlo.external.api.bean.ApiQueryConsentMasterResponse;
import th.co.locus.jlo.external.api.bean.ApiServiceResponse;

@RestController
@RequestMapping("/consent-service")
public class ApiConsentMasterController {
	
	@PostMapping(value = "/v1/consent-master/query", produces = "application/json")
	public ApiServiceResponse<ApiQueryConsentMasterResponse> queryConsentMaster(
			@Valid @RequestBody ApiQueryConsentMasterRequest request) throws ParseException {
		
		ConsentMasterModelBean consentMaster = new ConsentMasterModelBean();
		consentMaster.setConsentId(1L);
		
		List<ConsentMasterModelBean> consentMasterList = new ArrayList<>();
		consentMasterList.add(consentMaster);
		
		ApiQueryConsentMasterResponse response = new ApiQueryConsentMasterResponse();
		response.setConsentMasterList(consentMasterList);
		return ApiServiceResponse.success(response);
	}
}
