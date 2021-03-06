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

package org.suren.autotest.web.framework.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

/**
 * 用在Form表单上的定位描述，只能用在类上.
 * @see com.surenpi.autotest.webui.Form
 * @author <a href="http://surenpi.com">suren</a>
 * @since 2.1.0
 */
@Documented
@Retention(RUNTIME)
@Target(TYPE)
@Component
public @interface AutoForm
{
    /**
     * @return 普通定位集合
     */
    AutoLocator[] locators() default {};
    
    /**
     * @return 根据标签文本定位的集合
     */
    AutoTextLocator[] textLocators() default {};
    
    /**
     * @return 根据标签属性定位的集合
     */
    AutoAttrLocator[] attrLocators() default {};
}
