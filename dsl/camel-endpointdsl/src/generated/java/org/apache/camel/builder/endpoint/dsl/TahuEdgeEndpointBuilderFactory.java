/* Generated by camel build tools - do NOT edit this file! */
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Sparkplug B Edge Node and Device support over MQTT using Eclipse Tahu
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface TahuEdgeEndpointBuilderFactory {

    /**
     * Builder for endpoint for the Tahu Edge Node / Device component.
     */
    public interface TahuEdgeEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedTahuEdgeEndpointBuilder advanced() {
            return (AdvancedTahuEdgeEndpointBuilder) this;
        }

        /**
         * MQTT client ID length check enabled.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         * 
         * @param checkClientIdLength the value to set
         * @return the dsl builder
         */
        default TahuEdgeEndpointBuilder checkClientIdLength(boolean checkClientIdLength) {
            doSetProperty("checkClientIdLength", checkClientIdLength);
            return this;
        }
        /**
         * MQTT client ID length check enabled.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         * 
         * @param checkClientIdLength the value to set
         * @return the dsl builder
         */
        default TahuEdgeEndpointBuilder checkClientIdLength(String checkClientIdLength) {
            doSetProperty("checkClientIdLength", checkClientIdLength);
            return this;
        }
        /**
         * MQTT client ID to use for all server definitions, rather than
         * specifying the same one for each. Note that if neither the 'clientId'
         * parameter nor an 'MqttClientId' are defined for an MQTT Server, a
         * random MQTT Client ID will be generated automatically, prefaced with
         * 'Camel'.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: common
         * 
         * @param clientId the value to set
         * @return the dsl builder
         */
        default TahuEdgeEndpointBuilder clientId(String clientId) {
            doSetProperty("clientId", clientId);
            return this;
        }
        /**
         * MQTT connection keep alive timeout, in seconds.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 30
         * Group: common
         * 
         * @param keepAliveTimeout the value to set
         * @return the dsl builder
         */
        default TahuEdgeEndpointBuilder keepAliveTimeout(int keepAliveTimeout) {
            doSetProperty("keepAliveTimeout", keepAliveTimeout);
            return this;
        }
        /**
         * MQTT connection keep alive timeout, in seconds.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 30
         * Group: common
         * 
         * @param keepAliveTimeout the value to set
         * @return the dsl builder
         */
        default TahuEdgeEndpointBuilder keepAliveTimeout(String keepAliveTimeout) {
            doSetProperty("keepAliveTimeout", keepAliveTimeout);
            return this;
        }
        /**
         * Delay before recurring node rebirth messages will be sent.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 5000
         * Group: common
         * 
         * @param rebirthDebounceDelay the value to set
         * @return the dsl builder
         */
        default TahuEdgeEndpointBuilder rebirthDebounceDelay(long rebirthDebounceDelay) {
            doSetProperty("rebirthDebounceDelay", rebirthDebounceDelay);
            return this;
        }
        /**
         * Delay before recurring node rebirth messages will be sent.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 5000
         * Group: common
         * 
         * @param rebirthDebounceDelay the value to set
         * @return the dsl builder
         */
        default TahuEdgeEndpointBuilder rebirthDebounceDelay(String rebirthDebounceDelay) {
            doSetProperty("rebirthDebounceDelay", rebirthDebounceDelay);
            return this;
        }
        /**
         * MQTT server definitions, given with the following syntax in a
         * comma-separated list:
         * MqttServerName:(MqttClientId:)(tcp/ssl)://hostname(:port),...
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: common
         * 
         * @param servers the value to set
         * @return the dsl builder
         */
        default TahuEdgeEndpointBuilder servers(String servers) {
            doSetProperty("servers", servers);
            return this;
        }
        /**
         * Tahu SparkplugBPayloadMap to configure metric data types for this
         * edge node or device. Note that this payload is used exclusively as a
         * Sparkplug B spec-compliant configuration for all possible edge node
         * or device metric names, aliases, and data types. This configuration
         * is required to publish proper Sparkplug B NBIRTH and DBIRTH payloads.
         * 
         * The option is a:
         * <code>org.eclipse.tahu.message.model.SparkplugBPayloadMap</code>
         * type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param metricDataTypePayloadMap the value to set
         * @return the dsl builder
         */
        default TahuEdgeEndpointBuilder metricDataTypePayloadMap(org.eclipse.tahu.message.model.SparkplugBPayloadMap metricDataTypePayloadMap) {
            doSetProperty("metricDataTypePayloadMap", metricDataTypePayloadMap);
            return this;
        }
        /**
         * Tahu SparkplugBPayloadMap to configure metric data types for this
         * edge node or device. Note that this payload is used exclusively as a
         * Sparkplug B spec-compliant configuration for all possible edge node
         * or device metric names, aliases, and data types. This configuration
         * is required to publish proper Sparkplug B NBIRTH and DBIRTH payloads.
         * 
         * The option will be converted to a
         * <code>org.eclipse.tahu.message.model.SparkplugBPayloadMap</code>
         * type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param metricDataTypePayloadMap the value to set
         * @return the dsl builder
         */
        default TahuEdgeEndpointBuilder metricDataTypePayloadMap(String metricDataTypePayloadMap) {
            doSetProperty("metricDataTypePayloadMap", metricDataTypePayloadMap);
            return this;
        }
        /**
         * ID of each device connected to this edge node, as a comma-separated
         * list.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer (edge node only)
         * 
         * @param deviceIds the value to set
         * @return the dsl builder
         */
        default TahuEdgeEndpointBuilder deviceIds(String deviceIds) {
            doSetProperty("deviceIds", deviceIds);
            return this;
        }
        /**
         * Host ID of the primary host application for this edge node.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer (edge node only)
         * 
         * @param primaryHostId the value to set
         * @return the dsl builder
         */
        default TahuEdgeEndpointBuilder primaryHostId(String primaryHostId) {
            doSetProperty("primaryHostId", primaryHostId);
            return this;
        }
        /**
         * Password for MQTT server authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default TahuEdgeEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * SSL configuration for MQTT server connections.
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         * 
         * @param sslContextParameters the value to set
         * @return the dsl builder
         */
        default TahuEdgeEndpointBuilder sslContextParameters(org.apache.camel.support.jsse.SSLContextParameters sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * SSL configuration for MQTT server connections.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         * 
         * @param sslContextParameters the value to set
         * @return the dsl builder
         */
        default TahuEdgeEndpointBuilder sslContextParameters(String sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * Username for MQTT server authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         * 
         * @param username the value to set
         * @return the dsl builder
         */
        default TahuEdgeEndpointBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Tahu Edge Node / Device component.
     */
    public interface AdvancedTahuEdgeEndpointBuilder
            extends
                EndpointProducerBuilder {
        default TahuEdgeEndpointBuilder basic() {
            return (TahuEdgeEndpointBuilder) this;
        }

        /**
         * To use a custom HeaderFilterStrategy to filter headers used as
         * Sparkplug metrics. Default value notice: Defaults to sending all
         * Camel Message headers with name prefixes of CamelTahuMetric.,
         * including those with null values.
         * 
         * The option is a:
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * 
         * Group: producer (advanced)
         * 
         * @param headerFilterStrategy the value to set
         * @return the dsl builder
         */
        default AdvancedTahuEdgeEndpointBuilder headerFilterStrategy(org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * To use a custom HeaderFilterStrategy to filter headers used as
         * Sparkplug metrics. Default value notice: Defaults to sending all
         * Camel Message headers with name prefixes of CamelTahuMetric.,
         * including those with null values.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * 
         * Group: producer (advanced)
         * 
         * @param headerFilterStrategy the value to set
         * @return the dsl builder
         */
        default AdvancedTahuEdgeEndpointBuilder headerFilterStrategy(String headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedTahuEdgeEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedTahuEdgeEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * To use a specific org.eclipse.tahu.message.BdSeqManager
         * implementation to manage edge node birth-death sequence numbers.
         * 
         * The option is a: <code>org.eclipse.tahu.message.BdSeqManager</code>
         * type.
         * 
         * Default: org.apache.camel.component.tahu.CamelBdSeqManager
         * Group: advanced
         * 
         * @param bdSeqManager the value to set
         * @return the dsl builder
         */
        default AdvancedTahuEdgeEndpointBuilder bdSeqManager(org.eclipse.tahu.message.BdSeqManager bdSeqManager) {
            doSetProperty("bdSeqManager", bdSeqManager);
            return this;
        }
        /**
         * To use a specific org.eclipse.tahu.message.BdSeqManager
         * implementation to manage edge node birth-death sequence numbers.
         * 
         * The option will be converted to a
         * <code>org.eclipse.tahu.message.BdSeqManager</code> type.
         * 
         * Default: org.apache.camel.component.tahu.CamelBdSeqManager
         * Group: advanced
         * 
         * @param bdSeqManager the value to set
         * @return the dsl builder
         */
        default AdvancedTahuEdgeEndpointBuilder bdSeqManager(String bdSeqManager) {
            doSetProperty("bdSeqManager", bdSeqManager);
            return this;
        }
        /**
         * Path for Sparkplug B NBIRTH/NDEATH sequence number persistence files.
         * This path will contain files named as -bdSeqNum and must be writable
         * by the executing process' user.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: ${sys:java.io.tmpdir}/CamelTahuTemp
         * Group: advanced
         * 
         * @param bdSeqNumPath the value to set
         * @return the dsl builder
         */
        default AdvancedTahuEdgeEndpointBuilder bdSeqNumPath(String bdSeqNumPath) {
            doSetProperty("bdSeqNumPath", bdSeqNumPath);
            return this;
        }
        /**
         * Flag enabling support for metric aliases.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param useAliases the value to set
         * @return the dsl builder
         */
        default AdvancedTahuEdgeEndpointBuilder useAliases(boolean useAliases) {
            doSetProperty("useAliases", useAliases);
            return this;
        }
        /**
         * Flag enabling support for metric aliases.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param useAliases the value to set
         * @return the dsl builder
         */
        default AdvancedTahuEdgeEndpointBuilder useAliases(String useAliases) {
            doSetProperty("useAliases", useAliases);
            return this;
        }
    }

    public interface TahuEdgeBuilders {
        /**
         * Tahu Edge Node / Device (camel-tahu)
         * Sparkplug B Edge Node and Device support over MQTT using Eclipse Tahu
         * 
         * Category: messaging,iot,monitoring
         * Since: 4.8
         * Maven coordinates: org.apache.camel:camel-tahu
         * 
         * @return the dsl builder for the headers' name.
         */
        default TahuEdgeHeaderNameBuilder tahuEdge() {
            return TahuEdgeHeaderNameBuilder.INSTANCE;
        }
        /**
         * Tahu Edge Node / Device (camel-tahu)
         * Sparkplug B Edge Node and Device support over MQTT using Eclipse Tahu
         * 
         * Category: messaging,iot,monitoring
         * Since: 4.8
         * Maven coordinates: org.apache.camel:camel-tahu
         * 
         * Syntax: <code>tahu-edge:groupId/edgeNode</code>
         * 
         * Path parameter: groupId (required)
         * ID of the group
         * 
         * Path parameter: edgeNode (required)
         * ID of the edge node
         * 
         * Path parameter: deviceId
         * ID of this edge node device
         * 
         * @param path groupId/edgeNode
         * @return the dsl builder
         */
        default TahuEdgeEndpointBuilder tahuEdge(String path) {
            return TahuEdgeEndpointBuilderFactory.endpointBuilder("tahu-edge", path);
        }
        /**
         * Tahu Edge Node / Device (camel-tahu)
         * Sparkplug B Edge Node and Device support over MQTT using Eclipse Tahu
         * 
         * Category: messaging,iot,monitoring
         * Since: 4.8
         * Maven coordinates: org.apache.camel:camel-tahu
         * 
         * Syntax: <code>tahu-edge:groupId/edgeNode</code>
         * 
         * Path parameter: groupId (required)
         * ID of the group
         * 
         * Path parameter: edgeNode (required)
         * ID of the edge node
         * 
         * Path parameter: deviceId
         * ID of this edge node device
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path groupId/edgeNode
         * @return the dsl builder
         */
        default TahuEdgeEndpointBuilder tahuEdge(String componentName, String path) {
            return TahuEdgeEndpointBuilderFactory.endpointBuilder(componentName, path);
        }

    }
    /**
     * The builder of headers' name for the Tahu Edge Node / Device component.
     */
    public static class TahuEdgeHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final TahuEdgeHeaderNameBuilder INSTANCE = new TahuEdgeHeaderNameBuilder();

        /**
         * The Sparkplug message type of the message.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code TahuMessageType}.
         */
        public String tahuMessageType() {
            return "CamelTahuMessageType";
        }
        /**
         * The Sparkplug edge node descriptor string source of a message or
         * metric.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code TahuEdgeNodeDescriptor}.
         */
        public String tahuEdgeNodeDescriptor() {
            return "CamelTahuEdgeNodeDescriptor";
        }
        /**
         * The timestamp of a Sparkplug message.
         * 
         * The option is a: {@code Long} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code TahuMessageTimestamp}.
         */
        public String tahuMessageTimestamp() {
            return "CamelTahuMessageTimestamp";
        }
        /**
         * The UUID of a Sparkplug message.
         * 
         * The option is a: {@code java.util.UUID} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code TahuMessageUUID}.
         */
        public String tahuMessageUUID() {
            return "CamelTahuMessageUUID";
        }
        /**
         * The sequence number of a Sparkplug message.
         * 
         * The option is a: {@code Long} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code TahuMessageSequenceNumber}.
         */
        public String tahuMessageSequenceNumber() {
            return "CamelTahuMessageSequenceNumber";
        }
    }
    static TahuEdgeEndpointBuilder endpointBuilder(String componentName, String path) {
        class TahuEdgeEndpointBuilderImpl extends AbstractEndpointBuilder implements TahuEdgeEndpointBuilder, AdvancedTahuEdgeEndpointBuilder {
            public TahuEdgeEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new TahuEdgeEndpointBuilderImpl(path);
    }
}