/*
 * Copyright 2013 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.bpm.console.server.integration.mock;

import org.jboss.bpm.console.server.integration.ManagementFactory;
import org.jboss.bpm.console.server.integration.ProcessManagement;
import org.jboss.bpm.console.server.integration.TaskManagement;
import org.jboss.bpm.console.server.integration.UserManagement;

/**
 * ManagementFactory impl.
 *
 * @author eric.wittmann@redhat.com
 */
public class ManagementFactoryImpl extends ManagementFactory {

    /**
     * @see org.jboss.bpm.console.server.integration.ManagementFactory#createProcessManagement()
     */
    @Override
    public ProcessManagement createProcessManagement() {
        return new ProcessManagementImpl();
    }

    /**
     * @see org.jboss.bpm.console.server.integration.ManagementFactory#createTaskManagement()
     */
    @Override
    public TaskManagement createTaskManagement() {
        return new TaskManagementImpl();
    }

    /**
     * @see org.jboss.bpm.console.server.integration.ManagementFactory#createUserManagement()
     */
    @Override
    public UserManagement createUserManagement() {
        return new UserManagementImpl();
    }

}
