/*
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered.org <http://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.entity.vehicle.minecart;

import org.spongepowered.api.util.command.source.CommandBlockSource;

/**
 * Represents a minecart with a command block inside it.
 */
public interface MinecartCommandBlock extends Minecart, CommandBlockSource {

    /**
     * Gets the current command within this command minecart.
     *
     * @return The current command stored
     */
    String getCommand();

    /**
     * Sets the stored command within this command minecart.
     *
     * @param command The command
     */
    void setCommand(String command);

    /**
     * Gets the current custom name of this command minecart.
     *
     * @return The current command name
     */
    String getCommandName();

    /**
     * Sets the custom command name of this command minecart.
     * <p>Setting the name to null may default to "@".</p>
     *
     * @param name The custom name
     */
    void setCommandName(String name);

    /**
     * Checks if this is a flowerpot.
     *
     * @return Whether this is a flowerpot
     */
    boolean isFlowerPot();
}
