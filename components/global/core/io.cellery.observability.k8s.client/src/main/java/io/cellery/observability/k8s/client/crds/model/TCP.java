/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.cellery.observability.k8s.client.crds.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.KubernetesResource;

/**
 * This is used to represent TCP Ingress Type.
 */
@JsonDeserialize
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TCP implements KubernetesResource {

    private static final long serialVersionUID = 1L;

    @JsonProperty("port")
    private Integer port;
    @JsonProperty("backendHost")
    private String backendHost;
    @JsonProperty("backendPort")
    private Integer backendPort;

    @JsonProperty("port")
    public Integer getPort() {
        return port;
    }

    @JsonProperty("port")
    public void setPort(Integer port) {
        this.port = port;
    }

    @JsonProperty("backendHost")
    public String getBackendHost() {
        return backendHost;
    }

    @JsonProperty("backendHost")
    public void setBackendHost(String backendHost) {
        this.backendHost = backendHost;
    }

    @JsonProperty("backendPort")
    public Integer getBackendPort() {
        return backendPort;
    }

    @JsonProperty("backendPort")
    public void setBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
    }

}
