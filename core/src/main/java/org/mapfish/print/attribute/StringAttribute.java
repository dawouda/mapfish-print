/*
 * Copyright (C) 2014  Camptocamp
 *
 * This file is part of MapFish Print
 *
 * MapFish Print is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MapFish Print is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MapFish Print.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.mapfish.print.attribute;

import org.mapfish.print.config.Template;
import org.mapfish.print.json.PJsonObject;

/**
 * Attribute that reads a string from the request data.
 */
public class StringAttribute extends AbstractAttribute<String> {

    @Override
    public final String getValue(final Template template, final PJsonObject values, final String name) {
        return values.getString(name);
    }

    @Override
    protected final String getType() {
        return "string";
    }
}