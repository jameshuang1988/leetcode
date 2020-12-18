package org.must.must.controller.base;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @Description 所有Controller類都繼承此方法， 可在此捕捉例外並返回訊息 
 * @author James 2020年9月4日
 *
 */
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class DefaultController {

}
