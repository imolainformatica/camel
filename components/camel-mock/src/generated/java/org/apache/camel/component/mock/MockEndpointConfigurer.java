/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.mock;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointSchemaGeneratorMojo")
@SuppressWarnings("unchecked")
public class MockEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        MockEndpoint target = (MockEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "assertperiod":
        case "assertPeriod": target.setAssertPeriod(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "browselimit":
        case "browseLimit": target.setBrowseLimit(property(camelContext, int.class, value)); return true;
        case "copyonexchange":
        case "copyOnExchange": target.setCopyOnExchange(property(camelContext, boolean.class, value)); return true;
        case "expectedcount":
        case "expectedCount": target.setExpectedCount(property(camelContext, int.class, value)); return true;
        case "failfast":
        case "failFast": target.setFailFast(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "log": target.setLog(property(camelContext, boolean.class, value)); return true;
        case "reportgroup":
        case "reportGroup": target.setReportGroup(property(camelContext, int.class, value)); return true;
        case "resultminimumwaittime":
        case "resultMinimumWaitTime": target.setResultMinimumWaitTime(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "resultwaittime":
        case "resultWaitTime": target.setResultWaitTime(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "retainfirst":
        case "retainFirst": target.setRetainFirst(property(camelContext, int.class, value)); return true;
        case "retainlast":
        case "retainLast": target.setRetainLast(property(camelContext, int.class, value)); return true;
        case "sleepforemptytest":
        case "sleepForEmptyTest": target.setSleepForEmptyTest(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "assertperiod":
        case "assertPeriod": return long.class;
        case "browselimit":
        case "browseLimit": return int.class;
        case "copyonexchange":
        case "copyOnExchange": return boolean.class;
        case "expectedcount":
        case "expectedCount": return int.class;
        case "failfast":
        case "failFast": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "log": return boolean.class;
        case "reportgroup":
        case "reportGroup": return int.class;
        case "resultminimumwaittime":
        case "resultMinimumWaitTime": return long.class;
        case "resultwaittime":
        case "resultWaitTime": return long.class;
        case "retainfirst":
        case "retainFirst": return int.class;
        case "retainlast":
        case "retainLast": return int.class;
        case "sleepforemptytest":
        case "sleepForEmptyTest": return long.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        MockEndpoint target = (MockEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "assertperiod":
        case "assertPeriod": return target.getAssertPeriod();
        case "browselimit":
        case "browseLimit": return target.getBrowseLimit();
        case "copyonexchange":
        case "copyOnExchange": return target.isCopyOnExchange();
        case "expectedcount":
        case "expectedCount": return target.getExpectedCount();
        case "failfast":
        case "failFast": return target.isFailFast();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "log": return target.isLog();
        case "reportgroup":
        case "reportGroup": return target.getReportGroup();
        case "resultminimumwaittime":
        case "resultMinimumWaitTime": return target.getResultMinimumWaitTime();
        case "resultwaittime":
        case "resultWaitTime": return target.getResultWaitTime();
        case "retainfirst":
        case "retainFirst": return target.getRetainFirst();
        case "retainlast":
        case "retainLast": return target.getRetainLast();
        case "sleepforemptytest":
        case "sleepForEmptyTest": return target.getSleepForEmptyTest();
        default: return null;
        }
    }
}

