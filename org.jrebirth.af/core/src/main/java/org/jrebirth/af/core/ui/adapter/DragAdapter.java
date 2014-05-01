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

import javafx.scene.input.DragEvent;

import org.jrebirth.af.core.exception.CoreRuntimeException;

/**
 * The class <strong>DragAdapter</strong>.
 * 
 * @author Sébastien Bordes
 */
public interface DragAdapter extends EventAdapter {

    /**
     * Manage drag ANY events. Common supertype for all drag event types.
     * 
     * @param dragEvent the event to manage
     */
    default void drag(final DragEvent dragEvent) {
        throw new CoreRuntimeException(NOT_IMPLEMENTED_YET, this.getClass(), "void drag(final DragEvent dragEvent)");
    }

    /**
     * Manage drag done events. This event occurs on drag-and-drop gesture source after its data has been dropped on a drop target.
     * 
     * @param dragEvent the event to manage
     */
    default void dragDone(final DragEvent dragEvent) {
        throw new CoreRuntimeException(NOT_IMPLEMENTED_YET, this.getClass(), "void dragDone(final DragEvent dragEvent)");
    }

    /**
     * Manage drag dropped events. This event occurs when the mouse button is released during drag and drop gesture on a drop target.
     * 
     * @param dragEvent the event to manage
     */
    default void dragDropped(final DragEvent dragEvent) {
        throw new CoreRuntimeException(NOT_IMPLEMENTED_YET, this.getClass(), "void dragDropped(final DragEvent dragEvent)");
    }

    /**
     * Manage drag entered events. This event occurs when drag gesture enters a node.
     * 
     * @param dragEvent the event to manage
     */
    default void dragEntered(final DragEvent dragEvent) {
        throw new CoreRuntimeException(NOT_IMPLEMENTED_YET, this.getClass(), "void dragEntered(final DragEvent dragEvent)");
    }

    /**
     * Manage drag entered target events. This event occurs when drag gesture enters a node.
     * 
     * @param dragEvent the event to manage
     */
    default void dragEnteredTarget(final DragEvent dragEvent) {
        throw new CoreRuntimeException(NOT_IMPLEMENTED_YET, this.getClass(), "void dragEnteredTarget(final DragEvent dragEvent)");
    }

    /**
     * Manage drag exited events. This event occurs when drag gesture exits a node.
     * 
     * @param dragEvent the event to manage
     */
    default void dragExited(final DragEvent dragEvent) {
        throw new CoreRuntimeException(NOT_IMPLEMENTED_YET, this.getClass(), "void dragExited(final DragEvent dragEvent)");
    }

    /**
     * Manage drag exited target events. This event occurs when drag gesture exits a node.
     * 
     * @param dragEvent the event to manage
     */
    default void dragExitedTarget(final DragEvent dragEvent) {
        throw new CoreRuntimeException(NOT_IMPLEMENTED_YET, this.getClass(), "void dragExitedTarget(final DragEvent dragEvent)");
    }

    /**
     * Manage drag over events. his event occurs when drag gesture progresses within this node.
     * 
     * @param dragEvent the event to manage
     */
    default void dragOver(final DragEvent dragEvent) {
        throw new CoreRuntimeException(NOT_IMPLEMENTED_YET, this.getClass(), "void dragOver(final DragEvent dragEvent)");
    }

}
