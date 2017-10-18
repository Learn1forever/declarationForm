package com.zving.declarationform.riskanalysis.provider;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zving.declarationform.model.DeclarationForm;
import com.zving.declarationform.riskanalysis.schema.RiskAnalysis;

import io.servicecomb.provider.rest.common.RestSchema;

@RestSchema(schemaId = "riskAnalysis")
@RequestMapping(path = "/riskAnalysis", produces = MediaType.APPLICATION_JSON)
public class RiskAnalysisImpl implements RiskAnalysis {

	@Override
	@RequestMapping(path = "", method = RequestMethod.POST)
	public String check(@RequestBody DeclarationForm form) {
		return "风险分析未发现问题";
	}

}