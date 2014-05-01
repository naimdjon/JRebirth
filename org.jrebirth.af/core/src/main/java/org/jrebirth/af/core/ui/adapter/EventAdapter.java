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
package org.jrebirth.af.core.ui.adapter;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.input.DragEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.RotateEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.input.SwipeEvent;
import javafx.scene.input.TouchEvent;
import javafx.scene.input.ZoomEvent;
import javafx.stage.WindowEvent;

import org.jrebirth.af.core.resource.Resources;
import org.jrebirth.af.core.resource.i18n.Message;
import org.jrebirth.af.core.resource.i18n.MessageItem;
import org.jrebirth.af.core.ui.handler.ActionHandler;
import org.jrebirth.af.core.ui.handler.DragHandler;
import org.jrebirth.af.core.ui.handler.KeyHandler;
import org.jrebirth.af.core.ui.handler.MouseHandler;
import org.jrebirth.af.core.ui.handler.RotateHandler;
import org.jrebirth.af.core.ui.handler.ScrollHandler;
import org.jrebirth.af.core.ui.handler.SwipeHandler;
import org.jrebirth.af.core.ui.handler.TouchHandler;
import org.jrebirth.af.core.ui.handler.WindowHandler;
import org.jrebirth.af.core.ui.handler.ZoomHandler;

/**
 * The class <strong>EventAdapter</strong>.
 * 
 * @author Sébastien Bordes
 */
public interface EventAdapter {

    /** . */
    MessageItem NOT_IMPLEMENTED_YET = Resources.create(new Message("jrebirth.ui.adapter.notImplementedYet"));

    // /**
    // * @param controller The controller to set.
    // */
    // void setController(final C controller);

    /**
     * 
     * The class <strong>Linker</strong> is used to link Event with adapter and handler classes.
     * 
     * @author Sébastien Bordes
     */
    enum Linker {

        /** The Action Event linker. */
        Action(ActionEvent.ACTION, ActionAdapter.class, ActionHandler.class),

        /** The Mouse Event linker. */
        Mouse(MouseEvent.ANY, MouseAdapter.class, MouseHandler.class),

        /** The Key Event linker. */
        Key(KeyEvent.ANY, KeyAdapter.class, KeyHandler.class),

        /** The Drag Event linker. */
        Drag(DragEvent.ANY, DragAdapter.class, DragHandler.class),

        /** The Rotate Event linker. */
        Rotate(RotateEvent.ANY, RotateAdapter.class, RotateHandler.class),

        /** The Scroll Event linker. */
        Scroll(ScrollEvent.ANY, ScrollAdapter.class, ScrollHandler.class),

        /** The Swipe Event linker. */
        Swipe(SwipeEvent.ANY, SwipeAdapter.class, SwipeHandler.class),

        /** The Touch Event linker. */
        Touch(TouchEvent.ANY, TouchAdapter.class, TouchHandler.class),

        /** The Window Event linker. */
        Window(WindowEvent.ANY, WindowAdapter.class, WindowHandler.class),

        /** The Zoom Event linker. */
        Zoom(ZoomEvent.ANY, ZoomAdapter.class, ZoomHandler.class);

        /** The JavaFX internal api name. */
        private final EventType<?> eventType;

        /** The mapped event adapter class. */
        private final Class<? extends EventAdapter> adapterClass;

        /** The mapped event handler class. */
        private final Class<? extends EventHandler<?>> handlerClass;

        /**
         * Default constructor used to link the apiName.
         * 
         * @param <E> the element type
         * @param eventType the javafx event type
         * @param adapterClass the adapter class
         * @param handlerClass the handler class
         */
        private <E extends Event> Linker(final EventType<E> eventType, final Class<? extends EventAdapter> adapterClass, final Class<? extends EventHandler<E>> handlerClass) {
            this.eventType = eventType;
            this.adapterClass = adapterClass;
            this.handlerClass = handlerClass;
        }

        /**
         * Return Event type.
         * 
         * @return the event type<?>
         */
        public EventType<?> eventType() {
            return this.eventType;
        }

        /**
         * Return Adapter class.
         * 
         * @return the class<? extends event adapter>
         */
        public Class<? extends EventAdapter> adapterClass() {
            return this.adapterClass;
        }

        /**
         * Return Handler class.
         * 
         * @return the class<? extends event handler<?>>
         */
        public Class<? extends EventHandler<?>> handlerClass() {
            return this.handlerClass;
        }

    }
}
