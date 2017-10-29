package com.zving.declarationform.cottonquota.provider;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zving.declarationform.cottonquota.schema.TestService;
import com.zving.declarationform.dto.ResponseDTO;

import io.servicecomb.provider.rest.common.RestSchema;

/**
 * @author lwb
 * @mail lwb@zving.com
 * @date 2017年10月23日 下午2:33:09
 * @description:企业管理
 */
@RestSchema(schemaId = "test")
@RequestMapping(path = "/test", produces = MediaType.APPLICATION_JSON)
@Controller
public class TestServiceImpl implements TestService {

	static long id = Math.abs(new Random().nextInt(100000000));

	@Override
	@RequestMapping(path = "qps", method = RequestMethod.GET)
	@ResponseBody
	public ResponseDTO loadblanceTest() {
		try {
			return new ResponseDTO(
					String.format("QPS: HostName=%s Time=%s", InetAddress.getLocalHost().getHostName(), System.currentTimeMillis()));
		} catch (UnknownHostException e) {
			return new ResponseDTO(String.format("QPS: ID=%s Time=%s", id, System.currentTimeMillis()));
		}
	}
}