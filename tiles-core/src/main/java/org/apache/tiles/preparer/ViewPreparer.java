/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */
package org.apache.tiles.preparer;

import org.apache.tiles.context.TilesRequestContext;
import org.apache.tiles.ComponentContext;

/**
 * <p>
 * Executed prior to rendering a view.
 * </p>
 *
 * <p>
 * A view preparer is typically used to provide last minute
 * translations of the data within the Component or Tiles Context.
 * A preparer is not intended to replace the controller within an
 * MVC architecture.
 * </p>
 *
 * See
 * <ul>
 * <li>&lt;insert&gt;</li>
 * <li>&lt;definition&gt;</li>
 * <li>
 */
public interface ViewPreparer {

    /**
     * Method associated to a tile and called immediately before the tile
     * is included.
     *
     * @param tilesContext     Current tiles application context.
     * @param componentContext Current tile context.
     */
    public void execute(TilesRequestContext tilesContext,
        ComponentContext componentContext)
        throws Exception;
}
