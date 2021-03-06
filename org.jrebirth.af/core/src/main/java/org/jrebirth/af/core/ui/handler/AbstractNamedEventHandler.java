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
package org.jrebirth.af.core.ui.handler;

import javafx.event.Event;
import javafx.event.EventHandler;

/**
 * The class <strong>AbstractNamedEventHandler</strong>.
 * 
 * @author Sébastien Bordes
 * 
 * @param <E> the event to handle
 */
public abstract class AbstractNamedEventHandler<E extends Event> implements EventHandler<E> {

    /**
     * The name of the event handler. It should give some information about the call context
     */
    private final String name;

    /**
     * Default Constructor.
     * 
     * @param name the name of this event handler
     */
    public AbstractNamedEventHandler(final String name) {
        super();
        this.name = name;
    }

    /**
     * @return Returns the name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return getName();
    }

}
