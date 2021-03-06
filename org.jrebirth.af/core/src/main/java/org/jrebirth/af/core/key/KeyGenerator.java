/**
 * Get more info at : www.jrebirth.org .
 * Copyright JRebirth.org © 2011-2013
 * Contact : sebastien.bordes@jrebirth.org
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jrebirth.af.core.key;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is used to define the method to call in order to generate a unique string key.
 * 
 * When used on a Type, it define the method to call for the whole object (basically {@link #toString()})
 * 
 * When used on Methods, all returned values of all methods will be aggregated (if returned values are not a string the method defined by the annoation value will be used).
 * 
 * The Type annotation will be used first.
 * 
 * @author Sébastien Bordes
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface KeyGenerator {

    /**
     * Define the method to call to get a string.
     * 
     * This value can be interpreted for Whole Type or for each method return object
     * 
     * The default value is {@link #toString()}
     */
    String value() default "toString";

}
