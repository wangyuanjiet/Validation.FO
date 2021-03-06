package cc.fozone.validation.validators;

import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

import cc.fozone.validation.IValidator;
import cc.fozone.validation.config.pojo.Rule;

/**
 * 正则匹配
 * @author jimmysong
 *
 */
public class MatchValidator implements IValidator {

	@SuppressWarnings("rawtypes")
	public boolean execute(Object context,Class type,Object value,Rule rule) {
		// TODO Auto-generated method stub
		if(value == null) return false;
		String regex = rule.getParameter("regex");
		if(StringUtils.isBlank(regex)) return true;
		return Pattern.matches(regex, (String)value);
	}
}
