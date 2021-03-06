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
package org.jrebirth.af.core.exception.handler;

import org.jrebirth.af.core.log.JRLevel;
import org.jrebirth.af.core.log.JRebirthMarkers;
import org.jrebirth.af.core.resource.i18n.LogMessage;
import org.jrebirth.af.core.resource.i18n.MessageContainer;
import org.jrebirth.af.core.resource.i18n.MessageItem;

import static org.jrebirth.af.core.resource.Resources.create;

/**
 * The class <strong>HandlerMessages</strong>.
 * 
 * Messages used by the Exception.Handler package.
 * 
 * @author Sébastien Bordes
 */
public interface HandlerMessages extends MessageContainer {

    /** AbstractJrbUncaughtExceptionHandler. */

    /** "Uncaught Exception: {0}". */
    MessageItem UNCAUGHT_EXCEPTION = create(new LogMessage("jrebirth.exception.handler.uncaughtException", JRLevel.Error, JRebirthMarkers.UNCAUGHT));

    /** "Uncaught Exception: {0} - {1}". */
    MessageItem UNKNOWN_UNCAUGHT_EXCEPTION = create(new LogMessage("jrebirth.exception.handler.unknownUncaughtException", JRLevel.Error, JRebirthMarkers.UNCAUGHT));

}
