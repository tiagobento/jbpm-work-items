/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
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
package org.jbpm.process.longrest;

import org.jbpm.process.longrest.demoservices.Service;
import org.jbpm.process.longrest.mockserver.WorkItems;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/")
public class JaxRsActivator extends Application {

    private final Set<Class<?>> classes;

    public JaxRsActivator() {
        classes = new HashSet<>();
        classes.add(Service.class);
        classes.add(WorkItems.class);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
}
