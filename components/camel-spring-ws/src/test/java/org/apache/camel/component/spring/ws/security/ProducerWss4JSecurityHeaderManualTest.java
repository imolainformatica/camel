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
package org.apache.camel.component.spring.ws.security;

import net.javacrumbs.calc.model.PlusRequest;
import net.javacrumbs.calc.model.PlusResponse;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.test.spring.junit5.CamelSpringTestSupport;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Disabled("run manually since it requires running sample"
          + " secured ws on j2ee-compliant application server")
public class ProducerWss4JSecurityHeaderManualTest extends CamelSpringTestSupport {

    @Produce
    private ProducerTemplate template;

    private WebServiceTemplate webServiceTemplate;

    @BeforeEach
    public void setupBeans() {
        webServiceTemplate = applicationContext.getBean("webServiceTemplate", WebServiceTemplate.class);
    }

    @Test
    public void testResponseUsingWss4jSampleInterceptorWithoutHeadersRemoved() {

        setRemoveHeaders(false);

        PlusResponse result = createSampleRequestResponsePair();

        assertNotNull(result);
        assertEquals(3, result.getResult());

        assertTrue(ProducerWss4JSecurityHeaderTestInterceptor.isX509DataPresent);

    }

    @Test
    public void testResponseUsingWss4jSampleInterceptorWithHeadersRemoved() {

        setRemoveHeaders(true);

        PlusResponse result = createSampleRequestResponsePair();

        assertNotNull(result);
        assertEquals(3, result.getResult());

        assertTrue(ProducerWss4JSecurityHeaderTestInterceptor.isX509DataPresent);

    }

    private PlusResponse createSampleRequestResponsePair() {
        PlusRequest request = new PlusRequest();
        request.setA(1);
        request.setB(2);

        PlusResponse result = template.requestBody("direct:testHeader", request, PlusResponse.class);

        return result;
    }

    private void setRemoveHeaders(boolean isRemoved) {
        ClientInterceptor[] clientInterceptors = webServiceTemplate.getInterceptors();

        for (ClientInterceptor clientInterceptor : clientInterceptors) {
            if (clientInterceptor instanceof Wss4jSecurityInterceptor wss4jSampleInterceptor) {
                wss4jSampleInterceptor.setRemoveSecurityHeader(isRemoved);
            }
        }
    }

    @Override
    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext(
                "org/apache/camel/component/spring/ws/security/ProducerWss4JSecurityHeaderTest-context.xml");
    }

}
