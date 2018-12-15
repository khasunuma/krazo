/*
 * Copyright © 2017, 2018 Ivar Grimstad
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
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.eclipse.krazo.event;

import javax.enterprise.context.Dependent;
import javax.mvc.engine.ViewEngine;
import javax.mvc.event.BeforeProcessViewEvent;

/**
 * An implementation of {@link javax.mvc.event.BeforeProcessViewEvent}.
 *
 * @author Santiago Pericas-Geertsen
 */
@Dependent
public class BeforeProcessViewEventImpl implements BeforeProcessViewEvent {

    private String view;

    private Class<? extends ViewEngine> engine;

    @Override
    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    @Override
    public Class<? extends ViewEngine> getEngine() {
        return engine;
    }

    public void setEngine(Class<? extends ViewEngine> engine) {
        this.engine = engine;
    }
}
