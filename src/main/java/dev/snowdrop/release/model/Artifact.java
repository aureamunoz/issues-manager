/**
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package dev.snowdrop.release.model;

/**
 * @author <a href="claprun@redhat.com">Christophe Laprun</a>
 */
public class Artifact {
    private String name;
    private String version;
    
    public Artifact(String groupId, String artifactId, String version) {
        this.name = groupId + ":" + artifactId;
        this.version = version;
    }
    
    public String getName() {
        return name;
    }
    
    public String getVersion() {
        return version;
    }
    
    @Override
    public String toString() {
        return name + '@' + version;
    }
}