/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
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
package org.spongepowered.api.statistic;

import org.spongepowered.api.util.generator.dummy.DummyObjectProvider;

/**
 * A utility class for getting all available {@link StatisticGroup}s.
 */
public final class StatisticGroups {

    // SORTFIELDS:ON

    /**
     * Statistic counting the number of broken/worn down items of a specific
     * type.
     */
    public static final StatisticGroup BREAK_ITEM = DummyObjectProvider.createFor(StatisticGroup.class, "BREAK_ITEM");

    /**
     * Statistic counting the number of crafted items of a specific type.
     */
    public static final StatisticGroup CRAFT_BLOCK = DummyObjectProvider.createFor(StatisticGroup.class, "CRAFT_BLOCK");

    /**
     * Statistic counting the number of crafted items of a specific type.
     */
    public static final StatisticGroup CRAFT_ITEM = DummyObjectProvider.createFor(StatisticGroup.class, "CRAFT_ITEM");

    /**
     * Statistics belonging to the group of 'general' statistics.
     */
    public static final StatisticGroup GENERAL = DummyObjectProvider.createFor(StatisticGroup.class, "GENERAL");

    /**
     * Statistic counting the number of killed entities of a specific type.
     */
    public static final StatisticGroup HAS_KILLED_ENTITY = DummyObjectProvider.createFor(StatisticGroup.class, "HAS_KILLED_ENTITY");

    /**
     * Statistic counting the number of killed members of a specific team.
     */
    public static final StatisticGroup HAS_KILLED_TEAM = DummyObjectProvider.createFor(StatisticGroup.class, "HAS_KILLED_TEAM");

    /**
     * Statistics which are purely used internally and are not intended to be
     * displayed, such as statistics used to back certain achievements.
     */
    public static final StatisticGroup HIDDEN = DummyObjectProvider.createFor(StatisticGroup.class, "HIDDEN");

    /**
     * Statistic counting the number of deaths caused by entities of a specific
     * type.
     */
    public static final StatisticGroup KILLED_BY_ENTITY = DummyObjectProvider.createFor(StatisticGroup.class, "KILLED_BY_ENTITY");

    /**
     * Statistic counting the number of deaths caused by members of a specific
     * team.
     */
    public static final StatisticGroup KILLED_BY_TEAM = DummyObjectProvider.createFor(StatisticGroup.class, "KILLED_BY_TEAM");

    /**
     * Statistic counting the number of mined/harvested blocks of a specific
     * type.
     */
    public static final StatisticGroup MINE_BLOCK = DummyObjectProvider.createFor(StatisticGroup.class, "MINE_BLOCK");

    /**
     * Statistic counting the number of used blocks of a specific type.
     */
    public static final StatisticGroup USE_BLOCK = DummyObjectProvider.createFor(StatisticGroup.class, "USE_BLOCK");

    /**
     * Statistic counting the number of used/placed items of a specific type.
     */
    public static final StatisticGroup USE_ITEM = DummyObjectProvider.createFor(StatisticGroup.class, "USE_ITEM");

    // SORTFIELDS:OFF

    private StatisticGroups() {
    }

}
