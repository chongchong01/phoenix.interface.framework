/*
 * Copyright 2002-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.suren.autotest.interfaces.framework.data;

import java.util.HashMap;

import org.suren.autotest.interfaces.framework.Request;

/**
 * @author suren
 * @date 2017年7月1日 下午12:24:34
 */
public class SimpleDynamicParam implements DynamicParam
{

	@Override
	public void process(Request request, String name, String value, String type)
	{
		String url = request.getUrl();
		
		if("path".equals(type))
		{
			url = url.replaceAll("\\{" + name + "\\}", value);
			request.setUrl(url);
		}
		else if("query".equals(type))
		{
			if(!url.contains("?"))
			{
				url += "?";
			}
			
			url += (name + "=" + value + "&");
			request.setUrl(url);
		}
		else if("body".equals(type))
		{
			if(request.getBodyParam() == null)
			{
				request.setBodyParam(new HashMap<String, String>());
			}
			
			request.getBodyParam().put(name, value);
		}
	}
	
	private boolean equalWith(Class<?> clz, String name)
	{
		return clz.getSimpleName().toLowerCase().equals(name);
	}
	
	public static void main(String[] args)
	{
		System.out.println("/api/attach_configs/{id}".replaceAll("\\{id\\}", "---"));
	}

}
